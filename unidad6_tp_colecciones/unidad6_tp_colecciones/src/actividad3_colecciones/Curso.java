package actividad3_colecciones;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Curso {
    // Atributos privados de Curso
    private String codigo;
    private String nombre;
    private Profesor profesor;

    // Constructor de Curso
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // Inicialmente sin profesor
    }

    // Setter
    public void setProfesor(Profesor p) {
        if (this.profesor == p) return; // Optimización

        // Desconectar del profesor anterior
        if (this.profesor != null) {
            Profesor old = this.profesor;
            this.profesor = null; // Evitar recursión
            old.eliminarCurso(this);
        }

        // Conectar al nuevo profesor
        this.profesor = p;
        if (p != null && !p.getCursos().contains(this)) {
            p.agregarCurso(this);
        }
    }
    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    // Método para mostrar información del curso, solicitado en la consigna
    public void mostrarInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: No asignado");
        }
    }
}