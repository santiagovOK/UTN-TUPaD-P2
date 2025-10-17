package actividad5;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

// Representa un pago realizado a través de una transferencia bancaria. Uso de `implements` para vincular la interfaz.
public class Transferencia implements Pagable {

    // Atributos privados que almacenan los datos de la transferencia.
    private String cbuOrigen;
    private String cbuDestino;
    private double monto;

    // Constructor para inicializar un objeto de tipo Transferencia.

    public Transferencia(String origen, String destino, double monto) {
        this.cbuOrigen = origen;
        this.cbuDestino = destino;
        this.monto = monto;
    }

    // Implementación del método pagar() para la clase Transferencia.

    @Override
    public void pagar() {
        // Imprimimos un mensaje detallado que simula la operación de transferencia, aplicando polimorfismo gracias a la sobreescritura previa.
        System.out.println("Realizando transferencia de $" + this.monto +
                " desde CBU " + this.cbuOrigen +
                " hacia CBU " + this.cbuDestino);
    }
}