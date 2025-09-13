/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna9;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Profesional {
    // Atributos privados de la clase Profesional
    private String nombre;       // Nombre del profesional
    private String especialidad; // Especialidad del profesional

    // Constructor de la clase Profesional
    // Inicializa los atributos nombre y especialidad con los valores proporcionados
    public Profesional(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Getter para obtener el nombre del profesional
    public String getNombre() {
        return nombre;     // Retorna el valor del atributo nombre
    }

    // Setter para establecer el nombre del profesional
    public void setNombre(String nombre) {
        this.nombre = nombre;     // Actualiza el valor del atributo nombre con el valor proporcionado
    }

    // Getter para obtener la especialidad del profesional
    public String getEspecialidad() {
        return especialidad;     // Retorna el valor del atributo especialidad
    }

    // Método de comportamiento que muestra la información del profesional (Tell, Don't Ask)
    public void mostrarInformacionProfesional() {
        System.out.println("\nInformación del Profesional:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
    }
}