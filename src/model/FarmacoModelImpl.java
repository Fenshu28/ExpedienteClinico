/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 26 jun 2023                        *
 * Fecha de actualización: 26 jun 2023                   *
 * Descripción: Clase para implementar la interface de Farmaco
 * en model.
 *****************************************************/

package model;

import conexion.Conexion;
import entity.DatosConfig;
import entity.Farmaco;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;

public class FarmacoModelImpl implements IFarmacoModel {
    Conexion con;
    
    @Override
    public void mostrarRegistros(List<Farmaco> listaFarmacos) {
        con = new Conexion(DatosConfig.getUsuario(),
            DatosConfig.getContraseña());
        Connection conQuery = con.getConnection();
        
        try {            
            Statement statement = conQuery.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * from Farmaco");
                // Obtener datos del resultado
                while (resultSet.next()) {
                    listaFarmacos.add(new Farmaco(
                            resultSet.getInt("id"),
                            resultSet.getString(
                                    "principio_activo"),
                            resultSet.getString(
                                    "marca_registrada"),
                            resultSet.getNString("forma"),
                            resultSet.getNString(
                                    "presentacion")
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
    public Farmaco recuperarRegistro(List<Farmaco> listaFarmacos, int id) {
        for (Farmaco farmacoL : listaFarmacos) {
            if(farmacoL.getId() == id){
                return farmacoL;
            }
        }
        return null;
    }
}
