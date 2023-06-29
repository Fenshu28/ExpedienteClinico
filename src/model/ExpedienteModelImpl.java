/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 26 jun 2023                        *
 * Fecha de actualización: 26 jun 2023                   *
 * Descripción: Clase para 
 *****************************************************/

package model;

import conexion.Conexion;
import entity.DatosConfig;
import entity.Expediente;
import entity.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;


public class ExpedienteModelImpl implements IExpedienteModelo{
    Conexion con;
    
    @Override
    public void agregarRegistro(Expediente expediente) {
        con = new Conexion(DatosConfig.getUsuario(),
            DatosConfig.getContraseña());
        Connection conQuery = con.getConnection();
        String consulta = "INSERT INTO Expediente VALUES (DEFAULT,?,?,?)";

        try {
            PreparedStatement pstmt = conQuery.prepareStatement(consulta);
            // Leer el archivo binario y asignarlo al parámetro de la consulta
            pstmt.setString(1, expediente.getPaciente().getNss());
            pstmt.setDate(2, new Date(expediente.getFechaCreacion()
                    .getTime()));
            pstmt.setDate(3, new Date(expediente.getFechaActualizacion()
                    .getTime()));            
            // Ejecutar la consulta
            pstmt.execute();
            
            JOptionPane.showMessageDialog(null,
                    "Se agregó el expediente con exito.",
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
    public void actualizarRegistro(Expediente expediente) {
        con = new Conexion(DatosConfig.getUsuario(),
            DatosConfig.getContraseña());
        Connection conQuery = con.getConnection();
        
        String consulta = "UPDATE Expediente SET "
                + "NSS_Paciente = ?, FechaCreacion = ?, FechaUltimaActual = ? "
                + "where ID_Expediente = ?";

        try {
            PreparedStatement pstmt = conQuery.prepareStatement(consulta);
            pstmt.setString(1,expediente.getPaciente().getNss());
            pstmt.setDate(2 , new Date(expediente.getFechaCreacion().getTime()));
            pstmt.setDate(3, new Date(expediente.getFechaActualizacion().getTime()));
            pstmt.setInt(4,expediente.getIdExpediente());
            
            // Ejecutar la consulta
            pstmt.execute();
            
            JOptionPane.showMessageDialog(null,
                    "Se actualizó la información del expediente con exito.",
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
    public void mostrarRegistros(List<Expediente> listaExpedientes) {
        con = new Conexion(DatosConfig.getUsuario(),
            DatosConfig.getContraseña());
        Connection conQuery = con.getConnection();
        try {            
            Statement statement = conQuery.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM Expediente JOIN Paciente "
                            + "ON Expediente.NSS_Paciente = Paciente.NSS");
                // Obtener datos del resultado
                while (resultSet.next()) {
                    listaExpedientes.add(new Expediente(
                            resultSet.getInt("ID_Expediente"),
                            new Paciente(
                                resultSet.getString("NSS"),
                                resultSet.getString("Nombre"), 
                                resultSet.getDate("FechaNacimiento"), 
                                resultSet.getString("Genero"), 
                                resultSet.getString("Direccion"),
                                resultSet.getString("Telefono")),
                            resultSet.getDate("FechaCreacion"), 
                            resultSet.getDate("FechaCreacion")
                        ));
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
    public Expediente recuperarRegistro(List<Expediente> listaExpedientes, int id) {
        for (Expediente expedienteL : listaExpedientes) {
            if(expedienteL.getIdExpediente() == id){
                return expedienteL;
            }
        }
        return null;
    }
}
