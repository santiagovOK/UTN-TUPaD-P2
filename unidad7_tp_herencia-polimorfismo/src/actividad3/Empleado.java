package actividad3;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public abstract class Empleado {

    // Atributos comunes a todos los empleados de la clase base Empleado
    private String nombre;
    protected double sueldoBase; // Atributo `protected` para acceso directo en subclases.

    // Constructor para inicializar los atributos de Empleado, que serán comunes en el resto de las subclases
    public Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    // Getter para obtener el nombre del empleado.
    public String getNombre() {
        return nombre;
    }

    // Método abstracto para el cálculo del sueldo, solicitado en la consigna
    // Se sobrescribirá en las subclases para hacer su propio cálculo
    public abstract double calcularSueldo();
}