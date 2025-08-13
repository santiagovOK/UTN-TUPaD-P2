/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2.tp_consigna.pkg3;

import java.util.Scanner;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Unidad2Tp_consigna3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el objeto Scanner para poder leer posteriormente las entrasdas del usuario
        Scanner input = new Scanner(System.in);
        
        // Imprimimos un mensaje solicitandole al usuario su edad
        System.out.println("Ingresá tu edad para ver en qué etapa de tu vida te encontrás: ");
        
        // Almacenamos su edad en la variable `edad`, que es un número entero (int)
        int edad = input.nextInt();
        
        // Iniciamos la estructura condicional para evaluar, según la edad, a qué etapa pertenece.
        // También se podrían almacenar las etapas en una variable.
        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad >= 12 && edad <= 17){
            System.out.println("Eres un Adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }
        }
    
}
