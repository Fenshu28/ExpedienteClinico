/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 8 jun 2023                        *
 * Fecha de actualización: 8 jun 2023                   *
 * Descripción: Clase para la conexion con la base de
 * datos.
 **************************************************** */
package conexion;

import entity.DatosConfig;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/HistorialClinico";
    private boolean estado = false;
    private Connection connection;
    /**
     * Crea una conexión entre la aplicación y la base de datos.
     * @param DB_USER Usuario de la base de datos.
     * @param DB_PASSWORD Contraseña de la base de datos.
     */
    public Conexion(String DB_USER, String DB_PASSWORD) {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER,
                    DB_PASSWORD);
            estado = true;
        } catch (SQLException e) {
            if (e.getErrorCode() == 1045) {
                DatosConfig.setIntentos(1);
                JOptionPane.showMessageDialog(null,
                        "El usuario y contraseña no son correctos.\n"
                        + "Le quedan " + DatosConfig.getIntentos()
                        + " intentos",
                        "Acceso denegado",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        e.getErrorCode() + ": " + e.getMessage(),
                        "Error con BD", JOptionPane.ERROR_MESSAGE);
            }
            estado = false;
        }
    }

    public void disponse() {
        if (estado) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public boolean getEstado() {
        return estado;
    }

}
