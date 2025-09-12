/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna4;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Cliente {
    // Atributos `private` del cliente
    private String nombre; // Nombre del cliente
    private int dni; // DNI del cliente
    private TarjetaDeCrédito tarjetaDeCrédito; // Tarjeta de crédito asociada al cliente

    // Constructor que inicializa los atributos del cliente
    public Cliente(String nombre, int dni) {
        this.nombre = nombre; // Asignamos el nombre completo del cliente
        this.dni = dni; // Asignamos el DNI del cliente
        this.tarjetaDeCrédito = null; // Inicializamos la tarjeta de crédito como nula
    }

    // Getter para obtener el nombre del cliente
    public String getNombre() {
        return nombre; // Devolvemos el nombre del cliente
    }

    // Setter para asignar el nombre del cliente
    public void setNombre(String nombre) {
        this.nombre = nombre; // Asignamos el nuevo nombre del cliente
    }

    // Getter para obtener el DNI del cliente
    public int getDni() {
        return dni;         // Devolvemos el DNI del cliente
    }

    // Getter para obtener la tarjeta de crédito del cliente
    public TarjetaDeCrédito getTarjetaDeCrédito() {
        return tarjetaDeCrédito; // Devolvemos la tarjeta de crédito del cliente

    }

    // [INFO] Setter para asignar la tarjeta de crédito del cliente
    public void setTarjetaDeCrédito(TarjetaDeCrédito tarjetaDeCrédito) {
        // Asignamos la nueva tarjeta de crédito del cliente
        this.tarjetaDeCrédito = tarjetaDeCrédito;
        // Verificamos si la tarjeta de crédito no es nula y si el cliente actual no es el titular de la tarjeta
        if (tarjetaDeCrédito != null && tarjetaDeCrédito.getTitular() != this) {
            // Asignamos el cliente actual como titular de la tarjeta de crédito
            tarjetaDeCrédito.setTitular(this); // Asignamos el cliente actual como titular de la tarjeta de crédito
        }
    }

    // Método que muestra la información del cliente
    public void mostrarInformacion() {
        // Imprimimos el nombre del cliente
        System.out.println("Nombre del cliente: " + nombre);
        // Imprimimos el DNI del cliente
        System.out.println("DNI del cliente: " + dni);
        // Verificamos si la tarjeta de crédito no es nula
        if (tarjetaDeCrédito != null) {
            tarjetaDeCrédito.mostrarInformacion(); // Mostramos la información de la tarjeta de crédito
        }
    }
}
