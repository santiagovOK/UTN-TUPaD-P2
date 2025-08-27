/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3Tp3Ejercicio2;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Ejercicio2Main {
    
    
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota();
    
        mascota1.mostrarInfo();
        
        // Simulamos un cumpleaños individual con cumplirAnios()
        
        System.out.println("\nUn cumpleaños normal, con un solo año transcurrido...");
        mascota1.cumplirAnios(1);
        mascota1.mostrarInfo(); // edad pasa de 12 a 13
        
        // Simulamos que la mascota cumple 3 años usando el método cumplirAnios(int).
        
        System.out.println("\nSimulando que la mascota cumple 3 años...");
        mascota1.cumplirAnios(3); 
        mascota1.mostrarInfo();   // edad pasa de 9 a 12
        
        
    }
}