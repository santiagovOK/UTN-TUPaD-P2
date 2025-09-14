/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna12;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Contribuyente {

    // Atributos privados para Contribuyente
    private String nombre;
    private final String cuil;

    // Constructor para inicializar el nombre y el CUIL del contribuyente
    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    // Getter para obtener el nombre del contribuyente
    public String getNombre() {
        return nombre;
    }
    
    // Getter para obtener el CUIL del contribuyente
    public String getCuil() {
        return cuil;
    }
    
    // Setter para actualizar el nombre del contribuyente
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}