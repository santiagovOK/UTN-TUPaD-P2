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
public class CitaMedica {
    // Atributos privados de CitaMedica
    private String fecha;            // Fecha de la cita
    private String hora;             // Hora de la cita
    private Paciente paciente;       // Paciente asociado a la cita (Asociación unidireccional)
    private Profesional profesional; // Profesional asociado a la cita (Asociación unidireccional)

    // Constructor de la clase CitaMedica
    // Inicializa los atributos fecha, hora, paciente y profesional con los valores proporcionados
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    // Getter para obtener la fecha de la cita
    public String getFecha() {
        return fecha;       // Retorna el valor del atributo fecha
    }

    // Getter para obtener la hora de la cita
    public String getHora() {
        return hora;       // Retorna el valor del atributo hora
    }

    // Getter para obtener el paciente asociado a la cita
    public Paciente getPaciente() {
        return paciente;         // Retorna el valor del atributo paciente
    }

    // Getter para obtener el profesional asociado a la cita
    public Profesional getProfesional() {
        return profesional;        // Retorna el valor del atributo profesional
    }

    // Método de comportamiento que muestra la información de la cita (Tell Don't Ask)
    public void mostrarInformacionCita() {
        System.out.println("\nInformación de la Cita Médica:");
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Paciente:");
        paciente.mostrarInformacionPaciente(); // Delegamos la responsabilidad al objeto Paciente
        System.out.println("Profesional:");
        profesional.mostrarInformacionProfesional(); // Delegamos la responsabilidad al objeto Profesional
    }
}
