package actividad1;

/*
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */


//Interfaz Pago
//Define el contrato básico para cualquier medio de pago.

public interface Pago {
    // Procesa un pago por un monto específico.
    void procesarPago(double monto);
}