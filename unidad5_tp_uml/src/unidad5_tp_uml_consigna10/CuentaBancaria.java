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
public class CuentaBancaria {

    // Atributos privados de CuentaBancaria
    private String cbu; // Código único de la cuenta bancaria
    private double saldo; // Saldo actual de la cuenta
    private ClaveSeguridad claveSeguridad; // Clave de seguridad asociada a la cuenta
    private Titular titular; // Titular de la cuenta bancaria

    // Constructor de la clase CuentaBancaria
    // Crea una nueva cuenta bancaria con el CBU, saldo inicial y código de clave de seguridad proporcionados
    public CuentaBancaria(String cbu, double saldo, String codigo) {
        this.cbu = cbu; // Asigna el CBU proporcionado
        this.saldo = saldo; // Asigna el saldo inicial proporcionado
        this.claveSeguridad = new ClaveSeguridad(codigo); // Crea una nueva clave de seguridad con el código proporcionado
        this.titular = null; // Inicialmente no tiene titular asociado
    }

    // Getter para obtener el CBU de la cuenta bancaria
    public String getCbu() {
        return cbu; // Retorna el CBU
    }

    // Getter para obtener el saldo de la cuenta bancaria
    public double getSaldo() {
        return saldo; // Retorna el saldo
    }

    // Setter para establecer el saldo de la cuenta bancaria
    public void setSaldo(double saldo) {
        this.saldo = saldo; // Asigna el saldo proporcionado
    }

    // Getter para obtener la clave de seguridad asociada
    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad; // Retorna la clave de seguridad
    }

    // Getter para obtener el titular de la cuenta bancaria
    public Titular getTitular() {
        return titular; // Retorna el titular
    }

    // Setter para establecer el titular de la cuenta bancaria
    // Establece el titular de la cuenta bancaria y mantiene la bidireccionalidad
    public void setTitular(Titular titular) {
        this.titular = titular; // Asigna el titular proporcionado
        // Mantiene la bidireccionalidad
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this); // Establece la relación inversa
        }
    }

    // Método de comportamiento para mostrar la información de la cuenta bancaria
    // Imprime la información de la cuenta bancaria, incluyendo la clave de seguridad y el titular
    public void mostrarInformacion() {
        System.out.println("Cuenta Bancaria: CBU " + cbu + " - Saldo: " + saldo); // Imprime el CBU y el saldo
        claveSeguridad.mostrarInformacion(); // Muestra la información de la clave de seguridad
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombre() + " - DNI: " + titular.getDni()); // Muestra la información del titular
        }
    }
}