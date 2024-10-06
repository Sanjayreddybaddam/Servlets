package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/url2")
public class MySecondServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		pw.println("Hai user");
		
		RequestDispatcher rd = req.getRequestDispatcher("url3");
		rd.forward(req, res);
		
		
	}

}
