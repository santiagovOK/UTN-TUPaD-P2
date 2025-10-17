package actividad5;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

// Representa un pago realizado en efectivo. Uso de `implements` para vincular la interfaz.
public class Efectivo implements Pagable {

    // Atributo privado que almacena el monto del pago en efectivo.
    private double monto;

    // Constructor que inicializa un objeto de tipo Efectivo.
    public Efectivo(double monto) {
        this.monto = monto;
    }

    // Implementación concreta del método pagar() para la clase Efectivo, sobreescribiéndolo y cumpliendo con el polimorfismo

    @Override
    public void pagar() {
        // Imprimimos un mensaje en consola que simula la acción de pagar en efectivo, lo que lo diferencia de otros medios de pago
        System.out.println("Realizando pago en efectivo por un monto de: $" + this.monto);
    }
}