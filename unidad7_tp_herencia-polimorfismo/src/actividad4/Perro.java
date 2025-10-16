package actividad4;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Perro extends Animal {

    // Sobrescribimos el método `hacerSonido` para el Perro.
    @Override
    public void hacerSonido() {
        // Imprimimos el ladrido, que es el sonido específico del perro.
        System.out.println("El perro ladra: ¡Guau, guau!");
    }

    // Sobrescribimos el método `describirAnimal` para el Perro.
    @Override
    public void describirAnimal() {
        // Imprimimos una descripción específica del perro.
        System.out.println("Este es un perro, un animal doméstico.");
    }
}