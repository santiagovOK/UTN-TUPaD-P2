package actividad5;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

// Representa un pago realizado con una tarjeta de crédito. Uso de `implements` para vincular la interfaz.
public class TarjetaCredito implements Pagable {

    // Atributos privados para almacenar los datos de la tarjeta.
    private String numero; // no uso tipo numérico ya que no se harán operaciones matemáticas con el número de la tarjeta. Esto sería conveniente si utilizara `numero` parcialmente, mostrando los últimos números de la tarjeta por ejemplo.
    private String fechaVencimiento;
    private String codigoSeguridad; // lo mismo que en `numero` respecto al tipo de dato, principalmente porque se evitan errores al usar el 0 al comienzo.
    private double monto;

    // Constructor para inicializar un objeto de tipo TarjetaCredito.
    public TarjetaCredito(String numero, String fechaVenc, String codSeg, double monto) {
        this.numero = numero;
        this.fechaVencimiento = fechaVenc;
        this.codigoSeguridad = codSeg;
        this.monto = monto;
    }

    // Implementación del método pagar() para la clase TarjetaCredito.

    @Override
    public void pagar() {
        // Imprimimos un mensaje que simula la autorización del pago, sobreescribiendo para polimorfismo.
        System.out.println("Autorizando pago con tarjeta de crédito " + numero + " por un monto de: $" + monto  );
    }
}
