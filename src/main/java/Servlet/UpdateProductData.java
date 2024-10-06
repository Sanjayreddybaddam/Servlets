package Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/saveupdate")
public class UpdateProductData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("pid"));
		//double price = Double.parseDouble(req.getParameter("pprice"));
		//double discount = Double.parseDouble(req.getParameter("pdiscount"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///newdatabase","root","sanjayreddy@008");
			PreparedStatement pst = con.prepareStatement("delete from product  where id = '"+id+"'" );
			
			pst.setInt(1, id);
		
			
			int a = pst.executeUpdate();
			res.getWriter().println(a+" row deleted");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
