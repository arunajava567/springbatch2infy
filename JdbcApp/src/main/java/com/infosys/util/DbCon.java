package com.infosys.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbCon {

	
	public static Connection getConn()  throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");  //i ,ii,iii ,iv
		Connection con=
				DriverManager.getConnection("jdbc:mysql://localhost:3307/cms","root","root");
		return con;
	}
}
