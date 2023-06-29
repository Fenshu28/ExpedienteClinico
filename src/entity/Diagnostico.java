/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia          *
 * Fecha de creación: 26 jun 2023                        *
 * Fecha de actualización: 26 jun 2023                   *
 * Descripción: Clase para los diagnosticos
 *****************************************************/

package entity;


public class Diagnostico {
    private int id;
    private String codigo;
    private String descripcion;

    public Diagnostico() {
    }

    public Diagnostico(int id, String codigo, String descripcion) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
