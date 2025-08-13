/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2.tp_consigna.pkg7;

import java.util.Scanner;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Unidad2Tp_consigna7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el objeto Scanner para poder leer posteriormente las entrasdas del usuario
        Scanner input = new Scanner(System.in);
        
        // Inicializamos las variables a utilizar
        
        int nota;
        boolean notaInvalida; // Necesitamos que los valores sean true o false aquí, por eso boolean
        boolean notaValida; // Necesitamos que los valores sean true o false aquí, por eso boolean
        
        // Iniciamos la estructura repetitiva `do-while`
        do {            
            // Mensaje al inicial al usuario en el que se le muestra un mensaje para ingresar la nota
            System.out.println("Ingrese una nota (0-10): ");
            nota = input.nextInt();
            
            // Validación de nota con las variables boolean declaradas anteriormente. Serán true o false en cada caso en función de la condición de la asignación
            notaInvalida = (nota < 0) || (nota > 10); // Funcionará como condición para uno de los casos en la estructura `if`, pero también como bandera en el `do-while`
            notaValida = (nota >= 0) && (nota <= 10);
            
            // Iniciamos la estructura condicional para imprimir los mensajes que solicita la consigna.
            // Caso de `notaInvalida`, para poder imprimir el mensaje al usuario que se repetirá cada vez que la nota sea inválida
            if (notaInvalida) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            // Caso de `notaValida`. El programa termina luego de imprimir el mensaje
            } else if (notaValida) {
                System.out.println("Nota guardada correctamente.");
            }
        // Mientras la nota sea inválida, el `do-while` se seguirá repitiendo hasta que el usuario ingrese una `notaValida`
        } while (notaInvalida);
        
    }
    
}
