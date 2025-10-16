package actividad2;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Actividad2Main {

    public static void main(String[] args) {

        // Creamos un array de tipo Figura para almacenar diferentes tipos de figuras.

        Figura[] figuras = new Figura[2];

        // Instanciamos objetos de las clases concretas y los guardamos en el array.

        // Guardamos un Círculo
        figuras[0] = new Circulo("Círculo 1", 5.0);
        // Guardamos un Rectángulo
        figuras[1] = new Rectangulo("Rectángulo 1", 10.0, 4.0);

        System.out.println("Calculando las áreas de todas las figuras:");

        // Recorremos el array para calcular y mostrar el área de cada figura (con el método sobreescrito en cada caso)

        for (Figura fig : figuras) {

            // Imprimimos el resultado formateado.
            // Usamos printf para redondear el área a dos decimales.

            System.out.printf("El área de la figura '%s' es: %.2f%n", fig.getNombre(), fig.calcularArea());
        }
    }
}
