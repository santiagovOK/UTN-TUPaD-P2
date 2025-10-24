package excepcion_personalizada;

/*
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

import java.util.InputMismatchException;
import java.util.Scanner;

// Clase principal que prueba la excepción personalizada EdadInvalidaException. Solicita una edad y la valida.

public class ValidadorEdad {

    public static void main(String[] args) {

        // Usamos try-with-resources para el Scanner.
        try (Scanner scanner = new Scanner(System.in)) {

            // Solicitamos la edad al usuario.
            System.out.print("Ingrese una edad para validar (entre 0 y 120): ");
            int edad = scanner.nextInt(); // Puede lanzar InputMismatchException

            // Intentamos validar la edad.
            // Llamamos al método que contiene la lógica y que puede lanzar nuestra excepción.
            validarEdad(edad);

            // Si el programa llega aquí, la validación fue exitosa.
            System.out.println("Edad ingresada (" + edad + ") es válida.");

        } catch (EdadInvalidaException e) {
            // Capturamos NUESTRA excepción personalizada.
            System.out.println("Error de validación: " + e.getMessage());
        } catch (InputMismatchException e) {
            // Capturamos si la entrada no es un número entero.
            System.out.println("Error de entrada: Debe ingresar un número entero.");
        }
    }

    //  Valida si una edad está en el rango permitido (0-120).
    // `EdadInvalidaException` es la excepción personalizada para manejar si la edad es menor a 0 o mayor a 120.

    public static void validarEdad(int edad) throws EdadInvalidaException {
        // Esta es la regla de negocio que debemos validar
        if (edad < 0 || edad > 120) {

            // Usamos "throw" para lanzar una nueva instancia de nuestra excepción.
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120. Valor recibido: " + edad);
        }

        // Si no se cumple la condición, el método termina normalmente y no se lanza ninguna excepción.
    }
}
