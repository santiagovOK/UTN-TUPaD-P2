/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna11;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Artista {

    // Atributos privados de Artista
    private String nombre; // Nombre del artista
    private String genero; // Género musical del artista

    // Constructor de la clase Artista
    // Inicializa los atributos nombre y genero con los valores proporcionados
    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    // Getter para obtener el nombre del artista
    public String getNombre() {
        return nombre;         // Devuelve el nombre del artista
    }

    // Getter para obtener el género musical del artista
    public String getGenero() {
        return genero;         // Devuelve el género musical del artista
    }

    // Setter para actualizar el género musical del artista
    public void setGenero(String genero) {
        this.genero = genero;         // Asigna el nuevo género musical del artista
    }

}