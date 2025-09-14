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
public class Render {

    // Atributos privados de Render
    private String formato;     // Atributo para almacenar el formato del render
    private Proyecto proyecto;     // Atributo para almacenar la referencia al proyecto asociado (asociación unidireccional con Proyecto)

    // Constructor de la clase Render
    // Recibe el formato como parámetro y lo asigna al atributo correspondiente
    public Render(String formato) {

        // Validamos que el formato no sea nulo
        if (formato == null) {
            System.out.println("Error: El formato no puede ser nulo");
            return;
        }

        this.formato = formato;
    }

    // Getter para obtener el formato del render

    public String getFormato() {
        return formato;
    }

    // Setter para establecer el proyecto asociado al render
    // Este setter es necesario para establecer la asociación unidireccional con la clase Proyecto
    public void setProyecto(Proyecto proyecto) {

        // Validamos que el proyecto no sea nulo
        if (proyecto == null) {
            System.out.println("Error: El proyecto no puede ser nulo");
            return;
        }
        this.proyecto = proyecto;
    }

    // Getter para obtener el proyecto asociado al render
    public Proyecto getProyecto() {
        return proyecto;
    }
}
