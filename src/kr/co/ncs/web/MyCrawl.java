package kr.co.ncs.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/mycrawl")
public class MyCrawl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		try {
			HttpSession session = request.getSession();
			String user_name = session.getAttribute("user_name").toString();
			// response.getWriter().append("user_name");
			response.getWriter().append("<table><tr><td>hwang si yeon</td><td>01033334444</td></tr></table>");
			
		} catch (Exception e) {
			response.getWriter().append("You have no authority for this page.");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
