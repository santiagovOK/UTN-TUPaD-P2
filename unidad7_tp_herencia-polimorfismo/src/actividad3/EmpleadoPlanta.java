package actividad3;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

// Lo que diferenciará al EmpleadoPlanta del EmpleadoTemporal es que además de cobrar un `sueldoBase` (no cobra por hora como el temporal) cobrará un `bonoAnual`.
public class EmpleadoPlanta extends Empleado{

    // Atributo privado de EmpleadoPlanta, que se acoplará con los de la superclase
    private double bonoAnual;

    // Constructor de EmpleadoPlanta

    public  EmpleadoPlanta(String nombre, double sueldoBase, double bonoAnual) {
        super(nombre, sueldoBase);
        this.bonoAnual = bonoAnual;
    }

    // Método sobreescrito que está en la superclase, que suma el `sueldoBase` más el `bonoAnual`
    @Override
    public double calcularSueldo() {
        return sueldoBase + bonoAnual;
    }
}
