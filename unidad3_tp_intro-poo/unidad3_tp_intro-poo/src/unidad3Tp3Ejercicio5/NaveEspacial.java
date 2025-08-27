/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3Tp3Ejercicio5;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
/**
 * Clase que modela una nave espacial.
 * Atributos:
 *   - nombre: identificador de la nave.
 *   - combustible: cantidad actual de combustible (unidades).
 *
 * Metodos:
 *   - despegar(): indica que la nave ha iniciado el despegue.
 *   - avanzar(double distancia): consume combustible proporcional a la distancia.
 *   - recargarCombustible(double cantidad): aumenta el combustible sin superar el limite maximo.
 *   - mostrarEstado(): imprime en consola el nombre y el combustible restante.
 *
 * Reglas:
 *   - Cada unidad de distancia consume 1 unidad de combustible (establecido por mi).
 *   - No se permite avanzar si no hay suficiente combustible.
 *   - El combustible maximo es 50 unidades.
 */
public class NaveEspacial {

    // Construimos el estado interno o "private" de NaveEspacial
    private String nombre;               // Variable para nombre de la nave
    private double combustible;          // Variable para combustible actual en unidades (decimal)

    // Combustible maximo como variable constante global
    private static final double MAX_COMBUSTIBLE = 50.0;

    // Setters Necesarios
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCombustible(double combustible) {
        if (combustible < 0) {
            System.out.println("Error: combustible no puede ser negativo. Se asigna 0.");
            this.combustible = 0;
        } else if (combustible > MAX_COMBUSTIBLE) {
            System.out.println("Advertencia: se supera el maximo de combustible. Se asigna MAX_COMBUSTIBLE.");
            this.combustible = MAX_COMBUSTIBLE;
        } else {
            this.combustible = combustible;
        }
    }

    // Métodos requeridos
    
    // Método despegar(), que simplemente indica que la nave comienza su despegue
    public void despegar() {
        System.out.println(nombre + " esta despegando...");
    }

    // Avanza la nave una distancia especificada con avanzar(distancia). Cada unidad de distancia consume 1 unidad de combustible.

    public void avanzar(double distancia) {
        if (distancia <= 0) {
            System.out.println("Error: la distancia debe ser mayor que cero.");
            return;
        // Caso para verificar que haya suficiente combustible
        } else if (combustible >= distancia) {
            combustible -= distancia;   // consumir combustible
            System.out.println(nombre + " ha avanzado " + distancia + " unidades.");
        } else {
            System.out.println("Error: combustible insuficiente. " +
                    "Se necesita " + distancia + " pero solo hay " + combustible + ".");
        }
    }

    // Metodo recargarCombustible(cantidad)
    public void recargarCombustible(double cantidad) {
        // Primer caso, en el que la recarga no puede ser menor o igual que cero
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a recargar debe ser mayor que cero.");
            return;
        }

        double combustiblePosible = combustible + cantidad;
        
        // Caso para no superar el maximo de combustible en la recarga
        if (combustiblePosible > MAX_COMBUSTIBLE) {
            double recargaReal = MAX_COMBUSTIBLE - combustible;
            combustible = MAX_COMBUSTIBLE;
            System.out.println(nombre + " ha recargado " + recargaReal +
                    " unidades (limite maximo alcanzado).");
        } else {
            combustible = combustiblePosible;
            System.out.println(nombre + " ha recargado " + cantidad + " unidades.");
        }
    }

    
    public void mostrarEstado() {
        System.out.println("=== Estado de la Nave ===");
        System.out.println("Nombre       : " + nombre);
        System.out.println("Combustible  : " + combustible + " / " + MAX_COMBUSTIBLE);
        System.out.println("=========================\n");
    }
}