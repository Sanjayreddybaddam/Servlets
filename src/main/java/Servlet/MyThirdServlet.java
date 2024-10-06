package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/url3")
public class MyThirdServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		pw.println("Bye user");
		
		RequestDispatcher rd = req.getRequestDispatcher("url1");
		rd.forward(req, res);
		
		
	}

}
