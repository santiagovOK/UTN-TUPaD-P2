/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna4;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Consigna4Main {
    public static void main(String[] args) {
        // Creamos múltiples bancos independientes (para testear agregación)
        Banco banco = new Banco("Banco Santander", 123456789);
        Banco bancoNacion = new Banco("Banco Nación", 987654321);
        
        // Creamos un objeto Cliente
        Cliente cliente = new Cliente("Santiago Varela", 12345678);

        // Crear tarjeta sin banco inicialmente
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito("1234567890123456", "12/25");
        
        // Asignar banco usando setter (agregación)        
        tarjetaDeCredito.setBanco(banco); 

        // Asociamos la tarjeta de crédito al cliente
        cliente.setTarjetaDeCredito(tarjetaDeCredito);

        // Mostramos la información del cliente, que incluye la información de la tarjeta de crédito y del banco (Tell Don't Ask)
        cliente.mostrarInformacion();
        
        // Demostramos agregación cambiando de banco
        System.out.println("\nCambio de banco (demostración de agregación):");
        tarjetaDeCredito.setBanco(bancoNacion);
        System.out.println("Tarjeta transferida al nuevo banco.");
        
        // Mostramos información después del cambio
        System.out.println("\nInformación después del cambio:");
        cliente.mostrarInformacion();
        
        // Verificamos la bidireccionalidad entre Cliente y TarjetaDeCredito
        System.out.println("\nVerificación de bidireccionalidad:");

        // Verificamos si el titular de la tarjeta es el cliente
        if (tarjetaDeCredito.getTitular() == cliente) {
            // Imprimimos que la verificación es correcta
            System.out.println("El titular de la tarjeta es el cliente.");
        } else {
            // Imprimimos que la verificación es incorrecta
            System.out.println("El titular de la tarjeta no es el cliente.");
        }

        // Verificamos si la tarjeta del cliente es la tarjeta creada
        if (cliente.getTarjetaDeCredito() == tarjetaDeCredito) {
            // Imprimimos que la verificación es correcta
            System.out.println("La tarjeta del cliente es la tarjeta creada.");
        } else {
            // Imprimimos que la verificación es incorrecta
            System.out.println("La tarjeta del cliente no es la tarjeta creada.");
        }
    }
}