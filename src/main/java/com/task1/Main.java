package com.task1;

public class Main {
	public static void main(String[] args) throws Exception {
		User u = new User();
		u.setEmail("sanjay123@gmail.com");
		u.setId();
		u.setName("allen");
		Data d = new Data();
		d.insert(u);
	
	}

}
