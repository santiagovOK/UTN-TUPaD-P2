/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna8;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
import java.util.Date;

public class Documento {
    // Atributos privados para Documento
    private String titulo; // Título del documento
    private String contenido; // Contenido del documento
    private FirmaDigital firmaDigital; // El documento posee y controla la firma (Composición)

    // Constructor que inicializa los atributos del documento
    // Crea automáticamente la firma digital (Composición)
    public Documento(String titulo, String contenido, Usuario usuario) {
        this.titulo = titulo; // Asignamos el título del documento
        this.contenido = contenido; // Asignamos el contenido del documento
            // El documento crea y posee la firma (Composición)
        this.firmaDigital = new FirmaDigital("a6f30815a43f38ec6de95b9a9d74da37", new Date(), usuario);
    }

    // Getter para obtener el título del documento
    public String getTitulo() {
        return titulo; // Devolvemos el título del documento
    }

    // Setter para modificar el título del documento
    public void setTitulo(String titulo) {
        this.titulo = titulo; // Asignamos el nuevo título del documento
    }

    // Getter para obtener el contenido del documento
    public String getContenido() {
        return contenido; // Devolvemos el contenido del documento
    }

    // Setter para modificar el contenido del documento
    public void setContenido(String contenido) {
        this.contenido = contenido; // Asignamos el nuevo contenido del documento
    }

    // Getter para acceder a la firma digital (COMPOSICIÓN)
    public FirmaDigital getFirmaDigital() {
        return firmaDigital; // Devolvemos la firma digital que posee el documento
    }

    // Método de comportamiento para mostrar información completa (Tell, Don't Ask)
    public void mostrarInformacionCompleta() {
        System.out.println("\n- Documento -");
        System.out.println("Título: " + titulo);
        System.out.println("Contenido: " + contenido);
        System.out.println("\n- Firma Digital -");
        firmaDigital.mostrarInformacion(); // Delegamos a la firma que poseemos
    }

    // Método de comportamiento para mostrar solo información del documento
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo); // Imprimimos el título del documento
        System.out.println("Contenido: " + contenido); // Imprimimos el contenido del documento
    }
}
