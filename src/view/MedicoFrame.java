/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 21/05/2023                     *
 * Fecha de actualización: 21/05/2023                *
 * Descripción: Vista para el registro del medico.
 **************************************************** */

package view;

import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.intellijthemes.FlatGrayIJTheme;
import controller.*;
import entity.Medico;

public class MedicoFrame extends PlantillaRegistroFrame {
    MedicoController controlador;
    private Medico medico;
    
    public MedicoFrame() {
        initComponents();
        setPropios();
        controlador = new MedicoController();
        mostrarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setName("MedicoFrame"); // NOI18N

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

    public static void main(String args[]) {
        try {
//            UIManager.setLookAndFeel(new FlatMacLightLaf());
            FlatGrayIJTheme.setup();
            MedicoFrame.setDefaultLookAndFeelDecorated( true );
            FlatAnimatedLafChange.showSnapshot();
        } catch (Exception ex) {
            System.err.println("Fallo al inicializar el tema.");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicoFrame().setVisible(true);
            }
        });
    }
    
    /**
     * Define propedades que los formularios tienen propiamente y los sustituye
     * por los predefinidos.
     */
    private void setPropios(){        
        this.lbTitulo.setText("Medicos");
        this.lbId.setText("RFC");
        this.tblRegistros.getColumnModel().getColumn(0).setHeaderValue(
                "RFC");
        this.tblRegistros.getTableHeader().repaint();
    }
    
    /**
     * Pobla la tabla con los datos guardados en la lista.
     */
    @Override
    public void mostrarTabla() {
        controlador.mostrarRegistros(modelo);
    }
    
    /**
     * Inserta un médico en el hashmap.
     */
    @Override
    public void guardarDatos(){
        controlador.agregarRegistro(crearMedico());
        mostrarTabla();
    }
    
    /**
     * Recupera un médico y rellena los campos en el form
     */
    @Override
    public void recuperarDatos(){
        medico = controlador.recuperarRegistro(idAct);
        llenarCampos();
    }
    
    /**
     * Elimina un médico del hashmap.
     */
    @Override
    public void elimimnarDatos(){
        controlador.eliminarRegistro(idAct);
        mostrarTabla();
    }
    
    /**
     * Actualiza un médico en el hashmap. Crea un médico desde los campos en el
     * formulario. Utiliza el método crearMedico().
     */
    @Override
    public void actualizarDatos(){
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
        txtDireccion.setText(medico.getDireccion());
        txtTelefono.setText(medico.getNumeroTelefono());
        txtFecha.setText(medico.getFechaNacimiento());
    }


    
    /**
     * Crea la instancia de un médico inicializandolo con la información
     * de los campos
     * @return 
     * Retorna el médico ya instanciado para ser insertado o actuializado en el hashmap
     */
    Medico crearMedico(){
        Medico medicoTemp;
        idAct =txtId.getText();
        medicoTemp = new Medico(idAct, txtNombre.getText(),
                txtFecha.getText(),
                cmbGenero.getItemAt(cmbGenero.getSelectedIndex()),
                txtDireccion.getText(), txtTelefono.getText());
        return medicoTemp;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
