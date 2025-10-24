package actividad1;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

//Interfaz PagoConDescuento
//Extiende la interfaz Pago para añadir la funcionalidad de aplicar descuentos.

public interface PagoConDescuento extends Pago {

    // Aplica un descuento a un monto total.
    // `monto` entra con el monto original (double) y
    // devuelve el nuevo monto (double) después de aplicar el descuento.
    double aplicarDescuento(double monto);
}