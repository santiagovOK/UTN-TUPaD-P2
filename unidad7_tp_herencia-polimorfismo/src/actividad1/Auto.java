package actividad1;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

// Añadimos en esta primera línea `extends` para la herencia desde `Vehiculo`
public class Auto extends Vehiculo {

    // Declaramos el único atributo privado que se agrega en esta clase para encapsulamiento

    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    @Override

    public void mostrarInfo(){
        System.out.println("Características del auto: ");
        super.mostrarInfo();
        System.out.println("Puertas: " + cantidadPuertas);
    }
}
