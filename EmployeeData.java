import java.sql.*;

public class EmployeeData {
	
  public static Connection connectdata(){ 
	  try{  
	  Class.forName("com.mysql.jdbc.Driver");  
	  Connection con=DriverManager.getConnection(  
	  "jdbc:mysql://localhost:3306/test","root","");   
	  return con;
	  }
	  catch(Exception e)
	  { System.out.println(e);}
	   return null;  
	 }  
	  }  
	  
