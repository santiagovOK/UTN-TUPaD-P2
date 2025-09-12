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
public class Vehiculo {
    // Atributos privados de Vehiculo

    private String patente;     // Patente del vehículo
    private String modelo;     // Modelo del vehículo
    
    //Motor del vehículo (relación de agregación). El vehículo contiene un motor, pero no es responsable de su ciclo de vida
    private Motor motor;
    // Conductor del vehículo (relación de asociación bidireccional). El vehículo conoce a su conductor y viceversa
    private Conductor conductor;

    // Constructor que inicializa los atributos del vehículo
    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo; 
        this.motor = motor;     // Asignamos el motor proporcionado (relación de agregación)
    }

    // Getter para obtener la patente del vehículo
    public String getPatente() {
        return patente;
    }

    // Getter para obtener el modelo del vehículo
    public String getModelo() {
        return modelo;
    }

    // Getter para obtener el motor del vehículo
    public Motor getMotor() {
        return motor;
    }

    // Getter para obtener el conductor del vehículo
    public Conductor getConductor() {
        return conductor;    
    }

    // Setter para asignar un conductor al vehículo. Mantiene la consistencia de la relación bidireccional
    public void setConductor(Conductor conductor) {
        this.conductor = conductor; // Asignamos el conductor proporcionado
        
        // Verificamos si el conductor no es nulo y si no tiene ya este vehículo asignado
        if (conductor != null && conductor.getVehiculo() != this) {
            // Asignamos este vehículo al conductor, manteniendo la bidireccionalidad
            conductor.setVehiculo(this);
        }
    }

    // Método de comportamiento que muestra la información del vehículo (Tell, Don't Ask)
    public void mostrarInformacion() {
        System.out.println("Patente: " + patente); // Imprimimos la patente del vehículo
        System.out.println("Modelo: " + modelo); // Imprimimos el modelo del vehículo
        // Verificamos si el vehículo tiene un motor asignado
        if (motor != null) {
            motor.mostrarEspecificaciones();  // Mostramos las especificaciones del motor usando el método de comportamiento en la clase Motor

        }
        // Verificamos si el vehículo tiene un conductor asignado
        if (conductor != null) {
            conductor.mostrarDatos(); // Mostramos los datos del conductor usando el método de comportamiento si la condicion es true
        } 
    }
}
