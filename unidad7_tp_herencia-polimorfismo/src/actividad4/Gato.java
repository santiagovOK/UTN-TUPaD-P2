package actividad4;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Gato extends Animal {

    // Sobrescritura del método `hacerSonido` para el Gato.
    @Override
    public void hacerSonido() {
        // Imprimimos el maullido, que es el sonido característico del gato.
        System.out.println("El gato maúlla: ¡Miau, miau!");
    }

    // Sobrescritura del método `describirAnimal` para el Gato.

    @Override
    public void describirAnimal() {
        // Imprimimos una descripción específica del gato.
        System.out.println("Este es un gato, un animal doméstico.");
    }
}
