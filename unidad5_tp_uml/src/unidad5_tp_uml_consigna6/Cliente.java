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
// Clase que representa a un cliente en el sistema de reservas
public class Cliente {

    // Atributos privados de Cliente
    private String nombre;      // Nombre completo del cliente
    private String telefono;   // Número de teléfono de contacto

    // Constructor que inicializa un nuevo cliente con nombre y teléfono
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Getter para obtener el nombre del cliente
    public String getNombre() {
        return nombre;
    }

    // Getter  para obtener el teléfono del cliente
    public String getTelefono() {
        return telefono;
    }

    // Setter para actualizar el teléfono del cliente
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Método de comportamiento que muestra toda la información del cliente (Tell, Don't Ask)
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);         // Imprimimos el nombre del cliente
        System.out.println("Teléfono: " + telefono);     // Imprimimos el teléfono del cliente
    }
}