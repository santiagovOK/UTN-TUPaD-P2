/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3Tp3Ejercicio2;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Mascota {
    
    // Construimos el estado interno o "private" de Mascota
    
    private String nombre = "Simón";          // Variable para el nombre de la mascota
    private String especie = "Perro";         // Variable la especie de la mascota
    private int edad = 9;                     // Variable para almacenar la edad de la mascota
    
    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("\nInformación de la mascota: \n");
        System.out.println("Nombre: " + nombre + "\nEspecie: " + especie);
        System.out.println("\nEdad: " + edad);
    }
    
    public void cumplirAnios(int aniosTranscurridos) {
        
        if (aniosTranscurridos < 0) {                        // Caso para evitar puntos negativos
            System.out.println("Error: los años a cumplir deben ser positivos");
            return;                              // Salimos del método sin retornar valor
        } else {
            edad += aniosTranscurridos;              // Sumamos puntos a la calificación
        }
             
    }
}