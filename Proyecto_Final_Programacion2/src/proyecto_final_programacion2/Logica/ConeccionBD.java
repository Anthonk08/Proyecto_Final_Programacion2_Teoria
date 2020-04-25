package proyecto_final_programacion2.Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConeccionBD {

    Connection connection;
    String url = "jdbc:postgresql://localhost:5432/ProyectoJeovanny";
    String user = "postgres";
    String password = "postgres";

    public Connection dbconeccion() {

        try {

            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {
            e.getMessage();
        }

        try {
            connection = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Connectado");

        } catch (SQLException ex) {
            Logger.getAnonymousLogger(ConeccionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al conectarse");
        }

        return connection;
    }

    public static void main(String[] args) {
        ConeccionBD db = new ConeccionBD();
        db.dbconeccion();
    }

}
