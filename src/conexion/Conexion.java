/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 8 jun 2023                        *
 * Fecha de actualización: 8 jun 2023                   *
 * Descripción: Clase para
 **************************************************** */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/HistorialClinico";
    private static final String DB_USER = "Hospital";
    private static final String DB_PASSWORD = "Ari1505*";
    private Connection connection;

    public Conexion() {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//            JOptionPane.showMessageDialog(null,
//                    "Conexión con la BD exitosa.", "Completado", 
//                    JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(), "Error con BD", 
                    JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
    
}
