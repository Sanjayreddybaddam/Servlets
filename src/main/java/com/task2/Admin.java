package com.task2;
import java.sql.*;



public class Admin {
	private String id;
	private String name;
	private String email;
	
	public Admin() {
		
	}
	
	public String getId() {
		return id;		
	}
	
	public void setId() throws Exception{
		this.id=id1();
	}
	
	private String id1() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql:///newdatabase","root","sanjayreddy@008");
		
		Statement st = con.createStatement();
		ResultSet rt = st.executeQuery("select * from admin");
		
		int count = 0;
		String lastid = null;
		while(rt.next()) {
			lastid = rt.getString(1);
		}
		if(lastid==null) {
			return "ad_0001";
		}
		else {
			String last = lastid.substring(3);
			int num = Integer.parseInt(last);
			int count_num = noofdig(num);
			String nextid = "";
			for(int i=1;i<=4-count_num;i++) {
				nextid = nextid+'0';
			}
			num +=1;
			nextid += num;
			return "ad_"+nextid;
					
		}
	}
	
	private int noofdig(int num) {
		int count = 0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		return count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
