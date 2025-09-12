/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna3;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Editorial {
    // Construimos el estado interno o "private" de Editorial
    private String nombre;
    private String direccion;
    
    // Constructor
    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Getters necesarios para acceder a los atributos desde otras clases
    public String getNombre() {
        return nombre; 
    }
    public String getDireccion() {
        return direccion; 
    }

    // Método para mostrar información de Editorial (Tell Don't Ask)
    public void mostrarInformacion() {
        System.out.println("Editorial: " + nombre);
        System.out.println("Dirección: " + direccion);
    }
    
    

}