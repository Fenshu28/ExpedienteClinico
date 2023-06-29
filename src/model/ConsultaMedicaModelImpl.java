/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 25 jun 2023                        *
 * Fecha de actualización: 25 jun 2023                   *
 * Descripción: Clase para 
 *****************************************************/

package model;

import conexion.Conexion;
import entity.ConsultaMedica;
import entity.DatosConfig;
import entity.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class ConsultaMedicaModelImpl implements IConsultaMedicaModel {
    Conexion con;
    
    @Override
    public void agregarRegistro(ConsultaMedica consultaMedica) {
        con = new Conexion(DatosConfig.getUsuario(),
            DatosConfig.getContraseña());
        Connection conQuery = con.getConnection();
        String consulta = "INSERT INTO ConsutaMedica VALUES (DEFAULT,?,?,?,?,?,?)";        

        try {
            PreparedStatement pstmt = conQuery.prepareStatement(consulta);
            
            pstmt.setInt(1, consultaMedica.getExpediente().getIdExpediente());
            pstmt.setString(2, consultaMedica.getMedico().getRFC());
            pstmt.setInt(3, consultaMedica.getDiagnostico().getId());
            pstmt.setString(4, consultaMedica.getSintomas());
            pstmt.setDate(5, new Date(consultaMedica.getFecha()
                    .getTime()));            
            pstmt.setString(6, consultaMedica.getNotasAdicionales());
                        
            // Ejecutar la consulta
            pstmt.execute();
            
            JOptionPane.showMessageDialog(null,
                    "Se agregó la consulta medica con exito.",
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
    public ConsultaMedica recuperarRegistro(int idConsulta) {
        return null;
    }

    @Override
    public int newKey() {
        int key = 0;
        con = new Conexion(DatosConfig.getUsuario(),
            DatosConfig.getContraseña());
        Connection conQuery = con.getConnection();
        try {            
            Statement statement = conQuery.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT count(*) as k FROM ConsultaMedica;");
                // Obtener datos del resultado
                while (resultSet.next()) {
                   key = resultSet.getInt("k");
                }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
                    e.getMessage(), "Error de consulta",
                    JOptionPane.ERROR_MESSAGE);
        }
        con.disponse();
        return key;
    }

}
