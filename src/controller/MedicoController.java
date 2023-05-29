/** ***************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 29 may 2023                     *
 * Fecha de actualización: 29 may 2023                *
 * Descripción: Clase para controlar el Medico.
 **************************************************** */

package controller;

import service.IMedicoService;
import service.MedicoServiceImpl;


public class MedicoController {
    IMedicoService servicio = new MedicoServiceImpl();
}
