package daoImplimentation;

import java.sql.*;

public class JdbcConnection {
	
	public static Connection getConnection()
	{
		try
		{
		  Class.forName("com.mysql.jdbc.Driver");

	       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bugtrackingsystem?useSSL=false",
				"root","Nirbhay11");
	       
	       if(con!=null)
	       {
	    	   System.out.println("connection successful");
	       }
	       else
	       {
	    	   System.out.println("connection not successful"); 
	       }
	       
	       return con;
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	    
		return null;
		   
	}
	
	public static void closeConnection(Connection con)
	{
		if(con!=null)
		{
			try
			{
			  con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	
}