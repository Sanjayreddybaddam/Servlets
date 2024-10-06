package com.task2;

public class Main {
	public static void main(String[] args) throws Exception {
		Admin a = new Admin();
		a.setEmail("allen123@gmail.com");
		a.setId();
		a.setName("Smith");
		Data d = new Data();
		d.insert(a);
		
		
	}

}
