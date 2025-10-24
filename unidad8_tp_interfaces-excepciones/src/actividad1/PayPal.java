package actividad1;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */


 // Implementa la interfaz Pago para procesar pagos a través de PayPal.
 // Esta clase no aplica descuentos (así la diferenciamos de `TarjetaCredito` en cuanto al uso de la interfaz)

public class PayPal implements Pago {

    // Atributo privado para almacenar el email de la cuenta de PayPal
    private String email;

    // Constructor para crear una instancia de PayPal.

    public PayPal(String email) {
        this.email = email;
    }

    // Procesa el pago simulando una transacción de PayPal.
    // Implementa el método de la interfaz Pago.

    @Override
    public void procesarPago(double monto) {
        // Simulación de la lógica de procesamiento de PayPal
        System.out.println("Procesando pago de $" + monto + " con PayPal.");
        System.out.println("Cuenta de PayPal: " + this.email);
        System.out.println("Pago completado exitosamente.");
    }

}