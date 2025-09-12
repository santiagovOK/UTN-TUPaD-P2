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
public class Autor {
    // Construimos el estado interno o "private" de Autor
    private String nombre;
    private String nacionalidad;

    // Constructor
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Getters necesarios para acceder a los atributos desde otras clases
    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }

    // Método para mostrar información del autor (Tell Don't Ask)
    public void mostrarInformacion() {
        System.out.println("Autor: " + nombre);
        System.out.println("Nacionalidad: " + nacionalidad);
    }
    
    
}