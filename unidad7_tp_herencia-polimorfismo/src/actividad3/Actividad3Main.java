package actividad3;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Actividad3Main {
    public static void main(String[] args) {
        // Creamos una lista para almacenar objetos de tipo Empleado.
        List<Empleado> empleados = new ArrayList<>();

        // Instanciamos los objetos de las subclases añadiendo empleados a la lista

        empleados.add(new EmpleadoPlanta("Ana González", 45000, 5000));
        empleados.add(new EmpleadoTemporal("Carlos Rodríguez", 120, 25));
        empleados.add(new EmpleadoPlanta("Santiago Varela", 52000, 7500));

        System.out.println("\nTipos de empleados y sus sueldos");

        // Iteración sobre la lista para procesar cada empleado.
        for (Empleado emp : empleados) {
            // Invocamos el método de forma polimórfica.
            double sueldo = emp.calcularSueldo();

            // Usamos instanceof para clasificar el tipo de empleado, usando una estructura condicional
            // Sin esto, no se podría diferenciar con qué tipo de empleado estamos tratando desde la lista

            String tipoEmpleado;
            if (emp instanceof EmpleadoPlanta) {
                tipoEmpleado = "Empleado de Planta";
            } else if (emp instanceof EmpleadoTemporal) {
                tipoEmpleado = "Empleado Temporal";
            } else {
                tipoEmpleado = "Desconocido";
            }

            // Imprimimos la información completa de los empleados

            System.out.println("\n" + emp.getNombre() + "\nSueldo: " + sueldo + "\nTipo de Empleado: " + tipoEmpleado);
        }
    }
}