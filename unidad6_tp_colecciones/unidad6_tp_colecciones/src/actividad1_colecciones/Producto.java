package actividad1_colecciones;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

// Clase que representa un producto en el inventario.

public class Producto {
    // Atributos privados del producto
    private String id; // Identificador único del producto
    private String nombre; // Nombre del producto
    private double precio; // Precio del producto
    private int cantidad; // Cantidad en stock
    private CategoriaProducto categoria; // Categoría del producto

    // Constructor de Producto

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    // Getters para todos los atributos
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    // Setters solo para nombre, precio y cantidad.
    // El resto es inmutable y en el caso de la categoría, viene de CategoriaProducto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método que muestra la información del producto en la consola (solicitado en la consigna)

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Categoría: " + categoria.getDescripcion());
    }
}