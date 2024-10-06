package Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/save2")
public class Servletservice extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		int id = (Integer) req.getAttribute("pid");
		String brand = (String) req.getAttribute("pbrand");
		double price = (Double) req.getAttribute("pprice");
		double discount = (Double) req.getAttribute("pdiscount");
		
		

		Product p = new Product(id, brand,price,discount);
		Data d = new Data();
		try {
			//int a = d.insertdata(p);
			//res.getWriter().println(a +" rows inserted");
			
			//d.deletedata(id);
			//System.out.println("row deleted");
			System.out.println(d.fetchall());
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		

	}

}
