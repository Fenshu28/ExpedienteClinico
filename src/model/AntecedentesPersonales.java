/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 18 may 2023                     *
 * Fecha de actualización: 18 may 2023                *
 * Descripción: Clase que almacena los antecedentes
 *      clinicos personales.
 **************************************************** */

package model;

import java.util.List;


public class AntecedentesPersonales {
    private List<String> alergias;
    private List<String> enfermedadesCronicas;
    private List<String> cirugiasAnteriores;
    private List<String> medicamentosHabituales;

    public List<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }

    public List<String> getEnfermedadesCronicas() {
        return enfermedadesCronicas;
    }

    public void setEnfermedadesCronicas(List<String> enfermedadesCronicas) {
        this.enfermedadesCronicas = enfermedadesCronicas;
    }

    public List<String> getCirugiasAnteriores() {
        return cirugiasAnteriores;
    }

    public void setCirugiasAnteriores(List<String> cirugiasAnteriores) {
        this.cirugiasAnteriores = cirugiasAnteriores;
    }

    public List<String> getMedicamentosHabituales() {
        return medicamentosHabituales;
    }

    public void setMedicamentosHabituales(List<String> medicamentosHabituales) {
        this.medicamentosHabituales = medicamentosHabituales;
    }
    
    
}
