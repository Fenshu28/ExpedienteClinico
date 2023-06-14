/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 8 jun 2023                        *
 * Fecha de actualización: 8 jun 2023                   *
 * Descripción: Clase para implementación de la interfaz
 * del Login en Model.
 *****************************************************/

package model;

import java.sql.*;
import conexion.Conexion;
import javax.swing.JOptionPane;
import org.mindrot.jbcrypt.BCrypt;

public class LoginModelImpl implements ILoginModel {   
    Conexion con = new Conexion();
    
    @Override
    public boolean iniciarSesion(String usuario, String contraseña) {
        Connection connection = con.getConnection();
        boolean resultado = false;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT contraseña FROM Usuarios WHERE usuario = '" + 
                            usuario + "'");
            
            
                // Obtener datos del resultado
                while (resultSet.next()) {
                    resultado =  !BCrypt.checkpw(contraseña, 
                            resultSet.getString("contraseña"));
                }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, 
                    e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        return resultado;
    }

}
