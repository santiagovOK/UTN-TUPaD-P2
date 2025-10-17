package actividad5;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

// Esta clase se encarga de procesar diferentes formas de pago.
// Si bien esta clase no está solicitada en la consigna, la cree para cumplir con el Principio de Responsabilidad Única, que dicta que Actividad5Main (la clase principal) inicie y gestione solo el flujo principal de la aplicación (en resumen).
public class ProcesadorPagos {

    // Constructor por defecto de la clase No necesita inicializar atributos.
    public ProcesadorPagos() {
    }


     // Procesa un pago utilizando cualquier medio que implemente la interfaz Pagable.
     // Este método es un ejemplo de polimorfismo, ya que la acción concreta de "pagar" dependerá del objeto real que se le pase como argumento (Tarjeta, Efectivo, etc.).

    public void procesarPago(Pagable medioDePago) {
        // Validamos que el objeto recibido no sea nulo antes de usarlo.
        if (medioDePago == null) {
            System.out.println("Se intentó procesar un medio de pago nulo.");
            return; // Salimos del método para evitar un NullPointerException.
        }

        // Imprimimos un mensaje genérico para indicar el inicio del proceso.
        System.out.println("Iniciando procesamiento de pago...");

        // Le "decimos" al objeto que se pague a sí mismo.
        // Esto aplica el principio "Tell, Don't Ask".
        medioDePago.pagar();

        // Imprimimos un mensaje para indicar que el proceso ha finalizado.
        System.out.println("Procesamiento de pago finalizado.");
    }
}
