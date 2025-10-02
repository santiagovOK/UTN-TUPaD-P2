package actividad3_colecciones;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    // Constructor de la clase Universidad
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // Métodos para agregar elementos

    public void agregarProfesor(Profesor p) {
        if (!profesores.contains(p)) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }

    // Método para asignar profesor a curso

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if (curso != null && profesor != null) {
            curso.setProfesor(profesor);
        }
    }

    // Métodos para listar elementos
    public void listarProfesores() {
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
            System.out.println("---");
        }
    }

    public void listarCursos() {
        for (Curso curso : cursos) {
            curso.mostrarInfo();
            System.out.println("---");
        }
    }

    // Métodos para buscar elementos
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }

    // Métodos para eliminar elementos
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            curso.setProfesor(null); // Rompemos relación con profesor
            cursos.remove(curso);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // Crear copia explícita para evitar modificaciones durante iteración
            List<Curso> cursosACopiar = new ArrayList<>(profesor.getCursos());
            for (Curso curso : cursosACopiar) {
                curso.setProfesor(null);
            }
            profesores.remove(profesor);
        }
    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public List<Profesor> getProfesores() {
        return new ArrayList<>(profesores); // Devolución de copia para evitar modificaciones externas
    }

    public List<Curso> getCursos() {
        return new ArrayList<>(cursos); // Devolución copia para evitar modificaciones externas
    }
}