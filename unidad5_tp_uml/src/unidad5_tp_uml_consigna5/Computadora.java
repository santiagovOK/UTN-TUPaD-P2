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

public class Computadora {
    // Atributos privados para Computadora
    private String marca; // Marca de la computadora
    private String numeroSerie; // Número de serie de la computadora
    private PlacaMadre placaMadre; // Placa madre de la computadora (composición)
    private Propietario propietario; // Propietario de la computadora (bidireccional)

    // Constructor que inicializa los atributos marca y numeroSerie
    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca); // Creamos la placa madre en el constructor para cumplir con la relación de composición
    }

    // Getter para obtener la marca de la computadora
    public String getMarca() {
        return marca;
    }

    // Getter para obtener el número de serie de la computadora
    public String getNumeroSerie() {
        return numeroSerie;
    }

    // Getter para obtener la placa madre de la computadora
    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }

    // Getter para obtener el propietario de la computadora
    public Propietario getPropietario() {
        return propietario;
    }

    // Setter para establecer el propietario de la computadora
    // Necesario para cumplir con la relación de asociación bidireccional, manteniendo su consistencia
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    // Método de comportamiento que muestra la información de la computadora (Tell, Don't Ask)
    public void mostrarInformacion() {
        System.out.println("\nComputadora:");
        System.out.println("Marca: " + marca);
        System.out.println("Número de Serie: " + numeroSerie);
        if (placaMadre != null) {
            placaMadre.mostrarInformacion();
        }
        if (propietario != null) {
            propietario.mostrarInformacion();
        }
    }
}
