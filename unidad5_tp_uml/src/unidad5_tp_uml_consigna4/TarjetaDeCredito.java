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
public class TarjetaDeCredito {
    // Atributos `private` de TarjetaDeCredito
    private String numero; // Número de la tarjeta de crédito
    private String fechaVencimiento; // Fecha de vencimiento de la tarjeta de crédito
    private Cliente titular; // Titular de la tarjeta de crédito
    private Banco banco; // Banco emisor de la tarjeta de crédito

    // Constructor único sin banco (para agregación)
    public TarjetaDeCredito(String numero, String fechaVencimiento) {
        this.numero = numero;         // Asignamos el número de la tarjeta de crédito
        this.fechaVencimiento = fechaVencimiento;         // Asignamos la fecha de vencimiento de la tarjeta de crédito
        this.titular = null;         // Inicializamos el titular de la tarjeta de crédito como nulo
        this.banco = null;         // Inicializamos el banco como nulo para agregación
    }

    // Getter para obtener el número de la tarjeta de crédito
    public String getNumero() {
        // Devolvemos el número de la tarjeta de crédito
        return numero;
    }

    // Getter para obtener la fecha de vencimiento de la tarjeta de crédito
    public String getFechaVencimiento() {
        // Devolvemos la fecha de vencimiento de la tarjeta de crédito
        return fechaVencimiento;
    }

    // Getter para obtener el titular de la tarjeta de crédito
    public Cliente getTitular() {
        // Devolvemos el titular de la tarjeta de crédito
        return titular;
    }

    // Setter para asignar el titular de la tarjeta de crédito
    public void setTitular(Cliente titular) {
        this.titular = titular;         // Asignamos el nuevo titular de la tarjeta de crédito
        // Verificamos si el titular no es nulo y si la tarjeta de crédito actual no es la tarjeta de crédito del titular
        if (titular != null && titular.getTarjetaDeCredito() != this) {
            titular.setTarjetaDeCredito(this);   // Asignamos la tarjeta de crédito actual al titular
        }
    }

    // Getter para obtener el banco emisor de la tarjeta de crédito
    public Banco getBanco() {
        // Devolvemos el banco emisor de la tarjeta de crédito
        return banco;
    }

    // Agregar setter para banco (agregación)
    public void setBanco(Banco banco) {
        this.banco = banco;         // Asignamos el nuevo banco emisor de la tarjeta de crédito
    }
    
    // Método de comportamiento mostrarInformacion (Tell Don't Ask)
    public void mostrarInformacion() {
        System.out.println("Número de tarjeta: " + numero); // Imprimimos el número de la tarjeta de crédito
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);         // Imprimimos la fecha de vencimiento de la tarjeta de crédito
        // Verificamos si el banco emisor no es nulo
        if (banco != null) {
            banco.mostrarInformacion(); // Mostramos la información del banco emisor
        } else {
            System.out.println("Sin banco asignado");         // Mensaje cuando no hay banco asignado
        }
    }
}
