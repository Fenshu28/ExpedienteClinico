/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 27 may 2023                     *
 * Fecha de actualización: 27 may 2023                *
 * Descripción: Clase para implementar la interfaz
 * del módulo Paciente en Model.
 **************************************************** */

package model;

import conexion.Conexion;
import controller.ExpedienteController;
import entity.DatosConfig;
import entity.Expediente;
import entity.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;

public class PacienteModelImpl implements IPacienteModel{
    Conexion con;
    ExpedienteController expedienteController = new ExpedienteController();
    
    @Override
    public void agregarRegistro(Paciente paciente) {
        con = new Conexion(DatosConfig.getUsuario(),
            DatosConfig.getContraseña());
        Connection conQuery = con.getConnection();
        String consulta = "INSERT INTO Paciente VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement pstmt = conQuery.prepareStatement(consulta);
            // Leer el archivo binario y asignarlo al parámetro de la consulta
            pstmt.setString(1, paciente.getNss());
            pstmt.setString(2, paciente.getNombreCompleto());
            pstmt.setDate(3, new Date(paciente.getFechaNacimiento()
                    .getTime()));
            pstmt.setString(4, paciente.getGenero());
            pstmt.setString(5, paciente.getDireccion());
            pstmt.setString(6, paciente.getNumeroTelefono());
            
            // Ejecutar la consulta
            pstmt.execute();
            
            expedienteController.agregarRegistro(new Expediente(0,
                    paciente,
                    new java.util.Date(), new java.util.Date()));
            
            JOptionPane.showMessageDialog(null,
                    "Se agregó el paciente con exito.",
                    "Agregado exitoso",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "Error de inserción",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        con.disponse();
    }

    @Override
    public void eliminarRegistro(String id) {
        con = new Conexion(DatosConfig.getUsuario(),
            DatosConfig.getContraseña());
        Connection conQuery = con.getConnection();
        
        String consulta = "DELETE from Paciente where NSS = ?";
        try {
            PreparedStatement pstmt = conQuery.prepareStatement(consulta);
            
            pstmt.setString(1, id);
            
            pstmt.execute();
            
            JOptionPane.showMessageDialog(null,
                    "Se elimino el paciente de forma segura.",
                    "Eliminación exitosa",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    ex.getMessage(),
                    "Error de eliminación",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        con.disponse();
    }

    @Override
    public void actualizarRegistro(Paciente paciente) {
        con = new Conexion(DatosConfig.getUsuario(),
            DatosConfig.getContraseña());
        Connection conQuery = con.getConnection();
        
        String consulta = "UPDATE Paciente SET "
                + "NSS = ?, Nombre = ?, FechaNacimiento = ?,Genero = ?,"
                + "Direccion = ?,Telefono = ?"
                + "where NSS = ?";

        try {
            PreparedStatement pstmt = conQuery.prepareStatement(consulta);
            pstmt.setString(1,paciente.getNss());
            pstmt.setString(2, paciente.getNombreCompleto());
            pstmt.setDate(3, new Date(paciente.getFechaNacimiento().getTime()));
            pstmt.setString(4, paciente.getGenero());
            pstmt.setString(5, paciente.getDireccion());
            pstmt.setString(6, paciente.getNumeroTelefono());
            pstmt.setString(7,paciente.getNss());
            
            
            // Ejecutar la consulta
            pstmt.execute();
            
            JOptionPane.showMessageDialog(null,
                    "Se actualizó la información del paciente con exito.",
                    "Actualización exitosa",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "Error de actualización",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        con.disponse();
    }

    @Override
    public void mostrarRegistros(List<Paciente> listaPacientes) {
        con = new Conexion(DatosConfig.getUsuario(),
            DatosConfig.getContraseña());
        Connection conQuery = con.getConnection();
        try {            
            Statement statement = conQuery.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * from Paciente");
                // Obtener datos del resultado
                while (resultSet.next()) {
                    listaPacientes.add(new Paciente(
                            resultSet.getString("NSS"),
                            resultSet.getString("Nombre"), 
                            resultSet.getDate("FechaNacimiento"), 
                            resultSet.getString("Genero"), 
                            resultSet.getString("Direccion"),
                            resultSet.getString("Telefono"))
                    );
                }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
                    e.getMessage(), "Error de consulta",
                    JOptionPane.ERROR_MESSAGE);
        }
        con.disponse();
    }

    @Override
    public Paciente recuperarRegistro(List<Paciente> listaPacientes,String id) {
        for (Paciente pacienteL : listaPacientes) {
            if(pacienteL.getNss().equals(id)){
                return pacienteL;
            }
        }
        return null;        
    }
    
}
