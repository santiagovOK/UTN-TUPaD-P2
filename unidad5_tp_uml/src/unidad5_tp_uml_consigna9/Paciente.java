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
public class Paciente {

    // Atributos privados de Paciente
    // Inicializa los atributos nombre y obraSocial con los valores proporcionados
    private String nombre;       // Nombre del paciente
    private String obraSocial;  // Obra social a la que pertenece el paciente

    // Constructor de la clase Paciente
    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    // Getter para obtener el nombre del paciente
    public String getNombre() {
        return nombre;     // Retorna el valor del atributo nombre
    }

    // Setter para establecer el nombre del paciente
    // Actualiza el valor del atributo nombre con el valor proporcionado
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener la obra social del paciente
    public String getObraSocial() {
        return obraSocial;      // Retorna el valor del atributo obraSocial
    }

    // Setter para establecer la obra social del paciente
    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;     // Actualiza el valor del atributo obraSocial con el valor proporcionado
    }

    // Método de comportamiento que muestra la información del paciente (Tell, Don't Ask)
    public void mostrarInformacionPaciente() {
        System.out.println("\nInformación del Paciente:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Obra Social: " + obraSocial);
    }
}