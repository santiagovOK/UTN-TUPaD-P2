package actividad1;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Vehiculo {

    // Declaramos los atributos privados

    private String marca;
    private String modelo;

    // Constructor de la clase Vehiculo
    Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters necesarios para acceder a los atributos
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Método de la clase base solicitado

    public void mostrarInfo(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }
}
