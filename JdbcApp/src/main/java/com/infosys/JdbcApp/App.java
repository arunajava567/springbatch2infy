package com.infosys.JdbcApp;
import java.sql.*;
class App{
	public static void main(String[] args) throws Exception {
		//Connection con=null;
		Statement st=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
//1.7
		try(Connection con=
DriverManager.getConnection("jdbc:mysql://localhost:3307/cms","root","root")
		) 
{
	 
	 st=con.createStatement();
	//st.executeUpdate("create table order123(id int, name varchar(20))" );
	//st.executeUpdate("insert into order123 values(2,'ram')");
	//st.executeUpdate("insert into order123 values(3,'kiran')");
	st.executeUpdate("insert into order123 values(5,'raj')");
	st.executeUpdate("insert into order123 values(6,'raj')");
	
	//st.executeUpdate("delete from order123 where id=2");
	//st.executeUpdate("update order123 set name='raj kumar' where id=4");
	
	System.out.println(" table data=====");
	ResultSet rs=st.executeQuery("select * from order123");
	while(rs.next()) {
		System.out.println(rs.getString(1)+"   "+rs.getString(2));
	}
		
	
	//System.out.println("row  created..");
}  catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
}
}