package actividad1_colecciones;

import java.util.ArrayList;

public class Actividad1Main {
    public static void main(String[] args) {

        // Creamos una instancia de Inventario
        Inventario inventario = new Inventario();

        // 1. Creamos cinco productos con diferentes categorías
        Producto producto1 = new Producto("P001", "Manzanas", 1500.0, 50, CategoriaProducto.ALIMENTOS);
        Producto producto2 = new Producto("P002", "Laptop", 250000.0, 10, CategoriaProducto.ELECTRONICA);
        Producto producto3 = new Producto("P003", "Camisa", 2500.0, 30, CategoriaProducto.ROPA);
        Producto producto4 = new Producto("P004", "Silla", 50000.0, 20, CategoriaProducto.HOGAR);
        Producto producto5 = new Producto("P005", "Leche", 1200.0, 40, CategoriaProducto.ALIMENTOS);

        // Los agregamos al inventario

        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);
        inventario.agregarProducto(producto4);
        inventario.agregarProducto(producto5);

        // 2. Listamos todos los productos
        System.out.println("Lista de productos:");
        inventario.listarProductos();

        // 3. Buscamos un producto por ID y mostramos su información
        String idBuscado = "P002";
        Producto productoEncontrado = inventario.buscarProductoPorId(idBuscado);
        System.out.println("Búsqueda de un producto con ID " + idBuscado + " :");
        if (productoEncontrado != null) {
            System.out.println("\nProducto encontrado:");
            productoEncontrado.mostrarInfo();
        } else {
            System.out.println("\nProducto con ID " + idBuscado + " no encontrado.");
        }

        // 4. Filtramos y mostramos productos de una categoría específica
        CategoriaProducto categoriaFiltrar = CategoriaProducto.ALIMENTOS;
        ArrayList<Producto> productosFiltrados = inventario.filtrarPorCategoria(categoriaFiltrar);
        System.out.println("\nProductos de la categoría " + categoriaFiltrar.getDescripcion() + ":");
        for (Producto p : productosFiltrados) {
            p.mostrarInfo();
            System.out.println("------------------");
        }

        // 5. Eliminamos un producto por ID y listamos los productos restantes
        String idEliminar = "P003";
        inventario.eliminarProducto(idEliminar);
        System.out.println("\nProductos después de eliminar el producto con ID " + idEliminar + ":");
        inventario.listarProductos();

        // 6. Actualizamos el stock de un producto existente
        String idActualizar = "P001";
        int nuevaCantidad = 60;
        inventario.actualizarStock(idActualizar, nuevaCantidad);
        System.out.println("\nStock actualizado para el producto con ID " + idActualizar + ":");
        inventario.buscarProductoPorId(idActualizar).mostrarInfo();

        // 7. Mostramos el total de stock disponible
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("\nTotal de stock disponible: " + totalStock);

        // 8. Obtenemos y mostramos el producto con mayor stock
        Producto productoMayorStock = inventario.obtenerProductoConMayorStock();
        if (productoMayorStock != null) {
            System.out.println("\nProducto con mayor stock:");
            productoMayorStock.mostrarInfo();
        } else {
            System.out.println("\nNo hay productos en el inventario.");
        }

        // 9. Filtramos productos con precios entre $1000 y $3000
        double precioMin = 1000.0;
        double precioMax = 3000.0;

        ArrayList<Producto> productosPorPrecio = inventario.filtrarProductosPorPrecio(precioMin, precioMax);
        System.out.println("\nProductos con precios entre $" + precioMin + " y $" + precioMax + ":");
        for (Producto p : productosPorPrecio) {
            p.mostrarInfo();
            System.out.println("------------------");
        }

        // 10. Mostramos las categorías disponibles con sus descripciones
        System.out.println("\nCategorías disponibles:");
        inventario.mostrarCategoriasDisponibles();
    }
}