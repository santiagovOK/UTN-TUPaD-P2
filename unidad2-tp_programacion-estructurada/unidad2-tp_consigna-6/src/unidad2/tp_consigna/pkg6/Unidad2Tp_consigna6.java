/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2.tp_consigna.pkg6;

import java.util.Scanner;

/**
 * Contador de positivos, negativos y ceros (for)
 * Escribe un programa que pida al usuario ingresar 10 números enteros y
 *   cuente cuántos son positivos, negativos y cuántos son ceros.
 * 
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Unidad2Tp_consigna6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el objeto Scanner para poder leer posteriormente las entrasdas del usuario
        Scanner input = new Scanner(System.in);
        
        // Inicializamos las variables a utilizar
        int num;
        int totalNegativos = 0;
        int totalPositivos = 0;
        int totalCeros = 0;
        int contador;
        
        // Iniciamos la estructura for, para iterar hasta 10 casos. Usamos la variable `contador` para mejor legibilidad
        for (contador = 1; contador <= 10; contador++ ) {
            // Imprimimos el mensaje que se repetirá en cada iteración, solicitando al usuario que ingrese un número.
            // El puesto del número se irá modificando dinámicamente con `contador` en cada iteración
            System.out.println("Ingrese el número " + contador + ": ");
            num = input.nextInt();
            // Estructura condicional para evaluar el número ingresado y sumar, según la categoría que corresponda (ceros, positivos, negativos)
            if (num == 0) {
                System.out.println("Ingresaste el número " + num);
                totalCeros += 1;
                System.out.println("Se sumo a los ceros. La suma total de ceros hasta aquí es: " + totalCeros);
            } else if (num > 0) {
                System.out.println("Ingresaste el número " + num);
                totalPositivos += 1;
                System.out.println("Se sumo a los positivos. La suma total de números positivos hasta aquí es: " + totalPositivos);
            } else if (num < 0) {
                System.out.println("Ingresaste el número " + num);
                totalNegativos += 1;
                System.out.println("Se sumo a los negativos. La suma total de números negativos hasta aquí es: " + totalNegativos);
            // Caso de error. No frena el contador, pero no sumará a ninguna de las categorias en ese intento
            } else {
                System.out.println("Número o valor inválido. Este intento será descartado y no se contabilizará.");
            }
        }
        
        // Imprimimos los mensajes finales, en el formato establecido en la consigna
            System.out.println("Resultados: \n");
            System.out.println("Positivos: " + totalPositivos);
            System.out.println("Negativos: " + totalNegativos);
            System.out.println("Ceros: " + totalCeros);
        }
    
}
