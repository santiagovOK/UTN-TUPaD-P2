/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna8;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Usuario {
    // Atributos privados para Usuario
    private String nombre; // Nombre del usuario
    private String email; // Email del usuario

    // Constructor que inicializa los atributos del usuario
    public Usuario(String nombre, String email) {
        this.nombre = nombre; // Asignamos el nombre del usuario
        this.email = email; // Asignamos el email del usuario
    }

    // Getter para obtener el nombre del usuario
    public String getNombre() {
        return nombre; // Devolvemos el nombre del usuario
    }

    // Setter para modificar el nombre del usuario
    public void setNombre(String nombre) {
        this.nombre = nombre; // Asignamos el nuevo nombre del usuario
    }

    // Getter para obtener el email del usuario
    public String getEmail() {
        return email; // Devolvemos el email del usuario
    }

    // Setter para modificar el email del usuario
    public void setEmail(String email) {
        this.email = email; // Asignamos el nuevo email del usuario
    }

    // Método de comportamiento para actualizar la información del usuario (Tell, Don't Ask)
    public void actualizarInformacion(String nombre, String email) {
        this.nombre = nombre; // Actualizamos el nombre del usuario
        this.email = email; // Actualizamos el email del usuario
        System.out.println("- Información del usuario actualizada -");
    }

    // Método de comportamiento para mostrar la información del usuario (Tell, Don't Ask)
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre); // Imprimimos el nombre del usuario
        System.out.println("Email: " + email); // Imprimimos el email del usuario
    }
}