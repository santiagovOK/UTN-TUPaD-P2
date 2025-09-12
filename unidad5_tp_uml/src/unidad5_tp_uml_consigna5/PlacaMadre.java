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

public class PlacaMadre {
    // Atributos privados de PlacaMadre
    
    private final String modelo; // modelo de la placa madre
    private final String chipset; // chipset de la placa madre

    // Constructor que inicializa los atributos modelo y chipset
    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    // Getter para obtener el modelo de la placa madre
    public String getModelo() {
        return modelo;
    }

    // Getter para obtener el chipset de la placa madre
    public String getChipset() {
        return chipset;
    }

    // Método de comportamiento que muestra la información de la placa madre (Tell, Don't Ask)
    public void mostrarInformacion() {
        System.out.println("\nPlaca Madre:");
        System.out.println("Modelo: " + modelo);
        System.out.println("Chipset: " + chipset);
    }
}
