/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna5;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Consigna5Main {
    
    public static void main(String[] args) {
        // Creamos una instancia de Computadora con marca, número de serie, modelo de placa y chipset de placa
        // La PlacaMadre se crea automáticamente en el constructor (composición)
        Computadora computadora = new Computadora("Gigabyte", "123456789", "Gigabyte Gaming 3 x370", "Ryzen 2600");

        // Creamos una instancia de Propietario con nombre y DNI específicos
        Propietario propietario = new Propietario("Santiago Varela", 12345678);

        // Establecemos la relación de asociación bidireccional entre Computadora y Propietario
        computadora.setPropietario(propietario);

        // Mostramos la información de la computadora (Tell, Don't Ask)
        computadora.mostrarInformacion();

        // Verificamos la relación de composición entre Computadora y PlacaMadre
        System.out.println("\n- Verificación de relación de composición -");
        if (computadora.getPlacaMadre() != null) {
            System.out.println("La computadora tiene una placa madre.");
            computadora.getPlacaMadre().mostrarInformacion();
        } else {
            System.out.println("La computadora no tiene una placa madre.");
        }

        // Verificamos la relación de asociación bidireccional entre Computadora y Propietario
        System.out.println("\n- Verificación de relación de asociación bidireccional -");
        if (computadora.getPropietario() != null && propietario.getComputadora() != null) {
            System.out.println("La relación bidireccional entre Computadora y Propietario es correcta. Veamos nuevamente al propietario:");
            propietario.mostrarInformacion();
        } else {
            System.out.println("La relación bidireccional entre Computadora y Propietario no es correcta.");
        }
    }
}