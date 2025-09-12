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
// Clase que representa una reserva en el sistema
public class Reserva {

    // Atributos privados de Reserva
    private String fecha;       // Fecha de la reserva en formato YYYY-MM-DD
    private String hora;       // Hora de la reserva en formato HH:MM
    private Cliente cliente;   // Cliente asociado a esta reserva (Asoc. unidireaccional)
    private Mesa mesa;        // Mesa reservada (Agregación)

    // Constructor que inicializa una nueva reserva
    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        // Asignamos los valores recibidos a los atributos correspondientes
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    // Método getter para obtener la fecha de la reserva
    public String getFecha() {
        return fecha;
    }

    // Getter para obtener la hora de la reserva
    public String getHora() {
        return hora;
    }

    // Getter para obtener el cliente asociado a la reserva
    public Cliente getCliente() {
        return cliente;
    }

    // Getter para obtener la mesa reservada
    public Mesa getMesa() {
        return mesa;
    }

    // Método de comportamiento que muestra toda la información de la reserva
    public void mostrarInformacion() {
        // [INFO] Imprimimos la fecha y hora de la reserva
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);

        // [INFO] Mostramos la información del cliente asociado
        System.out.println("\nInformación del cliente:");
        cliente.mostrarInformacion();

        // [INFO] Mostramos la información de la mesa reservada
        System.out.println("\nInformación de la mesa:");
        mesa.mostrarInformacion();
    }
    
}