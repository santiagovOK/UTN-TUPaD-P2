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
public class Usuario {
    // Construimos el estado interno o "private" de Bateria
    
    private String nombre;
    private int dni;
    
    // Referencia para la asociación bidireccional con Celular
    private Celular celular;
    
    // Constructor
    public Usuario(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Getter para acceder al nombre (especificado en el diagrama)
    public String getNombre() {
        return nombre;
    }
    
    // Getter para acceder al DNI
    public int getDni() {
        return dni;
    }
    
    // Getter para la asociación bidireccional con Celular
    public Celular getCelular() {
        return celular;
    }
    
    // Setter para modificar el nombre (especificado en el diagrama)
    // Mantenemos la bidireccionalidad automáticamente
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Setter para modificar el DNI
    public void setDni(int dni) {
        this.dni = dni;
    }
    
    // Setter que mantiene la bidireccionalidad automáticamente
    // Implementamos el principio de consistencia en relaciones bidireccionales
    public void setCelular(Celular celular) {
        // Desconectamos el celular anterior si existe
        if (this.celular != null && this.celular.getUsuario() == this) {
            this.celular.setUsuario(null);
        }
        
        // Establecemos nueva conexión
        this.celular = celular;
        
        // Mantenemos consistencia bidireccional
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }
    
    // Método de comportamiento que encapsula la navegación
    // Implementamos el principio "Tell, Don't Ask"
    public void mostrarInformacionCompleta() {
        System.out.println("Usuario: " + nombre + " - DNI: " + dni);
        if (celular != null) {
            System.out.println("Celular asignado: " + celular.getMarca() + " " + celular.getModelo());
            celular.mostrarInformacionBateria(); // Delega comportamiento
        } else {
            System.out.println("Sin celular asignado");
        }
    }
}
