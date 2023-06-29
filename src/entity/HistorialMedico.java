/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 8 jun 2023                        *
 * Fecha de actualización: 8 jun 2023                   *
 * Descripción: Clase para el historial médico.
 *****************************************************/

package entity;

import java.util.List;

public class HistorialMedico {
    private int idHistorial; 
    private Expediente expediente;
    private List<Interaccion> visitas;

    public HistorialMedico() {
    }

    public HistorialMedico(int idHistorial, Expediente expediente,
            List<Interaccion> visitas) {
        this.idHistorial = idHistorial;
        this.expediente = expediente;
        this.visitas = visitas;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public List<Interaccion> getVisitas() {
        return visitas;
    }

    public void setVisitas(List<Interaccion> visitas) {
        this.visitas = visitas;
    }
}
