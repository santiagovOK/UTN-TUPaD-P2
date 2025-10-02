package actividad2_colecciones;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Autor {
    // Atributos privados de Autor
    private String id; // Identificador único del autor
    private String nombre; // Nombre del autor
    private String nacionalidad; // Nacionalidad del autor

    // Constructor principal de Autor
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Método solicitado
    public void mostrarInfo() {
        System.out.println("Autor: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Nacionalidad: " + nacionalidad);
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

}