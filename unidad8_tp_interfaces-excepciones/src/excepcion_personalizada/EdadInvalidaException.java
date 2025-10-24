package excepcion_personalizada;

/*
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

// Excepción personalizada para manejar casos donde la edad está fuera de un rango válido (0 a 120).
// Al extender de "Exception", la convertimos en una "checked exception" (excepción revisada).

public class EdadInvalidaException extends Exception {

     // Constructor que acepta un mensaje de error.
     // El mensaje que describe por qué la edad es inválida.

    public EdadInvalidaException(String mensaje) {
        // Llamamos al constructor de la clase padre (Exception). Esto almacena el mensaje de error, que luego se recupera con el método getMessage().
        super(mensaje);
    }
}
