package com.infy.JdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class App 
{  public static void main( String[] args ) throws SQLException,ClassNotFoundException
    { //step1 
    	Class.forName("com.mysql.cj.jdbc.Driver");  //i ,ii,iii ,iv
    	//2
    	Connection con=
    			DriverManager.getConnection("jdbc:mysql://localhost:3306/cms","root","pass@word1");
    	//3
    	Statement st=con.createStatement();
    	//st.executeUpdate("create table order123(id int, name varchar(20))" );
    	//st.executeUpdate("insert into order123 values(2,'ram')");
    	//st.executeUpdate("insert into order123 values(3,'kiran')");
    	//st.executeUpdate("insert into order123 values(4,'raj')");
    	st.executeUpdate("delete from order123 where id=2");
    	st.executeUpdate("update order123 set name='raj kumar' where id=4");
    	
    	
    	System.out.println("row  created..");
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
