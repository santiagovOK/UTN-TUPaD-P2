package actividad4;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Actividad4Main {
    public static void main(String[] args) {

        // Creamos una lista para almacenar objetos de tipo Animal (varios tipos, gracias al polimorfismo)
        List<Animal> animales = new ArrayList<>();

        // Creamos instancias (objetos) de cada subclase.
        Animal unPerro = new Perro();
        Animal unGato = new Gato();
        Animal unaVaca = new Vaca();

        // Añadimos los objetos a la lista de animales.
        animales.add(unPerro);
        animales.add(unGato);
        animales.add(unaVaca);

        // Recorremos la lista de animales para interactuar con cada uno.
        System.out.println("\n- Sonidos de los animales -\n");

        for (Animal animal : animales) {

            // Imprimimos la descripción específica de cada animal.
            animal.describirAnimal();

            // Llamamos al método hacerSonido() de cada animal.
            animal.hacerSonido();

        }
    }
}