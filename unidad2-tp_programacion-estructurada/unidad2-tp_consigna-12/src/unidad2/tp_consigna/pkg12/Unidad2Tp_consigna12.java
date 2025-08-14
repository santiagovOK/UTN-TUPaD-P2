/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2.tp_consigna.pkg12;

import java.util.Scanner;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Unidad2Tp_consigna12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el objeto Scanner para poder leer posteriormente las entrasdas del usuario
        Scanner input = new Scanner(System.in);
        
        
        // Asignamos a la variable precios un array de `[5]` posiciones, agregando los diferentes valores en la misma línea
        double [] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // Imprimimos el array de "precios originales" usando `for`, que recorre cada una de las posiciones hasta llegar a la última inclusive
        
        System.out.println("Precios originales: "); // Impreso por fuera del `for` para que no se repita
        for (int i = 0; i < precios.length; i++) {
            double precio = precios[i];
            System.out.println("$" + precio);
            
        }
        
        // Modificamos el precio de la posición 2 del array, que sería el tercero en la lista
        precios[2] = 129.99; 
        
        // Imprimimos el array de "precios modificados" usando `for`, que recorre cada una de las posiciones hasta llegar a la última inclusive
        System.out.println("\nPrecios modificados: "); // Impreso por fuera del `for` para que no se repita
        for (int i = 0; i < precios.length; i++) {
            double precio = precios[i];
            System.out.println("$" + precio);
        }
        
    }
    
}
