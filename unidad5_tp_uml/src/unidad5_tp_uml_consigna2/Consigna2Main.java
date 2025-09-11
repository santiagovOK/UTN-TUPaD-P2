/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna2;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Consigna2Main {
    
    public static void main(String[] args) {
        System.out.println("- SISTEMA CELULAR-BATERÍA-USUARIO -\n");
        
        // Crear batería independiente (para agregación)
        Bateria bateria = new Bateria("Samsung Li-Ion", 4000);
        
        // Crear usuario
        Usuario santiago = new Usuario("Santiago Varela", "12345678");
        
        // Crear celular con agregación y asociación bidireccional
        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S23", bateria, santiago);
        
        // Demostrar comportamiento encapsulado (Tell, Don't Ask)
        System.out.println("\nInformación completa del usuario:");
        santiago.mostrarInformacionCompleta();
        
        System.out.println("\nInformación completa del celular:");
        celular.mostrarInformacionCompleta();
        
        // Demostrar cambio de batería (la agregación permite el intercambio)
        Bateria nuevaBateria = new Bateria("Apple Li-Po", 3500);
        celular.setBateria(nuevaBateria);
        
        System.out.println("\nDespués de cambiar batería:");
        celular.mostrarInformacionBateria();
    }
}
