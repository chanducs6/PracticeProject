package com.java_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class databaseConnection {

	public static void main(String[] args) throws Throwable {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");  
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp");  

			while(rs.next()){  
				System.out.println(rs.getInt(1)+" "+rs.getString(2));  
			}  
		} catch (Exception e) {
			System.out.println(e);
			}

	}
}
