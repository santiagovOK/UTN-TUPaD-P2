/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2.tp_consigna.pkg10;

import java.util.Scanner;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Unidad2Tp_consigna10 {

    /**
     * @param args the command line arguments
     */

    // Construimos `actualizarStock` para hacer el cálculo según la fórmula de `nuevoStock`    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) { 
        
        // Almacenamos el calculo del nuevo stock en la variable `nuevoStock`
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        
        // Retornamos el valor final de `nuevoStock`
        return nuevoStock;

}
    
    public static void main(String[] args) {
        // Creamos el objeto Scanner para poder leer posteriormente las entrasdas del usuario
        Scanner input = new Scanner(System.in);
        
        // Imprimimos un mensaje solicitando el el stock actual del producto al usuario, para que luego lo ingrese con la instancia de Scanner
        System.out.println("Ingrese el stock actual del producto: ");
        int stockActual = input.nextInt();

        // Imprimimos un mensaje solicitando la cantidad vendida del producto al usuario para que luego lo ingrese con la instancia de Scanner        
        System.out.println("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();

        // Imprimimos un mensaje solicitando la cantidad recibida del producto al usuario para que luego lo ingrese con la instancia de Scanner                
        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();
        
        // Calculamos el `nuevoStock` llamando a la función `actualizarStock`
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        // Imprimimos el mensaje final con el valor obtenido gracias al llamado de la función `actualizarStock`
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    
    }
}
