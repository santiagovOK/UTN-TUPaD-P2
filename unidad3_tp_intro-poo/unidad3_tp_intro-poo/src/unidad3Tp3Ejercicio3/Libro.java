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
class Libro {
    
    // Construimos el estado interno o "private" de Libro
    
    private String titulo;          // Título del libro
    private String autor;           // Autor del libro
    private int anioPublicacion;     // Año de publicación (debe ser menor año actual)

    // Getters para cada atributo

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    // Setters para cada atributo
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    // Setter para anioPublicacion con validación

    public void setAnioPublicacion(int anio, int anioActual) {
        
        // Validación mínima para evitar años previos a la expansión de la imprenta (aproximado)
        final int ANIO_MINIMO = 1450;
        
        // Estructura condicional para validar anioPublicacion
        
        // Caso para ANIO_MINIMO de publicación
        if (anio < ANIO_MINIMO) {
            System.out.println("Error: El año no puede ser menor que " + ANIO_MINIMO + ".");
            return; // No modificamos el atributo
        // Caso para año "futuro"
        } else if (anio > anioActual) {
            System.out.println("Error: El año no puede ser mayor que el año actual (" + anioActual + ").");
            return; // No modificamos el atributo
        // Caso correcto
        } else {
            // Si pasa todas las validaciones, asignamos el valor correcto
            this.anioPublicacion = anio;
        
        }
    }
}
