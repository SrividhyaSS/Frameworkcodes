package dbconnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class SeleniumSQL { // This is dummy program, sql conn deatils are not a valid one //

	
	@Test
	
	public void SeleniumSQLHandling ()
	{
	     try {
	    	 // This will load the driver
	    	 
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			 System.out.println("Driver Loaded");
			 
			 // Specify the path of the database
			 
			 String dblocation= "C:\\Users\\Desktop\\DB\\FacebookDB1.accdb";
			  // This will connect with Database , getConnection taking three argument
			    //  first argument Test_Oracle is the dsn which you can change as per your system,
			 
			 Connection con=DriverManager.getConnection("jdbc:odbc:AscentAccess;DBQ="+dblocation);            
			 
		       System.out.println("Connected to MYSQL DB created");
		       
		       // This will create statement 
		      
		        Statement smt=con.createStatement();
		        ResultSet rs = smt.executeQuery("select * from seleniumuser"); // package should import from java.sql
		        System.out.println("Query is exeuted");
			
		     // Iterate the resultset now
		        
		        while(rs.next()){
		        	   
		            String uname= rs.getString("username");
		            String pass=  rs.getString("password");
		            String email= rs.getString("email");
		            System.out.println("Uname is "+uname+" password is "+pass+" email id is "+email);
		} 
	     }
	     
	     catch (Exception e) 
	     {
		
			System.out.println(e.getMessage());
		}
	    
	}

	

}
