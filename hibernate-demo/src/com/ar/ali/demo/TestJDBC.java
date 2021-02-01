package com.ar.ali.demo;


import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		
		final String JDBC_URL  = "jdbc:mysql://localhost:3306/student_tracker?serverTimezone=UTC";
		final String USER = "student";
		final String PASS = "student";
		
		try {
			
			System.out.println("Connecting to dabatase: "+JDBC_URL);
			Connection myConnection = DriverManager.getConnection(JDBC_URL, USER, PASS);
			
			System.out.println("Connection successful!");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
