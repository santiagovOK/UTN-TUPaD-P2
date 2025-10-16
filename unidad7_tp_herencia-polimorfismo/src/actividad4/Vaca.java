package actividad4;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Vaca extends Animal {

    // Sobrescritura del método hacerSonido para la Vaca.
    @Override
    public void hacerSonido() {
        // Imprimimos el sonido característico de la vaca.
        System.out.println("La vaca: ¡Muuuuu!");
    }

    // Sobrescritura del método describirAnimal para la Vaca.
    @Override
    public void describirAnimal() {
        // Imprimimos una descripción específica de la vaca.
        System.out.println("Esta es una vaca, un mamífero que suele vivir en el campo.");
    }
}