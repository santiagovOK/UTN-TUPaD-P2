package division_segura;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada.

// Solicita dos números y maneja ArithmeticException si el divisor es cero.

public class DivisionSegura {

    public static void main(String[] args) {

        // Creamos el objeto Scanner para leer la entrada del usuario.
        Scanner scanner = new Scanner(System.in);

        // Bloque try-catch
        try {
            // Solicitamos el dividendo.
            System.out.print("Ingrese el número dividendo (entero): ");
            int dividendo = scanner.nextInt(); // Leemos el primer número.

            // Solicitamos el divisor.
            System.out.print("Ingrese el número divisor (entero): ");
            int divisor = scanner.nextInt(); // Leemos el segundo número.

            // Intentamos realizar la división de enteros.
            // Esta operación lanzará ArithmeticException si el divisor es 0.
            int resultado = dividendo / divisor;

            // Imprimimos el resultado si la división fue exitosa.
            System.out.println("El resultado de la división es: " + resultado);

        } catch (ArithmeticException e) {
            // Capturamos la excepción específica de división por cero.
            System.out.println("Error: No se puede dividir por cero.");
        }
        // finally no es estrictamente necesario, aunque podría llamarse y colocar dentro scanner.close() para liberar recursos como buena práctica
    }
}