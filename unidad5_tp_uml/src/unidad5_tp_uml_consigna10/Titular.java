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
public class Titular {

    // Atributos privados de Titular
    private String nombre; // Nombre del titular
    private String dni; // Documento Nacional de Identidad del titular
    private CuentaBancaria cuentaBancaria; // Referencia a la cuenta bancaria asociada (Asociación)

    // Constructor de la clase Titular
    // Crea un nuevo titular con el nombre y DNI proporcionados
    public Titular(String nombre, String dni) {
        this.nombre = nombre; // Asigna el nombre proporcionado
        this.dni = dni; // Asigna el DNI proporcionado
        this.cuentaBancaria = null; // Inicialmente no tiene cuenta bancaria asociada
    }

    // Getter para obtener el nombre del titular
    public String getNombre() {
        return nombre; // Retorna el nombre
    }

    // Getter para obtener el DNI del titular
    public String getDni() {
        return dni; // Retorna el DNI
    }

    // Getter para obtener la cuenta bancaria asociada
    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria; // Retorna la cuenta bancaria
    }

    // Setter para establecer la cuenta bancaria asociada
    // Establece la cuenta bancaria del titular y mantiene la bidireccionalidad
    public void setCuentaBancaria(CuentaBancaria cuenta) {
        this.cuentaBancaria = cuenta; // Asigna la cuenta bancaria proporcionada
        // Mantiene la bidireccionalidad
        if (cuenta != null && cuenta.getTitular() != this) {
            cuenta.setTitular(this); // Establece la relación inversa
        }
    }

    // Método de comportamiento para mostrar la información del titular
    // Imprime la información del titular y su cuenta bancaria asociada
    public void mostrarInformacion() {
        System.out.println("Titular: " + nombre + " - DNI: " + dni); // Imprime el nombre y DNI
        if (cuentaBancaria != null) {
            cuentaBancaria.mostrarInformacion(); // Muestra la información de la cuenta bancaria
        }
    }
}