/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna3;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Consigna3Main {
    public static void main(String[] args) {
        
        // Creamos las instancias de Autor, Editorial y Libro
        Autor autor = new Autor("Gabriel García Márquez", "Colombiano");
        Editorial editorial = new Editorial("Editorial Sudamericana", "Calle 123, Bogotá");
        Libro libro = new Libro("Cien años de soledad", "978-0307474728");

        // Establecemos las relaciones entre las clases
        libro.setAutor(autor);
        libro.setEditorial(editorial);

        // Mostramos la información del libro usando el principio Tell Don't Ask
        System.out.println("- Información del Libro -");
        libro.mostrarInformacion();

        // Mostramos información individual de autor y editorial
        System.out.println("\n- Información Individual -");
        autor.mostrarInformacion();
        System.out.println();
        editorial.mostrarInformacion();
        
        // Verificamos que las relaciones se hayan establecido correctamente
        System.out.println("\n- Verificación de Relaciones -");

        // Verificación de la relación con Autor
        if (libro.getAutor() != null) {
            System.out.println("Libro tiene autor?: Sí");
        } else {
            System.out.println("Libro tiene autor?: No");
        }

        // Verificación de la relación con Editorial
        if (libro.getEditorial() != null) {
            System.out.println("Libro tiene editorial?: Sí");
        } else {
            System.out.println("Libro tiene editorial?: No");
        }        
    }
}
