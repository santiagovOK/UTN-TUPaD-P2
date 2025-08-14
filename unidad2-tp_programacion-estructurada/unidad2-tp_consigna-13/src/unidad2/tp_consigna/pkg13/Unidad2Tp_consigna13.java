/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2.tp_consigna.pkg13;

import java.util.Scanner;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Unidad2Tp_consigna13 {

    /**
     * @param args the command line arguments
     */
    
    // Creamos la función recursiva para que se imprima recursivamente cada uno de los elementos del array
    public static void mostrarPreciosRecursivo(double[] array, int indice) {
        
        // Establecemos el caso base con una estructura condicional
        // Si el índice alcanza la longitud del array, terminamos la recursión
        
        if (indice >= array.length) {
            return;
        }
        
        // Imprimimos el precio en la posición actual
        System.out.println("$" + array[indice]);
        
        // Hacemos la llamada recursiva, luego incrementamos el índice para procesar el siguiente elemento
        mostrarPreciosRecursivo(array, indice + 1);
    }
    public static void main(String[] args) {
        // Creamos el objeto Scanner para poder leer posteriormente las entradas del usuario
        Scanner input = new Scanner(System.in);
        
        // Declaramos e inicializamos un array con precios de productos
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // Mostramos los precios originales usando función recursiva creada previamente
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0);
        
        // Modificamos el precio de la posición 2 del array, que sería el tercero en la lista
        // (igual que en el ejercicio anterior)
        precios[2] = 129.99;
        
        // Mostramos los precios modificados usando función recursiva
        // No es necesaria "otra función recursiva", simplemente usamos la misma
        System.out.println("\nPrecios modificados:");
        mostrarPreciosRecursivo(precios, 0);
        
    }
    
}
