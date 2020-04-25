package Programa;


import java.sql.*;

public class conectar {

     Connection cn;
	  Statement st;
	    
	    public Connection conexion(){
		        
		        try {
		            Class.forName("com.mysql.jdbc.Driver");
		            cn=DriverManager.getConnection("jdbc:mysql://localhost/sabado","root","old"); 
		                          System.out.println("Conectado");
		        } catch (Exception e) {
		            System.out.println("No conectado");
		        }
				return cn;
		    }
	 
	    Statement createStatement() {
	    	
	    	throw new UnsupportedOperationException("No soportado");
	    	
	    	
	    }
	  
	}
