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
// Clase que representa un banco con nombre y CUIT
public class Banco {
    // Atributos privados del banco
    private String nombre; // Nombre del banco
    private int cuit; // CUIT del banco

    // Constructor que inicializa los atributos del banco
    public Banco(String nombre, int cuit) {
        // Asignamos el nombre del banco
        this.nombre = nombre;
        // Asignamos el CUIT del banco
        this.cuit = cuit;
    }

    // Getter para obtener el nombre del banco
    public String getNombre() {
        // Devolvemos el nombre del banco
        return nombre;
    }

    // Getter para obtener el CUIT del banco
    public int getCuit() {
        // Devolvemos el CUIT del banco
        return cuit;
    }

    // Método que muestra la información del banco
    public void mostrarInformacion() {
        System.out.println("Nombre del banco: " + nombre);         // Imprimimos el nombre del banco
        System.out.println("CUIT del banco: " + cuit);          // Imprimimos el CUIT del banco
    }
}
