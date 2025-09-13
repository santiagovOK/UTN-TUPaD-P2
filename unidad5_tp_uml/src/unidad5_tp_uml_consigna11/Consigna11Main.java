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
public class Consigna11Main {
    
    public static void main(String[] args) {

        //  Creamos un objeto de tipo Artista con el nombre "Artista 1" y el género "Rock"
        Artista artista1 = new Artista("Patricio Rey y sus Redonditos de Ricota", "Rock Nacional");

        // Creamos un objeto de tipo Canción con el título "Canción 1" y el artista artista1
        Cancion cancion1 = new Cancion("Perdiendo el Tiempo", artista1);

        // Creamos un objeto de tipo Reproductor
        Reproductor reproductor = new Reproductor();

        // Reproducimos la canción (Tell, Don't Ask)
        reproductor.reproducir(cancion1);

    }
}