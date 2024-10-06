package com.task2;
import java.sql.*;

public class Data {
	public static void insert(Object o) {
		if(o instanceof Admin) {
			Admin a = (Admin)o;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql:///newdatabase","root","sanjayreddy@008");
				PreparedStatement pst = con.prepareStatement("insert into admin values(?,?,?)");
				pst.setString(1, a.getId());
				pst.setString(2, a.getName());
				pst.setString(3, a.getEmail());
				
				int b = pst.executeUpdate();
				System.out.println(b+" row inserted");
				con.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
