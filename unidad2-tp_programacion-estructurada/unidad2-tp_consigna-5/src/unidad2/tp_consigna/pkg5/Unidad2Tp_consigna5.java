/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2.tp_consigna.pkg5;

import java.util.Scanner;

/**
 *Escribe un programa que solicite números al usuario y sume solo los
 *números pares. El ciclo debe continuar hasta que el usuario ingrese el número
 *0, momento en el que se debe mostrar la suma total de los pares ingresados.
 * 
 * 
 * 
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Unidad2Tp_consigna5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el objeto Scanner para poder leer posteriormente las entrasdas del usuario
        Scanner input = new Scanner(System.in);
        
        // Inicializamos las variables a utilizar
        int sumaPares = 0;
        int numero;
        boolean bandera = true;
        
        // Imprimimos un primer mensaje para el usuario, informando sobre el funcionamiento del programa
        System.out.println("Ingresá números enteros para que sean sumados aquí. Solo se sumarán los números pares.\nIngresá 0 para finalizar el programa.");
        
        // Iniciamos la estructura `while`, controlando con `bandera`
        while(bandera) {
            // Mensaje que se repetirá cada vez que inicie el bucle, con el formato que se pretende en la consigna
            System.out.println("Ingrese un número (0 para terminar): ");
            // Usamos el input de Scanner para el ingreso de los números
            numero = input.nextInt();
            
            // Iniciamos la estructura condicional para manejar los casos. Iniciamos con la condición de salida para evitar un bucle infinito
            if (numero == 0) {
                System.out.println("Programa finalizado.");
                // Mensaje final, con el formato que se pretende en la consigna
                System.out.println("La suma de los números pares es: " + sumaPares);
                // Cambiamos la bandera para que el bucle termine
                bandera = false;
            // Caso de suma 
            } else if (numero % 2 == 0) {
                System.out.println("Ingresaste el número par " + numero);
                sumaPares += numero; // Suma del número en caso de ser par, que se va almacenando en `sumaPares`
                System.out.println("La suma de números pares hasta el momento es: " + sumaPares);
            // Caso de número impar
            } else {
                System.out.println("Ingresaste un número impar.");
                System.out.println("La suma de números pares hasta el momento es: " + sumaPares);
            }
            
        }
    }
    
}
