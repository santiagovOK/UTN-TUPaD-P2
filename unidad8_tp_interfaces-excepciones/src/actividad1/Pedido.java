package actividad1;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

import java.util.ArrayList;
import java.util.List;

// Representa un pedido que contiene una lista de productos.
// Implementa la interfaz Pagable y utiliza la interfaz Notificable.

public class Pedido implements Pagable {

    // Atributos privados

    private List<Producto> productos;
    private Notificable clienteNotificable; // Asociación con la interfaz.
    private String estado;

    // Constructor para crear una instancia de Pedido.
    // Recibe un objeto Notificable para inyección de dependencias.
    // `clienteNotificable` hace referencia al cliente que se notificará.

    public Pedido(Notificable clienteNotificable) {

        // Se inicializa la lista interna
        this.productos = new ArrayList<>();
        this.clienteNotificable = clienteNotificable;
        this.estado = "Iniciado"; // Estado inicial por defecto
    }

    // Añade un producto a la lista interna del pedido.
    // producto El Producto a agregar.

    public void agregarProducto(Producto producto) {
        if (producto != null) {
            this.productos.add(producto);
            System.out.println("Producto agregado: " + producto.getNombre());
        }
    }


    // Calcula el total del pedido sumando el total de cada producto en la lista.
    // Implementa el método de la interfaz Pagable.

    @Override
    public double calcularTotal() {
        double total = 0.0;
        // Se itera sobre la lista de 'Pagables' (Productos)
        for (Pagable producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }

    // Cambia el estado actual del pedido y notifica al cliente.
    // nuevoEstado` del pedido ("Enviado", "Entregado").

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;

        // Se le "dice" al objeto notificable que actúe
        // No se pregunta quién es, solo se usa el contrato (interfaz)
        this.clienteNotificable.notificar("El estado de su pedido cambió a: " + this.estado);
    }


}