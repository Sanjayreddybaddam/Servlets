package Servlet;

import java.sql.*;
import java.util.*;
public class Data {
	Connection getconnection()throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql:///newdatabase","root","sanjayreddy@008");
	}
	
	int insertdata(Product p) throws ClassNotFoundException,SQLException{
		Connection con = getconnection();
		PreparedStatement pst = con.prepareStatement("insert into product values(?,?,?,?);");
		pst.setInt(1,p.getId());
		pst.setString(2, p.getBrand());
		pst.setDouble(3,p.getPrice() );
		pst.setDouble(4, p.getDiscount());
		
		
		return pst.executeUpdate();
	}
	
	Product fetch (int id) throws ClassNotFoundException,SQLException{
		Connection con = getconnection();
		
		PreparedStatement  pst = con.prepareStatement("select * from product where id=?");
		pst.setInt(1, id);
		ResultSet rs = pst.executeQuery();
		Product p =null;
		
		while(rs.next()) {
			p=new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4));
		}
		
		return p;
	}
	
	int deletedata(int id) throws ClassNotFoundException,SQLException{
		Connection con = getconnection();
		PreparedStatement pst = con.prepareStatement("delete from product where id=?");
		pst.setInt(1, id);
		
		return pst.executeUpdate();
	}
	
	List<Product> fetchall() throws ClassNotFoundException ,SQLException {
		Connection con = getconnection();
		PreparedStatement pst = con.prepareStatement("select * from product");
		ResultSet rs=pst.executeQuery();
		
		List<Product> list = new ArrayList<Product>();
		
		while(rs.next()) {
			Product p = new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4));
			list.add(p);
		}
		
		return list;
	}

}

class Product{//DTO CLASS
	private int id;
	private String brand;
	private double price;
	private double discount;
	
	public Product(int id,String brand ,double price,double discount) {
		this.id=id;
		this.brand=brand;
		this.price=price;
		this.discount=discount;	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
		
	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double discount) {
		this.discount=discount;
	}
	

	public String toString() {
		return "Product[id= "+id+" brand="+brand+" price="+price+" discount="+discount+"]\n";
	}
	
}


//class ORM{
	//public static void main(String[] args)throws ClassNotFoundException,SQLException {
		
		//Product p1 = new Product(2,"ITC",100.0,12.5);
//		Product p2 = new Product(3,"NESTLE",100.0,12.5);
//		Product p3 = new Product(4,"CADBERY",100.0,12.5);
//		Data d1 = new Data();
		//insert into database
		//int a = d1.insertdata(p1);
		//System.out.println(a);
		//int b = d1.insertdata(p2);
		//System.out.println(b);
		//int c = d1.insertdata(p3);
		//System.out.println(c);
		
		
		//delete
		//int d = d1.deletedata(3);
		//System.out.println(d);
		
		// fetch
		//System.out.println(d1.fetch(2));
		
		//fetchall
		//System.out.println(d1.fetchall());
	 
//	}
//}

