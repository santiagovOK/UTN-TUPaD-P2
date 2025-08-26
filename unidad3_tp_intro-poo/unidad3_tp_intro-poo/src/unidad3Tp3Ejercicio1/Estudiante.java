/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3Tp3Ejercicio1;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Estudiante {
    
    // Construimos el estado interno o "private" de Estudiante
    private String nombre = "Santiago";          // Variable para primer nombre del estudiante
    private String apellido = "Varela";         // Variable para apellido del estudiante
    private String curso = "Programacion 2";    // Variable para curso o asignatura que cursa
    private double calificacion = 8.31;         // Variable para nota o calificacion actual (de 0 a 10)

    // Método para mostrar información del estudiante
    public void mostrarInfo() {
        System.out.println("\nInformacion del estudiante: \n");
        System.out.println("Nombre: " + nombre + "\nApellido: " + apellido);
        System.out.println("\nCurso: " + curso);
        System.out.println("\nCalificacion: " + calificacion);
    }
    
    // Método para incrementar la calificación
    public void subirCalificacion(double puntos) {
        if (puntos < 0) {                        // Caso para evitar puntos negativos
            System.out.println("Error: los puntos a subir deben ser positivos");
            return;                              // Salimos del método sin retornar valor
        } else {
            calificacion += puntos;              // Sumamos puntos a la calificación
            if (calificacion > 10.0) {           // Limitamos la calificación máxima
                calificacion = 10.0;
            }
        }
     
    }

    // Método para bajar la calificación
    public void bajarCalificacion(double puntos) {
        if (puntos < 0) {                           // Validación de puntos negativos
            System.out.println("Error: los puntos a bajar deben ser positivos");
            return;                                 // Salir del método
        } else {
            calificacion -= puntos;                 // Caso para restar puntos de la calificación
            if (calificacion < 0) {                 // Condicion para evitar calificaciones menores a 0
                calificacion = 0;                   // Limitamos la calificación mínima
            }
        }
      
    }
}

