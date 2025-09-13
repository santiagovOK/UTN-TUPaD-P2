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
public class Reproductor {

    // Método de comportamiento para reproducir una canción (Tell, Don't Ask)
    // Recibe un objeto de tipo Canción como parámetro y no devuelve ningún valor

    public void reproducir(Cancion cancion) {
        // Estructura condicional para verifica que la canción no sea nula
        if (cancion != null) {
            String titulo = cancion.getTitulo();             // Obtiene el título de la canción
            Artista artista = cancion.getArtista();             // Obtiene el artista de la canción

            // Condicional anidado que verifica que el artista no sea nulo
            if (artista != null) {
                String nombreArtista = artista.getNombre();                 // Obtiene el nombre del artista
                String generoArtista = artista.getGenero();                 // Obtiene el género musical del artista
                // Imprime la información de la canción y el artista
                System.out.println("Reproduciendo: " + titulo + " - " + nombreArtista + " (" + generoArtista + ")");

            } else {
                 // Imprime un mensaje de error si el artista es nulo
                System.out.println("Error: El artista de la canción es nulo.");
            }

        } else {
            System.out.println("Error: La canción es nula.");             // Imprime un mensaje de error si la canción es nula
        }

    }

}