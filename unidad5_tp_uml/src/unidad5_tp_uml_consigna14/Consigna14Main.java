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

public class Consigna14Main {
    public static void main(String[] args) {

        // Creamos un nuevo proyecto con nombre y duración
        Proyecto proyecto = new Proyecto("Video largo sobre POO en Java", 120);

        // Creamos un nuevo editor de video
        EditorVideo editor = new EditorVideo();

        // Exportamos el proyecto a un formato específico (Tell, Don't Ask)
        // Esto demuestra la relación entre EditorVideo y Proyecto y la dependencia de creación con la clase Render
        Render render = editor.exportar("MP4", proyecto);

        // Mostramos información adicional sobre el proyecto
        System.out.println("\nInformación del proyecto:");
        System.out.println("Nombre: " + proyecto.getNombre());
        System.out.println("Duración en minutos: " + proyecto.getDuracionMin());
        System.out.println("Duración en horas: " + proyecto.getDuracionHoras());

        // Mostramos información adicional sobre el render
        System.out.println("\nInformación del render:");
        System.out.println("Formato: " + render.getFormato());
        System.out.println("Proyecto asociado: " + proyecto.getNombre());
    }
}
