package actividad3_colecciones;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

public class Actividad3Main {
    public static void main(String[] args) {
        // Creamos la instancia Universidad
        Universidad universidad = new Universidad("Universidad Ejemplo");

        // 1. Creamos 3 profesores y 5 cursos
        Profesor profesor1 = new Profesor("P001", "Juan Pérez", "Matemáticas");
        Profesor profesor2 = new Profesor("P002", "María Gómez", "Física");
        Profesor profesor3 = new Profesor("P003", "Carlos López", "Química");

        // Cursos
        Curso curso1 = new Curso("C001", "Álgebra");
        Curso curso2 = new Curso("C002", "Cálculo");
        Curso curso3 = new Curso("C003", "Mecánica");
        Curso curso4 = new Curso("C004", "Termodinámica");
        Curso curso5 = new Curso("C005", "Electromagnetismo");

        // 2. Agregamos profesores y cursos a la universidad
        universidad.agregarProfesor(profesor1);
        universidad.agregarProfesor(profesor2);
        universidad.agregarProfesor(profesor3);

        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);

        // 3. Asignamos profesores a cursos usando asignarProfesorACurso()
        universidad.asignarProfesorACurso("C001", "P001");
        universidad.asignarProfesorACurso("C002", "P001");
        universidad.asignarProfesorACurso("C003", "P002");
        universidad.asignarProfesorACurso("C004", "P002");
        universidad.asignarProfesorACurso("C005", "P003");

        // 4. Listamos los cursos con su profesor correspondiente
        System.out.println("\nCursos con sus profesores:");
        universidad.listarCursos();

        // 4. Listamos los profesores con sus cursos
        System.out.println("\nProfesores con sus cursos:");
        universidad.listarProfesores();

        // 5. Cambiamos el profesor de un curso y verificamos sincronización mutua
        System.out.println("\nCambiar profesor del curso C001:");
        universidad.asignarProfesorACurso("C001", "P002");
        System.out.println("Curso C001 después del cambio:");
        universidad.buscarCursoPorCodigo("C001").mostrarInfo();
        System.out.println("Profesor P001 después del cambio:");
        universidad.buscarProfesorPorId("P001").mostrarInfo();
        System.out.println("Profesor P002 después del cambio:");
        universidad.buscarProfesorPorId("P002").mostrarInfo();

        // 6. Removemos un curso y confirmamos que ya no aparece en la lista del profesor
        System.out.println("\nRemover curso C002:");
        universidad.eliminarCurso("C002");
        System.out.println("Profesor P001 después de remover curso C002:");
        universidad.buscarProfesorPorId("P001").mostrarInfo();

        // 7. Removemos un profesor y dejamos profesor = null en los cursos que dictaba
        System.out.println("\nRemover profesor P003:");
        universidad.eliminarProfesor("P003");
        System.out.println("Curso C005 después de remover profesor P003:");
        universidad.buscarCursoPorCodigo("C005").mostrarInfo();

        // 8. Mostramos el reporte de cantidad de cursos por profesor
        System.out.println("\nReporte: cantidad de cursos por profesor:");
        for (Profesor profesor : universidad.getProfesores()) {
            System.out.println(profesor.getNombre() + ": " + profesor.getCursos().size() + " cursos");
        }
    }
}