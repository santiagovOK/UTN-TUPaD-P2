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

public class Bateria {
    // Construimos el estado interno o "private" de Bateria
    
    private String modelo;
    private int capacidad;
    
    // Constructor
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }
    
    // Getter para acceder al modelo de la batería
    public String getModelo() {
        return modelo;
    }
    
    // Getter para acceder a la capacidad
    public int getCapacidad() {
        return capacidad;
    }
    
    // Setter para modificar el modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    // Setter para modificar la capacidad
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    // Método para mostrar información completa de la batería
    public void mostrarInformacion() {
        System.out.println("Batería - Modelo: " + modelo + ", Capacidad: " + capacidad + " mAh");
    }

}
