package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sendredirect")
public class SendRedirect extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("----from service phase-------");
		
		String email = req.getParameter("useremail");
		String pass = req.getParameter("userpassword");
		
		
		if(!email.isBlank() && !pass.isBlank()) {
			resp.sendRedirect("home.html");
		}
		else {
			resp.sendRedirect("login.html");
		}
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("-----from init phase-----");
	}
	@Override
	public void destroy() {
		System.out.println("-------from destroy phase-------");
	}
	
	

}
