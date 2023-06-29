/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 26 jun 2023                        *
 * Fecha de actualización: 26 jun 2023                   *
 * Descripción: Clase para 
 *****************************************************/

package model;

import conexion.Conexion;
import entity.DatosConfig;
import entity.Diagnostico;
import entity.Diagnostico;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;



public class DiagnosticoModelImpl implements IDiagnosticoModel {
    Conexion con;
    
    @Override
    public void mostrarRegistros(List<Diagnostico> listaDiagnosticos) {
        con = new Conexion(DatosConfig.getUsuario(),
            DatosConfig.getContraseña());
        Connection conQuery = con.getConnection();
        
        try {            
            Statement statement = conQuery.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * from Diagnostico");
                // Obtener datos del resultado
                while (resultSet.next()) {
                    listaDiagnosticos.add(new Diagnostico(
                            resultSet.getInt("id"),
                            resultSet.getString("codigo"),
                            resultSet.getString("descripcion")
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
    public Diagnostico recuperarRegistro(List<Diagnostico> listaDiagnosticos, int id) {
        for (Diagnostico diagnosticoL : listaDiagnosticos) {
            if(diagnosticoL.getId() == id){
                return diagnosticoL;
            }
        }
        return null;
    }

}
