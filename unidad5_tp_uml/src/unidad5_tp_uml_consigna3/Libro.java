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
public class Libro {
    
    // Construimos el estado interno o "private" de Libro

    private String titulo;
    private String isbn;
    private Autor autor; // apuntamos a autor (asociación unidireccional)
    private Editorial editorial; // apuntamos a editorial (agregación)

    // Constructor
    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    // ✅ Getters necesarios para relaciones
    public Autor getAutor() { return autor; }
    public Editorial getEditorial() { return editorial; }
    
    // ✅ Setters necesarios para establecer relaciones
    public void setAutor(Autor autor) { this.autor = autor; }
    public void setEditorial(Editorial editorial) { this.editorial = editorial; }

    // ✅ Método de comportamiento en lugar de getters simples (Tell Don't Ask)
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("ISBN: " + isbn);
        if (autor != null) {
            System.out.println("Autor: " + autor.getNombre());
            System.out.println("Nacionalidad: " + autor.getNacionalidad());
        }
        if (editorial != null) {
            System.out.println("Editorial: " + editorial.getNombre());
            System.out.println("Dirección: " + editorial.getDireccion());
        }
    }
    
}