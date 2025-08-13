/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2.tp_consigna.pkg9;

import java.util.Scanner;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Unidad2Tp_consigna9 {

    /**
     * @param args the command line arguments
     */
    
    // Construimos `calcularCostoEnvio` como primera función. Los argumentos serán ingresados por el usuario en `main`
    public static double calcularCostoEnvio(double peso, String zona) {
        // Declaramos costoEnvio como variable
        double costoEnvio = 0.0;
        
        // Estructura condicional para establecer el costo de envío en función de la zona 
        if (zona.equals("Nacional")) {
            costoEnvio = 5.0;
        } else if (zona.equals("Internacional")) {
            costoEnvio = 10.0;
        } else {
            System.out.println("Zona inválida.");
        }
        
        // Retornamos el costo de envío en función de la zona multiplicado por el peso para tener el costo de envío final
        return costoEnvio * peso;
    }
    // Construimos `calcularTotalCompra`, que suma el precio del producto y el costo de envío proveniente de `calcularCostoEnvio` y retorna el total de la suma
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        
        // Declaramos `costoTotal` para almacenar la suma
        double costoTotal = precioProducto + costoEnvio;
        
        // Retornamos el valor calculado, almacenado en `costoTotal`
        return costoTotal;
    }
    public static void main(String[] args) {
        // Creamos el objeto Scanner para poder leer posteriormente las entrasdas del usuario
        Scanner input = new Scanner(System.in);
        
        // Imprimimos un mensaje solicitando el precio del producto al usuario para que luego lo ingrese con la instancia de Scanner
        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = input.nextDouble();
        // Imprimimos un mensaje solicitando el peso del paquete al usuario para que luego lo ingrese con la instancia de Scanner
        System.out.println("Ingrese el peso del paquete en kg (solo el número): ");
        double peso = input.nextDouble();
        
        input.nextLine(); // Método "no elegante" de resolver el salto de línea de .nextDouble()
        
        // Imprimimos un mensaje solicitando la zona de envío al usuario para que luego lo ingrese con la instancia de Scanner

        System.out.println("Ingrese la zona de envío (Nacional/Internacional):");
        String zona = input.nextLine();
        
        // Declaramos `costoEnvío` para almacenar el costo retornado por la primera función
        double costoEnvio = calcularCostoEnvio(peso, zona);
        
        // Declaramos `precioFinal` para almacenar el precio final del producto, calculado con la segunda función creada
        double precioFinal = calcularTotalCompra(precioProducto, costoEnvio);
        
        // Imprimimos los mensajes finales en función de las dos variables anteriores
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + precioFinal);
    }
    
}
