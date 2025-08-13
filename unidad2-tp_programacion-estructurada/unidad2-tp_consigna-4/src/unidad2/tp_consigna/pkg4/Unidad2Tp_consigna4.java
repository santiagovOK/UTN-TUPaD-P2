/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2.tp_consigna.pkg4;

import java.util.Scanner;

/**
 *   Escribe un programa que solicite al usuario el precio de un producto y
 *   su categoría (A, B o C).
 *   Luego, aplique los siguientes descuentos:
 *   Categoría A: 10% de descuento
 *   Categoría B: 15% de descuento
 *   Categoría C: 20% de descuento
 *   El programa debe mostrar el precio original, el descuento aplicado y el
 *   precio final
 * 
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Unidad2Tp_consigna4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el objeto Scanner para poder leer posteriormente las entrasdas del usuario
        Scanner input = new Scanner(System.in);
        
        // Imprimimos un mensaje para solicitarle al usuario el precio del producto. Luego lo almacenamos en `precio`
        System.out.println("Ingresá el precio del producto: ");
        double precioOriginal = input.nextDouble();
        
        // Solución "no elegante" al salto de línea anterior. Intenté hacerlo con `Integer.parseInt` pero no podía evitar el error de compilación
        input.nextLine();
        
        // Imprimimos un mensaje para solicitarle al usuario la categoría del producto. Luego la almacenamos en `categoria`
        System.out.println("Ingresá la categoría del producto (A, B, C) para conocer qué descuento se le puede aplicar: ");
        char categoria = (input.nextLine().charAt(0));
        
        // Creamos una variable para almacenar el porcentaje de descuento según el caso (usando Switch posteriormente)
        double porcentajeDescuento = 0.0;
        
        // Estructura condicional switch para diferentes resultados según categoria
        switch (categoria) {
            case 'A':
                porcentajeDescuento = 0.10;
                break;
            case 'B':
                porcentajeDescuento = 0.15;
                break;
            case 'C':
                porcentajeDescuento = 0.20;
                break;
            default:
                System.out.println("Categoría inválida");
                break;
        }
        
        // Creamos nuevas variables para almacenar el valor del descuento y poder restarlo al precio inicial
        // Se convierte a entero con casting `(int)` el porcentaje de descuento, almacenado en descuentoFinal
        double valorDescuento = precioOriginal * porcentajeDescuento;
        double precioFinal = precioOriginal - valorDescuento;
        int descuentoFinal = (int) (porcentajeDescuento * 100);
        
        // Imprimimos los diferentes mensajes solicitados en la consigna.
        System.out.println("Precio original: $ " + precioOriginal);
        System.out.println("Descuento aplicado: % " + descuentoFinal);
        System.out.println("Precio final: $ " + precioFinal);
    
    }
    
}
