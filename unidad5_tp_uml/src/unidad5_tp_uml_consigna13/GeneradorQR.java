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
public class GeneradorQR {

    // Esta clase implementa la dependencia de creación hacia CódigoQR
    // Este método es relevante para la Dependencia de creación porque:
    //        - Crea una nueva instancia de CódigoQR
    //        - Es responsable de la creación del objeto CódigoQR
    //        - Recibe un Usuario como parámetro (dependencia de uso)
    
    // Método de comportamiento que genera un código QR a partir de un valor y un usuario
    public CodigoQR generar(String valor, Usuario usuario) {
        // Creamos una nueva instancia de CódigoQR
        CodigoQR códigoQR = new CodigoQR(valor, usuario);
        // Devolvemos el objeto CodigoQR creado para que pueda ser utilizado
        return códigoQR;
    }
}