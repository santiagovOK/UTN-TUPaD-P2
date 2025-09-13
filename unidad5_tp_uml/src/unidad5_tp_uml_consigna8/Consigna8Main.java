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
public class Consigna8Main {
    public static void main(String[] args) {
        // Creamos un nuevo usuario
        Usuario usuario = new Usuario("Santiago Varela", "santiago.varela@example.com");

        // El documento crea su firma digital (Composición)
        Documento documento = new Documento("Trabajo Integrador", "Contenido del trabajo integrador", usuario);
        
        // Mostramos la información del usuario
        System.out.println("- Información del Usuario -");
        usuario.mostrarInformacion();

        // Mostramos la información completa del documento (incluye su firma)
        System.out.println("\n- Información completa del documento -");
        documento.mostrarInformacionCompleta();
        
        // Accedemos a la firma a través del documento (respetando la composición)
        System.out.println("\n- Acceso a la firma por documento -");
        FirmaDigital firma = documento.getFirmaDigital();
        System.out.println("Código Hash: " + firma.getCodigoHash());
        
        // Verificamos las relaciones implementadas
        System.out.println("\n-VERIFICACIÓN DE RELACIONES -");
        System.out.println("Composición (Documento - FirmaDigital): El documento posee la firma.");
        System.out.println("Agregación (FirmaDigital - Usuario): La firma referencia al usuario existente");
        
        // Verificamos que es la misma instancia (composición)
        System.out.println("La firma pertenece al documento: " + (documento.getFirmaDigital() != null));
    }
}