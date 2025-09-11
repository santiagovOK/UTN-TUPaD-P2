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
public class Foto {

    // Construimos el estado interno o "private" de Foto

    private String imagen;   // Variable para ruta o nombre del archivo de la foto
    private String formato;  // Variable para extensión del archivo (ej. "jpg", "png")

    // Asociación 1‑1 con Pasaporte (una foto pertenece a un solo pasaporte)
    private Pasaporte pasaporte;

    // - Constructor -
    
    // Creamos una foto indicando su archivo y formato.
    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    // Getters
    public String getImagen() {
        return imagen;
    }

    public String getFormato() {
        return formato;
    }
    
    // Setters
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    // - Métodos de asociación - 
    
    // Obtenemos el pasaporte asociado a la foto
    
    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    // Asociamos la foto a un pasaporte
    
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }
}
