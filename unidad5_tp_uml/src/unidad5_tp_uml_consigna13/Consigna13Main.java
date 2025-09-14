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
public class Consigna13Main {
    public static void main(String[] args) {
        // Creamos un objeto Usuario con nombre y email
        Usuario usuario = new Usuario("Santiago Varela", "santiago.varela@example.com");

        // Creamos un objeto GeneradorQR
        GeneradorQR generadorQR = new GeneradorQR();

        // Generamos un código QR utilizando el generador y capturamos el objeto creado
        // El generador crea un objeto CódigoQR y lo asocia con el usuario
        CodigoQR codigoGenerado = generadorQR.generar("1234", usuario);
        
        // Verificamos que la asociación unidireccional funciona correctamente
        System.out.println("Código QR generado: " + codigoGenerado.getValor());
        System.out.println("Usuario asociado: " + codigoGenerado.getUsuario().getNombre());
    }
}
