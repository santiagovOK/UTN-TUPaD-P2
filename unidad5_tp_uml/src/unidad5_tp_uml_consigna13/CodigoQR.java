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

public class CodigoQR {

    // Atributos privados de la clase CódigoQR
    private String valor;    // Valor del código QR
    private Usuario usuario; // Usuario asociado al código QR (asociación unidireccional)

    // Constructor de la clase CódigoQR
    // Inicializa los atributos valor y usuario
    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;      // Asignamos el valor recibido al atributo valor
        this.usuario = usuario; // Asignamos el usuario recibido al atributo usuario
    }

    // Getter para obtener el valor del código QR
    public String getValor() {
        return valor;     // Devuelve el valor del atributo valor
    }

    // Getter para obtener el usuario asociado al código QR
    public Usuario getUsuario() {
        return usuario;     // Devuelve el valor del atributo usuario
    }

    // Setter para establecer el valor del código QR
    public void setValor(String valor) {
        this.valor = valor;     // Asigna el valor recibido al atributo valor
    }

    // Setter para establecer el usuario asociado al código QR
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;     // Asigna el valor recibido al atributo usuario
    }
}
