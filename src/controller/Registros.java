package controller;




import java.util.HashMap;
import model.*;

public interface Registros {
    HashMap<String,Paciente> pacientes = new HashMap<>();
    HashMap<String,Medico> medicos = new HashMap<>();    
}
