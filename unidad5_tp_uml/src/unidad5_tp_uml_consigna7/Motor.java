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
public class Motor {

    // Atributos privados de Motor

    private String tipo; // Tipo de motor ("gas", "diésel", etc.)
    private String numeroSerie;  // Número de serie único del motor

    // Constructor que inicializa los atributos del motor
    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    // Getter para obtener el tipo de motor
    public String getTipo() {
        return tipo;
    }

    // Getter para obtener el número de serie del motor
    public String getNumeroSerie() {
        return numeroSerie;
    }

    // Método de comportamiento que muestra las especificaciones del motor (Tell, Don't Ask)
    public void mostrarEspecificaciones() {
        System.out.println("Tipo de motor: " + tipo);         // Imprimimos el tipo de motor
        System.out.println("Número de serie: " + numeroSerie);           // Imprimimos el número de serie del motor
    }
}