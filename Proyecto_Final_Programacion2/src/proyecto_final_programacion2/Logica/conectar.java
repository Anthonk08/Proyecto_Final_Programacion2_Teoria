
package proyecto_final_programacion2.Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class conectar {
    
    Connection cn;
	  Statement st;
	    
	    public Connection conexion(){
		        
		        try {
		            Class.forName("org.postgresql.Driver");
		            cn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/ProyectoJeovanny","postgres","postgres"); 
		                          System.out.println("Conectado");
		        } catch (ClassNotFoundException | SQLException e) {
		            System.out.println("No conectado");
		        }
				return cn;
		    }
	 
	    Statement createStatement() {
	    	
	    	throw new UnsupportedOperationException("No soportado");
	    	
	    	
	    }
    
}
