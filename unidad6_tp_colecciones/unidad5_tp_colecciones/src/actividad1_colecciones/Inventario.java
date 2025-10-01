package actividad1_colecciones;

import java.util.ArrayList;

// Clase que representa el inventario de productos.

public class Inventario {
    // Atributo privado que almacena la lista de productos
    private ArrayList<Producto> productos;

    // Constructor de la clase Inventario, donde inicializamos la lista de productos
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Método que agrega un producto a la lista.

    public void agregarProducto(Producto p) {
        if (p == null) {
            System.out.println("Error: Producto nulo");
            return;
        }
        if (buscarProductoPorId(p.getId()) != null) {
            System.out.println("Error: ID duplicado");
            return;
        }
        productos.add(p);
    }

    // Método que muestra la información de todos los productos.

    public void listarProductos() {
        for (Producto p : productos) {
            p.mostrarInfo();
            System.out.println("------------------");
        }
    }

    // Método que busca un producto por su ID.

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    // Método que elimina un producto por su ID.

    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("\nProducto eliminado");
        } else {
            System.out.println("\nProducto no encontrado");
        }
    }

    // Método que actualiza la cantidad de un producto.

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("\nStock actualizado");
        } else {
            System.out.println("Producto no encontrado");
        }
    }

    // Método que filtra productos por categoría.

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    // Método que calcula el total de stock, retornando el total

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

    // Método que obtiene el producto con mayor stock.

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto mayor = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayor.getCantidad()) {
                mayor = p;
            }
        }
        return mayor;
    }

    // Método que filtra productos por rango de precio.

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    // Método que muestra las categorías disponibles.

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria + ": " + categoria.getDescripcion());
        }
    }
}