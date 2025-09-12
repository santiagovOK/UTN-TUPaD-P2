/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna7;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Conductor {

    // Atributos privados de Motor

    private String nombre;     // Nombre del conductor
    private String licencia; // Número de licencia del conductor

    // Vehículo asignado al conductor (relación de asociación bidireccional). El conductor conoce su vehículo y vicerversa
    private Vehiculo vehiculo;

    // Constructor que inicializa los atributos del conductor
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    // Getter para obtener el nombre del conductor
    public String getNombre() {
        return nombre;
    }

    // Getter para obtener la licencia del conductor
    public String getLicencia() {
        return licencia;
    }
    
    // Setter para asignar un nuevo nombre al conductor
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Setter para asignar una nueva licencia al conductor
    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    // Getter para obtener el vehículo asignado al conductor
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    // Setter para asignar un vehículo al conductor. Mantiene la consistencia de la relación bidireccional
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        // Verificamos si el vehículo no es nulo y si no tiene ya este conductor asignado
        if (vehiculo != null && vehiculo.getConductor() != this) {
            // Asignamos este conductor al vehículo para mantener la bidireccionalidad
            vehiculo.setConductor(this);
        }
    }

    // Método de comportamiento que muestra los datos del conductor (Tell, Don't Ask)
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);         // Imprimimos el nombre del conductor
        System.out.println("Licencia: " + licencia);         // Imprimimos la licencia del conductor
        // Verificamos si el conductor tiene un vehículo asignado
        if (vehiculo != null) {
            System.out.println("Vehículo asignado: " + vehiculo.getPatente());   // Imprimimos la información del vehículo si es true
        }
    }
}