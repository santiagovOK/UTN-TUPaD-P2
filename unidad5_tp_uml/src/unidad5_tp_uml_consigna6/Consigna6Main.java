/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna6;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Consigna6Main {
    
    public static void main(String[] args) {
        // Creamos un nuevo cliente
        Cliente cliente = new Cliente("Juan Pérez", "123456789");

        // Creamos una nueva mesa(número, capacidad)
        Mesa mesa = new Mesa(1, 4);

        // Creamos una nueva reserva para hoy
        String fechaHoy = java.time.LocalDate.now().toString(); // Creamos una variable para almacenar la fecha actual
        Reserva reserva = new Reserva(fechaHoy, "19:00", cliente, mesa); // Usamos la variable previa y el resto, agregando el horario de las 19 hs

        // Mostramos la información completa de la reserva
        System.out.println("Información de la reserva:");
        reserva.mostrarInformacion();

        // Actualizamos el teléfono del cliente
        cliente.setTelefono("987654321");

        // Mostramos la información actualizada del cliente
        System.out.println("\nInformación actualizada del cliente:");
        cliente.mostrarInformacion();

        // Mostramos la información de la mesa
        System.out.println("\nInformación de la mesa:");
        mesa.mostrarInformacion();
    }
}