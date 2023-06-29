/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 9 jun 2023                     *
 * Fecha de actualización: 9 jun 2023                *
 * Descripción: Clase para el crud de los usuarios.
 *****************************************************/

package model;

import entity.Usuario;
import javax.swing.table.DefaultTableModel;
import conexion.Conexion;
import entity.DatosConfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UsuarioModelImpl implements IUsuarioModel {
    Conexion con;
    
    @Override
    public void agregarRegistro(Usuario usuario) {
        con = new Conexion(DatosConfig.getUsuario(),
            DatosConfig.getContraseña());
        Connection conQuery = con.getConnection();
        String consulta = "INSERT INTO Usuarios VALUES (DEFAULT,?,?,?,?)";

        try {
            PreparedStatement pstmt = conQuery.prepareStatement(consulta);
            // Leer el archivo binario y asignarlo al parámetro de la consulta
            pstmt.setString(1, usuario.getUsuario());
//            pstmt.setString(2, BCrypt.hashpw(
//                    usuario.getContraseña(),BCrypt.gensalt()));
            pstmt.setString(3, usuario.getNombre());
            pstmt.setNull(4, java.sql.Types.VARCHAR);
            
            // Ejecutar la consulta
            pstmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "Error de inserción",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        con.disponse();
    }

    @Override
    public void eliminarRegistro(int id) {
        Connection conQuery = con.getConnection();
        String consulta = "DELETE idUsuario from Usuarios where idUsuario = " + id;
        try {
            Statement statement = conQuery.createStatement();
            statement.executeQuery(consulta);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    ex.getMessage(),
                    "Error de inserción",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        Connection conQuery = con.getConnection();
        String consulta = "UPDATE Usuarios SET "
                + "usuario = ?, contraseña = ?, nombre = ? "
                + "where idUsuario = ?";

        try {
            PreparedStatement pstmt = conQuery.prepareStatement(consulta);
            // Leer el archivo binario y asignarlo al parámetro de la consulta
            pstmt.setString(1, usuario.getUsuario());
//            pstmt.setString(2, BCrypt.hashpw(
//                    usuario.getContraseña(),BCrypt.gensalt()));
            pstmt.setString(3, usuario.getNombre());
            pstmt.setInt(4, usuario.getId());
            
            // Ejecutar la consulta
            pstmt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "Error de inserción",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void mostrarRegistros(DefaultTableModel modeloTabla) {
        Connection connection = con.getConnection();
        
        try {
            modeloTabla.setRowCount(0);
            Object[] fila = new Object[3];
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT idUsuario,nombre,usuario FROM Usuarios");
                // Obtener datos del resultado
                while (resultSet.next()) {
                    fila[0] = resultSet.getInt("idUsuario");
                    fila[1] = resultSet.getString("nombre");
                    fila[2] = resultSet.getString("usuario");
                    modeloTabla.addRow(fila);
                }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, 
                    e.getMessage(), "Error",
                    JOptionPane.ERROR);
        }
    }

    @Override
    public Usuario recuperarRegistro(int id) {
        Usuario usTemp = null ;
        Connection connection = con.getConnection();
        
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM Usuarios");
                // Obtener datos del resultado
                while (resultSet.next()) {
                    usTemp = new Usuario(resultSet.getInt("idUsuario"),
                    resultSet.getString("usuario") ,"" , 
                    resultSet.getString("nombre"));
                }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, 
                    e.getMessage(), "Error",
                    JOptionPane.ERROR);
        }
        return usTemp;
    }

}
