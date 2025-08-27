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
public class Ejercicio5Main {
    public static void main(String[] args) {
        // Creamos la instancia de NaveEspacial()
        NaveEspacial nave1 = new NaveEspacial();

        // Usamos los setters para establecer los atributos iniciales
        nave1.setNombre("Starship");
        nave1.setCombustible(50.0);   // Combustible establecido en 50 unidades de combustible inicial, como lo indica la consigna

        // Mostramos el estado inicial de la nave con mostrarEstado()
        System.out.println("- Estado INICIAL de la nave -");
        nave1.mostrarEstado();

        // Despegamos y avanzamos sin recargar (debe fallar si la distancia > combustible, relacion 1:1)
        nave1.despegar();                 
        nave1.avanzar(60.0);               // Intento de avanzar 60 unidades (insuficiente)

        // Mostramos el estado nuevamente antes de recargar
        System.out.println("\nEstado de la nave antes de la regarga: \n");
        nave1.mostrarEstado();
        
        // Regargamos combustible suficiente para avanzar
        nave1.recargarCombustible(30.0);   // El combustible debe quedar en 80.0

        // Mostramos el estado nuevamente antes de avanzar
        System.out.println("\nEstado de la nave luego de la regarga y previo a avanzar: \n");
        nave1.mostrarEstado();
        
        // Avanzamos con una distancia viable respecto al combustible que se tiene en la nave1
        nave1.avanzar(40.0);               // Avanzamos 40.0 unidades de distancia, lo que nos dejaria en 40.0 de combustible

        // Mostramos el estado final de la nave
        System.out.println("\n- Estado FINAL de la nave -");
        nave1.mostrarEstado();
    }
}