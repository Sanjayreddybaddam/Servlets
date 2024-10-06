package Servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/save1")
public class Servletsave extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("pid"));
		String brand = req.getParameter("pbrand");
		double price = Double.parseDouble(req.getParameter("pprice"));
		double discount = Double.parseDouble(req.getParameter("pdiscount"));
		
		
		req.setAttribute("pid",id);
		req.setAttribute("pbrand", brand);
		req.setAttribute("pprice", price);
		req.setAttribute("pdiscount", discount);
		
		req.getRequestDispatcher("save2").forward(req, res);
		
		
	}

}
