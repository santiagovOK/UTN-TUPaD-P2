/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna14;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Proyecto {

    // Atributos privados de Proyecto
    private String nombre;       // Atributo para almacenar el nombre del proyecto
    private int duracionMin;     // Atributo para almacenar la duración del proyecto en minutos

    // Constructor de la clase Proyecto
    // Recibe el nombre y la duración del proyecto como parámetros y los asigna a los atributos correspondientes
    public Proyecto(String nombre, int duracionMin) {

        // Validamos que el nombre no sea nulo o vacío
        if (nombre == null) {
            System.out.println("Error: El nombre del proyecto no puede ser nulo o vacío");
            return;
        }

        // Validamos que la duración sea un valor positivo
        if (duracionMin <= 0) {
            System.out.println("Error: La duración del proyecto debe ser un valor positivo");
            return;
        }

        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    // Getter para obtener el nombre del proyecto

    public String getNombre() {
        return nombre;
    }

    // Getter para obtener la duración del proyecto en minutos
    public int getDuracionMin() {
        return duracionMin;
    }

    // Getter para convertir la duración del proyecto a horas
    public double getDuracionHoras() {
        return duracionMin / 60.0;
    }
}
