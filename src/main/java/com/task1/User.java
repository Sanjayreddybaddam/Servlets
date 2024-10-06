package com.task1;

import java.sql.*;

public class User {
	private String id;
	private String name;
	private String email;

	public User() {

	}

	public String getId() {
		return id;
	}

	public void setId() {
		this.id = id1();
	}

	private String id1() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql:///newdatabase", "root", "sanjayreddy@008");
			Statement st = con.createStatement();
			ResultSet rt = st.executeQuery("select * from user");

			String lastid = null;
			while (rt.next()) {
				lastid = rt.getString(1);
			}
			if (lastid == null) {
				return "us_0001";
			} else {
				String last = lastid.substring(3);
				int num = Integer.parseInt(last);
				int count_num = noofdig(num);
				String nextid = "";
				for (int i = 1; i <= 4 - count_num; i++) {
					nextid = nextid + '0';
				}
				num = num + 1;
				nextid = nextid + num;
				return "us_" + nextid;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	private int noofdig(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num = num / 10;
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
