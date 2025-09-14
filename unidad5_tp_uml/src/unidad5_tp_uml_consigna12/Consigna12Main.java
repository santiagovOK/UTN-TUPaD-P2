/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna12;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Consigna12Main {
    
    public static void main(String[] args) {

        // Creamos un objeto Contribuyente con un nombre y un CUIL
        Contribuyente contribuyente = new Contribuyente("Santiago Varela", "20-12345678-9");

        // Creamos un objeto Impuesto con un monto inicial y lo asociamos al contribuyente (Asociación unidireccional)
        Impuesto impuesto = new Impuesto(1000.0, contribuyente);

        // Creamos un objeto Calculadora
        Calculadora calculadora = new Calculadora();

        // Calculamos el impuesto utilizando la Calculadora (Dependencia de Uso, Tell Don't Ask)
        calculadora.calcular(impuesto);

        // Imprimimos la información del contribuyente y el impuesto usando la asociación unidireccional
        System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("CUIL: " + impuesto.getContribuyente().getCuil());
        System.out.println("Monto del impuesto: " + impuesto.getMonto());
        
        // Verificación de que la relación Impuesto - Contribuyente funciona correctamente
        if (impuesto.getContribuyente() == contribuyente) {
            System.out.println("\nRelacion establecida correctamente");
        } else {
            System.out.println("\nRelacion no establecida correctamente");
        }
    }
}