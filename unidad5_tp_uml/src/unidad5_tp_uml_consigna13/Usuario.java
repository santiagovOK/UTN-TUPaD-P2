/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna13;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Usuario {

    // Atributos privados de la clase Usuario
    private String nombre;  // Nombre del usuario
    private String email;   // Email del usuario

    // Constructor de la clase Usuario
    public Usuario(String nombre, String email) {
        this.nombre = nombre;  // Asignamos el nombre recibido al atributo nombre
        this.email = email;    // Asignamos el email recibido al atributo email
    }

    // Getter para obtener el nombre del usuario
    public String getNombre() { 
        return nombre;     // Devuelve el valor del atributo nombre
    }

    // Getter para obtener el email del usuario
    public String getEmail() {
        return email;     // Devuelve el valor del atributo email
    }

    // Setter para establecer el nombre del usuario
    public void setNombre(String nombre) { 
        this.nombre = nombre;     // Asigna el valor recibido al atributo nombre
    }

    // Setter para establecer el email del usuario
    public void setEmail(String email) { 
        this.email = email;     // Asigna el valor recibido al atributo email
    }
}
