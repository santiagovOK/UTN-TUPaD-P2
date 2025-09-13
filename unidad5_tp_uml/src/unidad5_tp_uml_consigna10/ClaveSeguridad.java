/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna10;

import java.util.Date;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class ClaveSeguridad {

    // Atributos privados de ClaveSeguridad
    private String codigo; // Código de la clave de seguridad
    private Date ultimaModificacion; // Fecha de la última modificación de la clave

    // Constructor de la clase ClaveSeguridad
    // Crea una nueva clave de seguridad con el código proporcionado
    public ClaveSeguridad(String codigo) {
        this.codigo = codigo; // Asigna el código proporcionado
        this.ultimaModificacion = new Date(); // Establece la fecha de creación como fecha de última modificación
    }

    // Getter para obtener el código de la clave de seguridad
    public String getCodigo() {
        return codigo; // Retorna el código
    }

    // Getter para obtener la fecha de última modificación de la clave de seguridad
    public Date getUltimaModificacion() {
        return ultimaModificacion; // Retorna la fecha de última modificación
    }
    
    // Setter para establecer el código de la clave de seguridad
    public void setCodigo(String codigo) {
        this.codigo = codigo; // Asigna el código proporcionado
        this.ultimaModificacion = new Date(); // Actualiza la fecha de última modificación
    }

    // Método de comportamiento para mostrar la información de la clave de seguridad (Tell, Don't Ask)
    // Imprime la información de la clave de seguridad, incluyendo el código y la fecha de última modificación
    public void mostrarInformacion() {
        System.out.println("Clave de Seguridad: Código " + codigo + " - Última Modificación: " + ultimaModificacion); // Imprime el código y la fecha de última modificación
    }
}