/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna9;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Consigna9Main {
    public static void main(String[] args) {

        // Creamos un objeto Paciente con nombre y obra social
        Paciente paciente = new Paciente("Santiago Varela", "Avalian");

        // Creamos un objeto Profesional con nombre y especialidad
        Profesional profesional = new Profesional("Dr. Ana Gómez", "Cardiología");

        // Creamos un objeto CitaMedica con fecha, hora, paciente y profesional
        CitaMedica cita = new CitaMedica("2025-09-13", "14:30", paciente, profesional);

        // Mostramos la información de la cita médica (Tell, Don't Ask)
        cita.mostrarInformacionCita();

        // Verificación de la consistencia de las relaciones
        // Comprueba que las referencias entre los objetos sean correctas
        System.out.println("\nVerificación de relaciones:");

        // Verificación de la relación entre CitaMedica y Paciente
        if (cita.getPaciente() != null) {
            System.out.println("La cita tiene un paciente asociado.");
        } else {
            System.out.println("La cita no tiene un paciente asociado.");
        }

        // Verificación de la relación entre CitaMedica y Profesional
        if (cita.getProfesional() != null) {
            System.out.println("La cita tiene un profesional asociado.");
        } else {
            System.out.println("La cita no tiene un profesional asociado.");
        }
    }
}