package actividad2;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Rectangulo extends Figura {

    // Atributos privados para la clase Rectangulo

    private double base;
    private double altura;

    public Rectangulo (String nombre, double base, double altura){
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    // No son necesarios getter y setters aquí para responder a la consigna

    // Creamos el método sobreescrito que se llama igual en la superclase para calcular el área específicamente para un rectángulo

    @Override
    public double calcularArea(){
        return base * altura;
    }

}

