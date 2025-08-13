/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2.tp_consigna.pkg8;

import java.util.Scanner;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Unidad2Tp_consigna8 {

    /**
     * @param args the command line arguments
     */
    
        // A la función calcularPrecioFinal le agregué `precioBase` como argumento, ya que sino no estaría declarada la variable, que además se la tenemos que solicitar al usuario
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        
        // Convertimos los porcentajes a decimal para poder calcular la fórmula, almacenando los valores en nuevas variables
        double impuestoDecimal = impuesto / 100.0;
        double descuentoDecimal = descuento / 100.0;

        // Aplicamos la fórmula, siguiendo la consigna:
        // PrecioFinal = PrecioBase + (PrecioBase * Impuesto) - (PrecioBase * Descuento)
        double precioFinal = precioBase + (precioBase * impuestoDecimal) - (precioBase * descuentoDecimal);
        
        // Retornamos el valor calculado, almacenado en `precioFinal`
        return precioFinal;
    }

    public static void main(String[] args) {
        // Creamos el objeto Scanner para poder leer posteriormente las entrasdas del usuario
        Scanner input = new Scanner(System.in);
        
        // Imprimimos un mensaje para solicitarle el precio base al usuario
        System.out.println("Ingrese el precio base del producto: ");
        double precioBase = input.nextDouble();
        
        // Imprimimos un mensaje para solicitarle el impuesto al usuario
        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%: ");
        
        double impuesto = input.nextDouble();
        
        // Imprimimos un mensaje para solicitarle el descuento al usuario
        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para el 5%: ");
        
        double descuento = input.nextDouble();
        
        // Calculamos el precio final llamando a la variable `calcularPrecioFinal` previamente construida
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        // Impresión del mensaje final con el `precioFinal` retornado de la función 
        System.out.println("El precio final del producto es: " + precioFinal);
        
    }

}
