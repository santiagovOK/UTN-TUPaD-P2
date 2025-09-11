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
public class Pasaporte {
    
    // Construimos el estado interno o "private" de Pasaporte

    private String numero;        // Variable para número del pasaporte
    private String fechaEmision;  // Variable para fecha de emisión

    // Constructor
    
    // Crea un pasaporte con sus datos esenciales.
    public Pasaporte(String numero, String fechaEmision) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
    }

    // Getters
    
    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    // No incluí setters ya que el número y la fecha de emisión
    // Deberían ser inmutables una vez creado el pasaporte
}

