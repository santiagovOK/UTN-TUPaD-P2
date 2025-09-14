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

    private String imagen; // Variable para ruta o nombre del archivo de la foto
    private String formato; // Variable para extensión del archivo (ej. "jpg", "png")
    
    // Constructor de Foto, que se crea como parte de un pasaporte (composición)
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
}
