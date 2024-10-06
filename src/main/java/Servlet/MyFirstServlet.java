package Servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/url1")
public class MyFirstServlet extends GenericServlet {


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		pw.print("Hello user");
		
		RequestDispatcher rd = req.getRequestDispatcher("url2");
		rd.forward(req, res);
		
	}
}
