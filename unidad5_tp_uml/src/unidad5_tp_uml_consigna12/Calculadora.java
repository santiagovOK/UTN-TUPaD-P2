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
public class Calculadora {

    // Método de comportamiento para calcular el impuesto, recibiéndolo como parámetro (Tell Don't Ask - Dependencia de uso)
    public void calcular(Impuesto impuesto) {

        // Validación de parámetros
        if (impuesto == null) {
            System.out.println("Error: El impuesto no puede ser nulo");
            return;
        }

        // Obtener el monto del impuesto
        double monto = impuesto.getMonto();

        // Realiza los cálculos (por ejemplo, aplicamos un descuento del 10%)
        double descuento = monto * 0.10;
        double montoFinal = monto - descuento;

        // Actualizar el monto del impuesto
        // Aplicación de Tell Don't Ask: el objeto Impuesto se encarga de su propio estado
        impuesto.setMonto(montoFinal);

        // Imprimir el resultado
        System.out.println("Monto original: " + monto);
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Monto final: " + montoFinal);
    }
}
