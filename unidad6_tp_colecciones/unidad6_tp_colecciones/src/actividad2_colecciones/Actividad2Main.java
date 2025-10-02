package actividad2_colecciones;
import java.util.List;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Actividad2Main {
    public static void main(String[] args) {
        // 1. Creamos una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Creamos tres autores
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A002", "J.K. Rowling", "Británica");
        Autor autor3 = new Autor("A003", "Stephen King", "Americano");

        // 3. Agregamos 5 libros asociados a alguno de los autores a la biblioteca
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "Harry Potter y la piedra filosofal", 1997, autor2);
        biblioteca.agregarLibro("ISBN003", "El resplandor", 1977, autor3);
        biblioteca.agregarLibro("ISBN004", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("ISBN005", "Harry Potter y la cámara secreta", 1998, autor2);

        // 4. Listar todos los libros con su información y la del autor
        System.out.println("Lista de libros en la biblioteca:");
        biblioteca.listarLibros();

        // 5. Buscar un libro por su ISBN y mostrar su información
        String libroABuscar = "ISBN003";
        System.out.println("\nBuscando libro con ISBN: " + libroABuscar);
        Libro libroEncontrado = biblioteca.buscarLibroPorIsbn(libroABuscar);
        if (libroEncontrado != null) {
            libroEncontrado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado.");
        }

        // 6. Filtrar y mostrar los libros publicados en un año específico
        System.out.println("\nLibros publicados en 1997:");
        List<Libro> libros1997 = biblioteca.filtrarLibrosPorAnio(1997);
        for (Libro libro : libros1997) {
            libro.mostrarInfo();
            System.out.println(); // Separador entre libros
        }

        // 7. Eliminar un libro por su ISBN y listar los libros restantes
        System.out.println("\nEliminando libro con ISBN ISBN002:");
        biblioteca.eliminarLibro("ISBN002");
        biblioteca.listarLibros();

        // 8. Mostrar la cantidad total de libros en la biblioteca
        System.out.println("\nCantidad total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());

        // 9. Listar todos los autores de los libros disponibles en la biblioteca
        System.out.println("\nAutores disponibles en la biblioteca:");
        biblioteca.mostrarAutoresDisponibles();
    }
}