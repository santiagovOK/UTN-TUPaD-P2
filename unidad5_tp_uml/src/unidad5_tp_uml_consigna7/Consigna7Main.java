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
public class Consigna7Main {
    public static void main(String[] args) {
        // Creamos una instancia Motor
        Motor motor = new Motor("diésel", "M123456");

        // Creamos una instancia Vehículo, con el motor creado anteriormente ingresando como parámetro
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Corolla", motor);

        // Creamos una instancia Conductor 
        Conductor conductor = new Conductor("Santiago Varela", "L789012");

        // Asignamos el conductor al vehículo, lo que también asigna el vehículo al conductor. Esto mantiene la consistencia de la relación bidireccional
        vehiculo.setConductor(conductor);

        // Mostramos la información completa del vehículo, incluyendo el motor y el conductor
        System.out.println("Información del vehículo:");
        vehiculo.mostrarInformacion();

        // Verificamos la consistencia de la relación bidireccional entre vehículo y conductor
        System.out.println("\nVerificación de relaciones:");

        // Verificamos si el conductor del vehículo es el mismo que el conductor creado
        if (vehiculo.getConductor() == conductor) {
            System.out.println("El conductor del vehículo es el mismo que el conductor creado.");
        } else {
            System.out.println("Error: El conductor del vehículo no coincide con el conductor creado.");
        }

        // Verificamos si el vehículo del conductor es el mismo que el vehículo creado
        if (conductor.getVehiculo() == vehiculo) {
            System.out.println("El vehículo del conductor es el mismo que el vehículo creado.");
        } else {
            System.out.println("Error: El vehículo del conductor no coincide con el vehículo creado.");
        }

        // Verificamos si el motor del vehículo es el mismo que el motor creado
        if (vehiculo.getMotor() == motor) {
            System.out.println("El motor del vehículo es el mismo que el motor creado.");
        } else {
            System.out.println("Error: El motor del vehículo no coincide con el motor creado.");
        }
    }
}
