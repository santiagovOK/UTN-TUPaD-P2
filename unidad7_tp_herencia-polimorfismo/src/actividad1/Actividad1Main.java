package actividad1;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Actividad1Main {

    public static void main(String[] args) {

        // Creamos la instancia de un Auto en base a la clase Vehiculo, demostrando herencia y polimorfismo
        Vehiculo miAuto = new Auto("Volkswagen", "Gol", 4);

        // Imprimimos mensaje previo que le avisa al usuario qué es lo que aparecerá
        System.out.println("\n - Información del vehículo creado - \n");

        // Llamamos al método `mostrarInfo()` a partir de la instancia creada
        miAuto.mostrarInfo();
    }
}
