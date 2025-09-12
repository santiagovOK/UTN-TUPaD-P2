/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna5;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Propietario {
    // Atributos privados para Propietario
    private String nombre; // Nombre del propietario
    private final String dni; // Número de identificación del propietario
    private Computadora computadora; // Computadora del propietario (bidireccional)

    // Constructor que inicializa los atributos nombre y dni
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getter para obtener el nombre del propietario
    public String getNombre() {
        return nombre;
    }

    // Setter para establecer el nombre del propietario
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener el número de identificación del propietario
    public String getDni() {
        return dni;
    }

    // Getter para obtener la computadora del propietario
    // Necesario para acceder al atributo computadora desde fuera de la clase (asociación bidireccional)
    public Computadora getComputadora() {
        return computadora;
    }

    // Setter para establecer la computadora del propietario
    // Necesario para cumplir con la relación de asociación bidireccional, manteniendo su consistencia
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if (computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }

    // Método de comportamiento que muestra la información del propietario (Tell, Don't Ask)
    public void mostrarInformacion() {
        System.out.println("\nPropietario:");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        if (computadora != null) {
            System.out.println("Computadora de " + nombre + ": ");
            System.out.println("Marca: " + computadora.getMarca());
            System.out.println("Número de Serie: " + computadora.getNumeroSerie());
        }
    }
}
