/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 26 jun 2023                        *
 * Fecha de actualización: 26 jun 2023                   *
 * Descripción: Clase para
 **************************************************** */
package model;

import conexion.Conexion;
import entity.DatosConfig;
import entity.Tratamiento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class TratamientoModelImpl implements ITratamientoModel {
    Conexion con;
    
    @Override
    public void agregarRegistro(List<Tratamiento> tratamiento) {
        con = new Conexion(DatosConfig.getUsuario(),
            DatosConfig.getContraseña());
        Connection conQuery = con.getConnection();
        String consulta = "INSERT INTO Tratamiento VALUES ";
        
        try {
            Statement stmt = conQuery.createStatement();
            int i = 0;
            for (Tratamiento tratamientoI : tratamiento) {
                consulta += "("+tratamientoI.getIdConsulta()+","
                        +tratamientoI.getIdFarmaco()+",'"
                        +tratamientoI.getDosis()+"','"
                        +tratamientoI.getFrecuencia()+"','"
                        +tratamientoI.getDuracion()+"')";
                if(i<tratamiento.size())
                    consulta += ",";
            }
                        
            // Ejecutar la consulta
            stmt.execute(consulta);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "Error de inserción",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        con.disponse();
    }

    @Override
    public void mostrarRegistros(List<Tratamiento> tratamiento) {
        con = new Conexion(DatosConfig.getUsuario(),
            DatosConfig.getContraseña());
        Connection conQuery = con.getConnection();
        try {            
            Statement statement = conQuery.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "select * from Tratamiento");
                // Obtener datos del resultado
                while (resultSet.next()) {
                    tratamiento.add(
                            new Tratamiento(
                                resultSet.getInt("ID_Consulta"),
                                resultSet.getInt("ID_Farmaco"), 
                                resultSet.getString("Dosis"), 
                                resultSet.getString("Frecuencia"), 
                                resultSet.getString("Duracion"))
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
    public Tratamiento recuperarRegistro(List<Tratamiento> tratamiento,
            int idConsultal, int idFarmaco) {
        for (Tratamiento tratamientoI : tratamiento) {
            if(tratamientoI.getIdConsulta()==idConsultal && 
                    tratamientoI.getIdConsulta()==idFarmaco){
                return tratamientoI;
            }
        }
        return null;
    }

}
