package actividad2_colecciones;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    // Atributos privados de Biblioteca
    private String nombre; // Nombre de la biblioteca
    private List<Libro> libros; // Colección de libros de la biblioteca (Relación de composición con Libro)

    // Constructor de la clase Biblioteca
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>(); // Inicializamos la lista de libros
    }

    // Métodos solicitados en la consigna
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        // Creamos un nuevo libro y lo agregamos a la lista
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }

    public void listarLibros() {
        // Mostramos la información de todos los libros en la biblioteca
        for (Libro libro : libros) {
            libro.mostrarInfo();
            System.out.println(); // Separador entre libros
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        // Buscamos un libro por su ISBN y lo devolvemos si lo encontramos
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null; // Devolvemos null si no se encuentra el libro
    }

    public void eliminarLibro(String isbn) {
        // Buscamos y eliminamos un libro por su ISBN
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
            // El libro ya no existe al ser removido de la colección (composición)
        }
    }

    public int obtenerCantidadLibros() {
        // Devolvemos la cantidad de libros en la biblioteca
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        // Filtramos los libros por año de publicación y los devolvemos en una lista
        List<Libro> librosFiltrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                librosFiltrados.add(libro);
            }
        }
        return librosFiltrados;
    }

    public void mostrarAutoresDisponibles() {
        // Mostramos la información de todos los autores de los libros en la biblioteca
        for (Libro libro : libros) {
            libro.getAutor().mostrarInfo();
            System.out.println(); // Separador entre autores
        }
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibros() {
        // Retornamos copia inmutable para proteger la colección interna
        return Collections.unmodifiableList(libros);
    }

    // Setter para nombre de Biblioteca
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}