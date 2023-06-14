/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 9 jun 2023                        *
 * Fecha de actualización: 9 jun 2023                   *
 * Descripción: Clase para los medicamentos recetados.
 *****************************************************/

package entity;

public class MedicamentoRecetado {
    private int idReceta;
    private Expediente expediente;
    private String medicamento;
    private String dosis; 
    private String frecuencia; 
    private String Duracion;

    public MedicamentoRecetado() {
    }

    public MedicamentoRecetado(int idReceta, Expediente expediente, String medicamento, String dosis, String frecuencia, String Duracion) {
        this.idReceta = idReceta;
        this.expediente = expediente;
        this.medicamento = medicamento;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.Duracion = Duracion;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }
    
}
