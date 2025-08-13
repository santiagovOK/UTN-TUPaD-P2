/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2.tp_consigna.pkg11;

import java.util.Scanner;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Unidad2Tp_consigna11 {

    /**
     * @param args the command line arguments
     */
    
    // Declaramos la variable global DESCUENTO_GLOBAL (hay un error en el enunciado de la consigna, deduzco que la idea es esta)
    public static double DESCUENTO_GLOBAL = 0.10; 
    
    // Creamos la función `calcularDescuentoEspecial` para calcular el `descuentoAplicado` en base a la variable global anterior y el precio ingresado por el usuario
    public static double calcularDescuentoEspecial(double precio) {
        
        // Almacenamos en `descuentoAplicado` el resultado de la aplicación del descuento global en el precio ingresado por el usuario
        double descuentoAplicado = DESCUENTO_GLOBAL * precio;
        
        // Retornamos el resultado almacenado en la variable anterior
        return descuentoAplicado;
    }
    public static void main(String[] args) {
        // Creamos el objeto Scanner para poder leer posteriormente las entrasdas del usuario
        Scanner input = new Scanner(System.in);
        
        // Imprimimos un mensaje solicitando el precio del producto al usuario para que luego lo ingrese con la instancia de Scanner
        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();
        
        // Calculamos el `descuentoEspecial` con la función `calcularDescuentoEspecial`
        double descuentoEspecial = calcularDescuentoEspecial(precioProducto);
        
        // Calculamos el `precioFinal` en función del descuento especial calculado
        double precioFinal = precioProducto - descuentoEspecial;
        
        // Imprimimos los resultados siguiendo las pautas de la consigna
        System.out.println("El descuento especial aplicado es: " + descuentoEspecial);
        System.out.println("El precio final con descuento es: " + precioFinal);
        
    }
    
}
