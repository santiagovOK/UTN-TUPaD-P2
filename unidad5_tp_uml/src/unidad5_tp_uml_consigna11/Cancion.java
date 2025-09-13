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
public class Cancion {

    // Atributos privados de Canción
    private String titulo; // Título de la canción
    private Artista artista; // Artista que interpreta la canción

    // Constructor de la clase Canción
    // Inicializa el atributo titulo con el valor proporcionado
    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;         // Asigna el título de la canción
        this.artista = artista;         // Asigna el artista que interpreta la canción
    }

    // Getter para obtener el título de la canción
    public String getTitulo() {
        return titulo;          // Devuelve el título de la canción
    }

    // Getter para obtener el artista que interpreta la canción
    public Artista getArtista() {
        return artista;         // Devuelve el artista que interpreta la canción
    }
}