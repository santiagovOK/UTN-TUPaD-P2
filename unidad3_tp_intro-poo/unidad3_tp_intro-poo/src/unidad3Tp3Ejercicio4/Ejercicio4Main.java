/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3Tp3Ejercicio4;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Ejercicio4Main {
    public static void main(String[] args) {
        // Creamos una instancia para la primera gallina "g1", ID: 1
        Gallina g1 = new Gallina();
        g1.setIdGallina(1); 
        g1.setEdad(2);
        g1.setHuevosPuestos(1);

        // Creamos una instancia para la segunda gallina "g2", ID: 2
        Gallina g2 = new Gallina();
        g2.setIdGallina(2);
        g2.setEdad(1);
        g2.setHuevosPuestos(2);
        
        // Mostramos el estado inicial de la primer gallina "g1"
        
        System.out.println("Estado inicial de la primer gallina: \n");
        g1.mostrarEstado();
        
        // Simulacion de acciones
        g1.envejecer(1);   // Le agregamos 1 año con envejecer(), pasa a 3 años
        g1.ponerHuevo(3);  // Le agregamos 3 huevos con ponerHuevo(), pasa a 4 huevos
        
        System.out.println("Estado luego de envejecer y poner huevos de la primer gallina: \n");
        g1.mostrarEstado();
        
        System.out.println("Estado inicial de la segunda gallina: \n");
        g2.mostrarEstado();
        
        g2.envejecer(2);   // Le agregamos 2 años con envejecer(), pasa a 3 años
        g2.ponerHuevo(2);  // Le agregamos 2 huevos con ponerHuevo(), pasa a 4 huevos

        System.out.println("Estado luego de envejecer y poner huevos de la segunda gallina: \n");
        g2.mostrarEstado();
        
        // Mostramos resultados finales de ambos casos
        
        System.out.println("\nEstado final de ambas gallinas: \n");
        System.out.println("\nPrimer Gallina:\n");
        g1.mostrarEstado();
        System.out.println("\nSegunda Gallina:\n");
        g2.mostrarEstado();
    }
}