/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 27 may 2023                     *
 * Fecha de actualización: 27 may 2023                *
 * Descripción: Clase para implementar la interfaz del
 * módulo Médico en Service.
 **************************************************** */
package model;

import conexion.Conexion;
import entity.DatosConfig;
import entity.Medico;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;

public class MedicoModelImpl implements IMedicoModel {

    Conexion con;

    @Override
    public void agregarRegistro(Medico medico) {
        con = new Conexion(DatosConfig.getUsuario(),
                DatosConfig.getContraseña());
        Connection conQuery = con.getConnection();
        String consulta = "INSERT INTO Medico VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement pstmt = conQuery.prepareStatement(consulta);
            // Leer el archivo binario y asignarlo al parámetro de la consulta
            pstmt.setString(1, medico.getRFC());
            pstmt.setString(2, medico.getNombreCompleto());
            pstmt.setDate(3, new Date(medico.getFechaNacimiento()
                    .getTime()));
            pstmt.setString(4, medico.getGenero());
            pstmt.setString(5, medico.getDireccion());
            pstmt.setString(6, medico.getNumeroTelefono());
            pstmt.setString(7, medico.getEspecialidad());

            // Ejecutar la consulta
            pstmt.execute();
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

        String consulta = "DELETE from Medico where RFC = ?";
        try {
            PreparedStatement pstmt = conQuery.prepareStatement(consulta);

            pstmt.setString(1, id);

            pstmt.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    ex.getMessage(),
                    "Error de eliminación",
                    JOptionPane.ERROR_MESSAGE);
        }

        con.disponse();
    }

    @Override
    public void actualizarRegistro(Medico medico) {
        con = new Conexion(DatosConfig.getUsuario(),
                DatosConfig.getContraseña());
        Connection conQuery = con.getConnection();

        String consulta = "UPDATE Medico SET "
                + "RFC = ?, Nombre = ?, FechaNacimiento = ?,Genero = ?,"
                + "Direccion = ?,Telefono = ?, Especialidad = ? "
                + "where RFC = ?";

        try {
            PreparedStatement pstmt = conQuery.prepareStatement(consulta);
            pstmt.setString(1, medico.getRFC());
            pstmt.setString(2, medico.getNombreCompleto());
            pstmt.setDate(3, new Date(medico.getFechaNacimiento().getTime()));
            pstmt.setString(4, medico.getGenero());
            pstmt.setString(5, medico.getDireccion());
            pstmt.setString(6, medico.getNumeroTelefono());
            pstmt.setString(7, medico.getEspecialidad());
            pstmt.setString(8, medico.getRFC());

            // Ejecutar la consulta
            pstmt.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage(),
                    "Error de actualización",
                    JOptionPane.ERROR_MESSAGE);
        }

        con.disponse();
    }

    @Override
    public void mostrarRegistros(List<Medico> listaMedicos) {
        con = new Conexion(DatosConfig.getUsuario(),
                DatosConfig.getContraseña());
        Connection conQuery = con.getConnection();
        try {
            Statement statement = conQuery.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * from Medico");
            // Obtener datos del resultado
            while (resultSet.next()) {
                listaMedicos.add(new Medico(
                        resultSet.getString("RFC"),
                        resultSet.getString("Nombre"),
                        resultSet.getDate("FechaNacimiento"),
                        resultSet.getString("Genero"),
                        resultSet.getString("Direccion"),
                        resultSet.getString("Telefono"),
                        resultSet.getString("Especialidad"))
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
    public Medico recuperarRegistro(List<Medico> listaMedicos, String id) {
        for (Medico medicoL : listaMedicos) {
            if (medicoL.getRFC().equals(id)) {
                return medicoL;
            }
        }
        return null;
    }

}
