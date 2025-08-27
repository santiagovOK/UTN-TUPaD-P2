/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3Tp3Ejercicio3;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Ejercicio3Main {
        
        // Definimos ANIO_ACTUAL como variable global
        final static int ANIO_ACTUAL = 2025;
        
        public static void main(String[] args) {
            
            // Creando la instancia para el libro
            Libro libro1 = new Libro();

            // Asignamos el título y el autor que, siguiendo la consigna, no requieren ninguna validación especial
            
            libro1.setTitulo("La ética protestante y el espíritu del capitalismo");
            libro1.setAutor("Max Weber");

            
            // Intentamos asignar un año inválido (por ejemplo, 2028, posterior a ANIO_ACTUAL).
           
            System.out.println("\n--- Intentando establecer año 2028 (tiene que ser inválido) ---");
            libro1.setAnioPublicacion(2028, ANIO_ACTUAL); // Se mostrará un error

            
            // Intentamos asignar otro año inválido menor a ANIO_MINIMO en Libro.java (por ejemplo, 1400).
            
            System.out.println("\nIntentando establecer año 1400 (tiene que ser inválido)");
            libro1.setAnioPublicacion(1400, ANIO_ACTUAL); // Se mostrará un error

            
            // Asignamos un año válido (por ejemplo, 1905).
            
            System.out.println("\nEstableciendo año 1905 (tiene que ser válido)");
            libro1.setAnioPublicacion(1905, ANIO_ACTUAL); // Se aceptará como valor válido

           
            // Mostramos la información final del libro usando los getters.
           
            System.out.println("\nInformación final del libro: ");
            System.out.println("\nTítulo:          " + libro1.getTitulo());
            System.out.println("\nAutor:           " + libro1.getAutor());
            System.out.println("\nAño publicación: " + libro1.getAnioPublicacion());
    }
}
