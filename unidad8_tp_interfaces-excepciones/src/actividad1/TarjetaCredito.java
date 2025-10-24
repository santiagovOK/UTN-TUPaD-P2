package actividad1;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

 // Clase TarjetaCredito
 // Implementa la interfaz PagoConDescuento.
 // Puede procesar un pago y también aplicar una tasa de descuento.

public class TarjetaCredito implements PagoConDescuento {

    // Atributos privados
    private String numero;
    private double tasaDescuento; // Por ejemplo, un decimal 0.05 para un 5%

    // Constructor para crear una instancia de TarjetaCredito.

    public TarjetaCredito(String numero, double tasaDescuento) {
        this.numero = numero;
        this.tasaDescuento = tasaDescuento;
    }

    // Aplica el descuento al monto total usando la tasa de la tarjeta.
    // Implementa el método de la interfaz PagoConDescuento.

    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * this.tasaDescuento;
        double montoFinal = monto - descuento;

        System.out.println("Aplicando descuento de tarjeta de crédito (" + (this.tasaDescuento * 100) + "%)...");
        System.out.println("Monto original: $" + monto);
        System.out.println("Monto con descuento: $" + montoFinal);

        return montoFinal;
    }

    // Procesa el pago simulando una transacción con tarjeta de crédito.
    // Implementa el método de la interfaz Pago.

    @Override
    public void procesarPago(double monto) {
        // Simulación de la lógica de procesamiento de Tarjeta de Crédito (versión simple)
        System.out.println("Procesando pago de $" + monto + " con Tarjeta de Crédito.");
        System.out.println("Tarjeta: " + this.numero);
        System.out.println("Pago completado exitosamente.");
    }
}
