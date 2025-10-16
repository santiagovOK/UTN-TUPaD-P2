package actividad2;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Circulo extends Figura {

    // Atributos privados para la clase Circulo
    private double radio;

    // Constructor para la clase Circulo

    public Circulo(String nombre, double radio){
        super(nombre); // Llamamos al constructor de la clase padre con `super` para asignar el nombre, que es un atributo de esa clase
        this.radio = radio;
    }

    // No son necesarios getter y setters aquí para responder a la consigna

    // Sobreescribimos el método calcularArea() de la superclase abstracta `Figura`

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

}
