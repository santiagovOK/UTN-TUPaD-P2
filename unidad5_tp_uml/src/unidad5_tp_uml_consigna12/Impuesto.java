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
public class Impuesto {

    // Atributos privados para Impuesto
    private double monto;
    private Contribuyente contribuyente;     // Asociación unidireccional Impuesto - Contribuyente


    // Constructor para inicializar el monto del impuesto y establecer la asociación con el contribuyente
    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    // Getter para obtener el monto del impuesto
    public double getMonto() {
        return monto;
    }

    // Setter para actualizar el monto del impuesto
    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    // Getter para obtener el contribuyente asociado (asociación unidireccional)
    public Contribuyente getContribuyente() {
        return contribuyente;
    }
}