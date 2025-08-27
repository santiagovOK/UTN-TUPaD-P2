/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3Tp3Ejercicio4;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Gallina {
    
    // Construimos el estado interno o "private" de Gallina

    private int idGallina; // Variable que almacena idGallina, en enteros
    private int edad; // Variable para la edad actual de la gallina en años enteros
    private int huevosPuestos; // Variable para cantidad total de huevos que ha puesto la gallina, en enteros

    public int getIdGallina() {
        return idGallina;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public int getHuevosPuestos() {
        return huevosPuestos;
    }
    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    
    // Método requerido ponerHuevo(), para simular la puesta de huevos. Recibe la cantidad de huevos a agregar
    public void ponerHuevo(int cantidad) {
        // Estructura condicional para invalidar 0 y negativos en el agregado desde cantidad
        if (cantidad <= 0) {
            System.out.println("Cantidad invalida para poner huevos (debe ser > 0)");
            return;                 // Salimos con return sin cambiar nada
        } else {
        huevosPuestos += cantidad;   // Aumenta el contador de huevos en caso positivo de cantidad
        }
    }

    // Método solicitado envejecer() para simular el envejecimiento de la gallina. Recibe el número de años que debe envejecer
    public void envejecer(int anios) {
        // Estructura condicional para invalidar 0 y negativos en el agregado desde anios
        if (anios <= 0) {
            System.out.println("Valor invalido para envejecer (debe ser > 0)");
            return;                 // Salimos con return sin cambiar nada
        } else {
            edad += anios;               // aumenta la edad de la gallina
        }
    }

    // Metodo mostrarEstado() solicitado para imprimir el estado actual de la gallina
    public void mostrarEstado() {
        System.out.println(
            "ID de la gallina: " + idGallina +
            "\nEdad de la gallina: " + edad +
            "\nHuevos puestos por la gallina: " + huevosPuestos + "\n"
        );
    }
}
