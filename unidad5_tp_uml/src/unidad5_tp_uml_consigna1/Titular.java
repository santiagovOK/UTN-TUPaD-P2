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
public class Titular {
    
    // Construimos el estado interno o "private" de Titular
    
    private String nombre; // Variable para nombre completo del titular
    private String dni; // Variable para DNI
    
    // Creamos la asociación bidireccional con Pasaporte
    private Pasaporte pasaporte;

    // - Constructor - 
    
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    // Métodos de asociación bidireccional con Pasaporte
    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        // Creamos una validacion para asegurar bidireccionalidad
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }
    
    // Método de comportamiento (Tell, don't ask)
    // Delegamos la responsabilidad al pasaporte sin exponer la navegación
    public void mostrarInformacionCompleta() {
        System.out.println("Titular: " + nombre + " - DNI: " + dni);
        if (pasaporte != null) {
            pasaporte.mostrarInformacionFoto();
            System.out.println("Pasaporte asociado: " + pasaporte.getNumero());
        } else {
            System.out.println("Sin pasaporte asociado");
        }
    }
    
    // Método específico para obtener info de foto (Tell, don't ask)
    // Evitamos exponer la cadena de navegación
    public String obtenerInfoFoto() {
        if (pasaporte != null) {
            return pasaporte.obtenerInfoFoto();
        } else {
            return "Sin foto disponible";
        }
    }
}