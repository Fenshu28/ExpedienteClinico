/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 26 jun 2023                        *
 * Fecha de actualización: 26 jun 2023                   *
 * Descripción: Clase para el controlador de los diagnosticos.
 *****************************************************/

package controller;

import entity.Diagnostico;
import java.util.List;
import model.DiagnosticoModelImpl;
import model.IDiagnosticoModel;

public class DiagnosticoController {
    IDiagnosticoModel modelo = new DiagnosticoModelImpl();
    
    public void mostrarRegistros(List<Diagnostico> listaDiagnosticos){
        modelo.mostrarRegistros(listaDiagnosticos);
    }
    public Diagnostico recuperarRegistro(List<Diagnostico> listaDiagnosticos,
            int id){
        return modelo.recuperarRegistro(listaDiagnosticos, id);
    }
}
