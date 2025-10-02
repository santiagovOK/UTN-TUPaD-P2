package actividad3_colecciones;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Profesor {
    // Atributos privados de Profesor
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    // Constructor de Profesor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    // Métodos similares a Setters (Tell don't ask)

    public void agregarCurso(Curso c) {
        if (cursos.contains(c)) return;

        cursos.add(c);
        if (c.getProfesor() != this) {
            c.setProfesor(this);
        }
    }

    public void eliminarCurso(Curso c) {
        if (!cursos.contains(c)) return;

        cursos.remove(c);
        if (c.getProfesor() == this) {
            c.setProfesor(null);
        }
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return new ArrayList<>(cursos); // Devolver copia para evitar modificaciones externas
    }

    // Métodos para listar cursos y mostrar información

    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println("Código: " + curso.getCodigo() + ", Nombre: " + curso.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
    }
}