/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna1;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Consigna1Main {
    
    public static void main(String[] args) {
        // Creamos el pasaporte con foto incluida (composición)
        Pasaporte pasaporte = new Pasaporte("P1234567", "2025-09-11", 
                                           "foto_pasaporte.jpg", "jpg");

        // Creamos titular y establecer relación bidireccional
        Titular titular = new Titular("Santiago Varela", "12345678Z");
        titular.setPasaporte(pasaporte); // Esto automáticamente establece la bidireccionalidad, desde Titular

        // Le decimos al titular que muestre su información (Tell, don't ask )
        // En lugar de preguntarle por cada getter individualmente para mostrarlas nosotros
        titular.mostrarInformacionCompleta();
        
        // Si necesitamos información específica, usamos métodos de comportamiento
        System.out.println("Info de foto: " + titular.obtenerInfoFoto());
        
        // Verificamos bidireccionalidad también de forma elegante
        System.out.println("\nVerificación bidireccional (desde Pasaporte):");
        pasaporte.getTitular().mostrarInformacionCompleta();
    }
}
