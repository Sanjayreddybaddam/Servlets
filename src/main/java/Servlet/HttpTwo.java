package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/httptwo")
public class HttpTwo extends HttpServlet {
	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String name = (String)req.getAttribute("name");
//		
//		resp.getWriter().println("user name is: "+name);
//	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = (String)req.getAttribute("name");
		
		resp.getWriter().println("user name is: "+name);
		
		req.getRequestDispatcher("httpthree").forward(req, resp);
	}

}
