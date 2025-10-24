package actividad1;

/*
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

// Clase Producto
// Representa un artículo individual que tiene un nombre y un precio.
// Implementa la interfaz Pagable.

public class Producto implements Pagable {

    // Atributos privados para encapsular el estado.
    private String nombre;
    private double precio;

    // Constructor para crear una instancia de Producto.

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Calcula el total del producto.
    // Implementa el método de la interfaz Pagable.

    @Override
    public double calcularTotal() {
        // El total de un producto es su propio precio
        return this.precio;
    }

    // Getters
    // Métodos públicos para acceder a los datos

    public String getNombre() {
        return nombre;
    }

}