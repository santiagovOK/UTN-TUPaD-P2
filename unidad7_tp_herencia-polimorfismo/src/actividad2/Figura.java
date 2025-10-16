package actividad2;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public abstract class Figura {

    // Atributo privado para la clase Figura

    private String nombre;

    // Constructor para la clase figura

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el único atributo de la clase
    public String getNombre() {
        return nombre;
    }

    // Método abstracto que será sobreescrito en cada subclase, dado que los cálculos para Círculo y Rectángulo no son los mismos

    public abstract double calcularArea();
}
