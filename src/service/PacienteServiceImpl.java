/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 27 may 2023                     *
 * Fecha de actualización: 27 may 2023                *
 * Descripción: Clase para implementar la interfaz del
 * módulo Paciente en Service.
 **************************************************** */

package service;

import model.*;

public class PacienteServiceImpl implements IPacienteService{
    IPacienteModel modelo = new PacienteModelImpl();
}
