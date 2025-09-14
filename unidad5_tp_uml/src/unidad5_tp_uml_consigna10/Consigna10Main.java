/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna10;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Consigna10Main {
    public static void main(String[] args) {

        // Creamos un nuevo titular
        Titular titular = new Titular("Santiago Varela", 12345678);

        // Creamos una nueva cuenta bancaria con CBU, saldo inicial y código de clave de seguridad
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 1000.0, "1234");

        // Establecemos la relación bidireccional entre el titular y la cuenta bancaria
        titular.setCuentaBancaria(cuenta);

        // Mostramos la información del titular, incluyendo la cuenta bancaria
        titular.mostrarInformacion();

        // Verificamos la bidireccionalidad
        System.out.println("\nVerificación de bidireccionalidad:");
        if (cuenta.getTitular() == titular) {
            System.out.println("El titular de la cuenta es el mismo que el titular creado.");
        } else {
            System.out.println("El titular de la cuenta no es el mismo que el titular creado.");
        }
        if (titular.getCuentaBancaria() == cuenta) {
            System.out.println("La cuenta del titular es la misma que la cuenta creada.");
        } else {
            System.out.println("La cuenta del titular no es la misma que la cuenta creada.");
        }

        // Modificamos el código de la clave de seguridad
        cuenta.getClaveSeguridad().setCodigo("4321");
        System.out.println("\nEl código fue cambiado a 4321");

        // Mostramos la información actualizada de la cuenta bancaria
        System.out.println("\nInformación actualizada de la cuenta bancaria:");
        cuenta.mostrarInformacion();
    }
}