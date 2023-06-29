/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 21/05/2023                     *
 * Fecha de actualización: 21/05/2023                *
 * Descripción: Vista para el registro del medico.
 **************************************************** */

package view;

import controller.MedicoController;
import entity.Medico;
import java.util.ArrayList;
import java.util.List;

public class MedicoFrame extends PlantillaRegistroFrame {
    MedicoController controlador;
    private Medico medico;
    private List<Medico> listaMedicos;

    public MedicoFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
//        initComponents();
        setPropios();
        controlador = new MedicoController();
        mostrarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MEdicos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Define propedades que los formularios tienen propiamente y los sustituye
     * por los predefinidos.
     */
    private void setPropios() {
        this.lbTitulo.setText("Medicos");
        this.lbId.setText("RFC");
        this.tblRegistros.getColumnModel().getColumn(0).setHeaderValue(
                "RFC");
        this.tblRegistros.getTableHeader().repaint();
        this.cmbEspecialidad.setVisible(true);
        this.lbEspecialidad.setVisible(true);
    }
    
    /**
     * Pobla la tabla con los datos guardados en la lista.
     */
    @Override
    public void mostrarTabla() {
        listaMedicos = new ArrayList<>();
        controlador.mostrarRegistros(listaMedicos);
        if (!listaMedicos.isEmpty()) {
            modelo.setRowCount(0);
            for (Medico medicoL : listaMedicos) {
                Object fila[] = new Object[3];

                fila[0] = medicoL.getRFC();
                fila[1] = medicoL.getNombreCompleto();
                fila[2] = medicoL.getGenero();
                modelo.addRow(fila);
            }
        }
    }

    /**
     * Inserta un médico en el hashmap.
     */
    @Override
    public void guardarDatos() {
        controlador.agregarRegistro(crearMedico());
        mostrarTabla();
    }

    /**
     * Recupera un médico y rellena los campos en el form
     */
    @Override
    public void recuperarDatos() {
        medico = controlador.recuperarRegistro(listaMedicos, idAct);
        llenarCampos();
    }

    /**
     * Elimina un médico del hashmap.
     */
    @Override
    public void elimimnarDatos() {
        controlador.eliminarRegistro(idAct);
        mostrarTabla();
    }

    /**
     * Actualiza un médico en el hashmap. Crea un médico desde los campos en el
     * formulario. Utiliza el método crearMedico().
     */
    @Override
    public void actualizarDatos() {
        controlador.actualizarRegistro(crearMedico());
        mostrarTabla();
    }

    /**
     * Pobla de datos los campos del formulario con información obtenida del
     * médico recien extraido.
     */
    @Override
    public void llenarCampos() {
        txtId.setText(medico.getRFC());
        txtNombre.setText(medico.getNombreCompleto());
        cmbEspecialidad.setSelectedItem(medico.getEspecialidad());
        txtDireccion.setText(medico.getDireccion());
        cmbGenero.setSelectedItem(medico.getGenero());
        txtTelefono.setText(medico.getNumeroTelefono());
        txtFecha.setDate(medico.getFechaNacimiento());
    }

    /**
     * Crea la instancia de un médico inicializandolo con la información de los
     * campos
     *
     * @return Retorna el médico ya instanciado para ser insertado o
     * actuializado en el hashmap
     */
    Medico crearMedico() {
        Medico medicoTemp;
        idAct = txtId.getText();
        medicoTemp = new Medico(idAct, txtNombre.getText(),
                txtFecha.getDate(),
                cmbGenero.getItemAt(cmbGenero.getSelectedIndex()),
                txtDireccion.getText(), txtTelefono.getText(),
                cmbEspecialidad.getItemAt(
                        cmbEspecialidad.getSelectedIndex()));
        return medicoTemp;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
