package controller;




import entity.Paciente;
import entity.Medico;
import java.util.HashMap;

public interface Registros {
    HashMap<String,Paciente> pacientes = new HashMap<>();
    HashMap<String,Medico> medicos = new HashMap<>();    
}
