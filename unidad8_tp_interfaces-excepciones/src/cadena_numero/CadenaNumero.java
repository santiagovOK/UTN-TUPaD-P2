package cadena_numero;

/*
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada.

// Clase que demuestra la conversión segura de String a int (versión con finally).
// Lee texto del usuario y maneja NumberFormatException si el texto no corresponde a un número entero válido.

public class CadenaNumero {

    public static void main(String[] args) {

        // Creamos el objeto Scanner para leer la entrada del usuario.
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitamos el texto al usuario.
            System.out.print("Ingrese un texto para convertir a número entero: ");

            // Leemos la línea completa de texto ingresada por el usuario.
            String entradaUsuario = scanner.nextLine();

            // Intentamos realizar la conversión.
            // Integer.parseInt lanza NumberFormatException si el String no contiene un entero válido.
            int numeroConvertido = Integer.parseInt(entradaUsuario);

            // Imprimimos el resultado si la conversión fue exitosa.
            System.out.println("Conversión exitosa. El número ingresado es: " + numeroConvertido);

        } catch (NumberFormatException e) {
            // Capturamos la excepción si el formato del número es incorrecto.
            System.out.println("Error: El texto ingresado no es un número entero válido.");
        } finally {
            // Cerramos el scanner para liberar recursos del sistema, dentro del finally que se ejecuta siempre
            scanner.close();
        }
    }
}
