/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3Tp3Ejercicio1;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Ejercicio1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        
        System.out.println("- Información inicial del estudiante -\n");
        est1.mostrarInfo();
        
        // Subimos la calificación con  subirCalificacion()
        est1.subirCalificacion(1.1);  
        System.out.println("\n- Después de subir 1.1 puntos - ");
        est1.mostrarInfo();

        // Bajamos la calificación con  bajarCalificacion()
        est1.bajarCalificacion(3.0);  
        System.out.println("\n- Después de bajar 3.0 puntos -");
        est1.mostrarInfo();
    }
    
}
