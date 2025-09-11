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
    private String dni;    // Variable para DNI
    
    // Composición
    // Asociación 1‑1 con Foto (cada titular tiene exactamente una foto)
    
    private Foto foto;

    // - Constructor -
    
    // Creamos un titular indicando su nombre y DNI.
     
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // - Getters -
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    // -------------------- Métodos de asociación --------------------
    
    // Obtenemos la foto asociada al titular
    public Foto getFoto() {
        return foto;
    }

    // Setter - Asociamos una foto al titular
     
    public void setFoto(Foto foto) {
        this.foto = foto;
    }
}