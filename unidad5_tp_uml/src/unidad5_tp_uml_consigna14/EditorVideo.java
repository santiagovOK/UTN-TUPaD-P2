/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna14;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class EditorVideo {

    // Método de comportamiento para exportar un proyecto a un formato específico (Tell, Don't Ask)
    // Implementa la dependencia de creación con la clase Render
    public Render exportar(String formato, Proyecto proyecto) {

        // Validamos que los parámetros no sean nulos
        if (formato == null || proyecto == null) {
            System.out.println("Error: El formato y el proyecto no pueden ser nulos");
            return null;
        }

        // Creamos una nueva instancia de Render
        // Esto es una dependencia de creación porque EditorVideo es responsable de crear el objeto Render
        Render render = new Render(formato);

        // Configuramos el render con el proyecto
        // Esto establece la asociación unidireccional entre Render y Proyecto
        render.setProyecto(proyecto);

        // Mostramos un mensaje de exportación
        System.out.println("Exportando proyecto " + proyecto.getNombre() +
                          " al formato " + formato);

        return render;
    }
}