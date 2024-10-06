package com.task1;
import java.sql.*;

public class Data {
	public static void insert(Object o)  {
		if(o instanceof User) {
			User u = (User)o;
			
			try {
				Connection con  = DriverManager.getConnection("jdbc:mysql:///newdatabase","root","sanjayreddy@008");
				PreparedStatement pst = con.prepareStatement("insert into user values(?,?,?)");
				pst.setString(1,u.getId() );
				pst.setString(2, u.getName());
				pst.setString(3, u.getEmail());
				
				int a = pst.executeUpdate();
				System.out.println(a+"row inserted");
				con.close();
				
			} catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
		}
	}
	

}
