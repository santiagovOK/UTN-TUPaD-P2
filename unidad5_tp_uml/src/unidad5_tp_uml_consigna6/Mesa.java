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
public class Mesa {

    // Atributos privados de Mesa
    private int numero;        // Número identificador de la mesa
    private int capacidad;     // Capacidad máxima de personas que puede alojar

    // Constructor que inicializa una nueva mesa
    public Mesa(int numero, int capacidad) {
        // Asignamos los valores recibidos a los atributos correspondientes
        this.numero = numero;
        this.capacidad = capacidad;
    }

    // Getter para obtener el número de la mesa
    public int getNumero() {
        return numero;
    }

    // Getter para obtener la capacidad de la mesa
    public int getCapacidad() {
        return capacidad;
    }

    // Método de comportamiento que muestra toda la información de la mesa
    public void mostrarInformacion() {
        System.out.println("Número: " + numero);         // Imprimimos el número de la mesa
        System.out.println("Capacidad: " + capacidad + " personas");         // Imprimimos la capacidad de la mesa
    }
}
