package actividad4;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

// Definimos la clase base para todas las formas de animales
public class Animal {

    // Método que imprime un sonido genérico del animal, destinado a ser sobreescrito por las subclases
    public void hacerSonido() {
        // Imprimimos un mensaje genérico
        System.out.println("El animal hace un sonido.");
    }

    // Método de describirAnimal, que será sobreescrito más allá de que la actividad no lo requiere. Creo que tiene más sentido así
    public void describirAnimal() {
        // Imprimimos una descripción básica
        System.out.println("Este es un animal.");
    }
}