package actividad5;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

// Esta interfaz define un "contrato" para cualquier objeto que pueda ser utilizado como un medio de pago.
public interface Pagable {


     // Creamos el método pagar(), que obliga a las clases implementadoras a definir cómo se ejecuta un pago.
     // Su propósito es establecer un comportamiento común para todos los medios de pago.
     // Todas las clases que implementen Pagable deberán escribir este método, llamandolo de la misma manera, solo diciendo "qué hacer".
    void pagar();
}
