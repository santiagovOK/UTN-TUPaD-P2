package actividad3;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

// La diferencia que plantié respecto a EmpleadoPlanta es que EmpleadoTemporal cobra por horas. Por lo tanto el cálculo es distinto en ese sentido
public class EmpleadoTemporal extends Empleado {

    // Atributos privados específicos para el cálculo por horas que agregamos para la clase EmpleadoTemporal
    private int horasTrabajadas;
    private double pagoPorHora;

    // Constructor para EmpleadoTemporal
    // El sueldo base se inicializa a 0 ya que no aplica, pero hay que llamarlo igual
    public EmpleadoTemporal(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, 0);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = tarifaPorHora;
    }

    // Implementamos cálculo de sueldo para un empleado temporal, sobreescribiendo `calcularSueldo`
    @Override
    public double calcularSueldo() {
        return horasTrabajadas * pagoPorHora;
    }
}
