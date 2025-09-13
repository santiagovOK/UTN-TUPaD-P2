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

public class FirmaDigital {
    // Atributos privados para FirmaDigital
    private String codigoHash; // Código hash de la firma digital
    private Date fecha; // Fecha de la firma digital
    private Usuario usuario; // Usuario asociado a la firma digital (Agregación - no crea el usuario)

    // Constructor que inicializa los atributos de la firma digital
    // Recibe el usuario existente (agregación), no lo crea
    public FirmaDigital(String codigoHash, Date fecha, Usuario usuario) {
        this.codigoHash = codigoHash; // Asignamos el código hash de la firma digital
        this.fecha = fecha; // Asignamos la fecha de la firma digital
        this.usuario = usuario; // Referencia al usuario existente (Agregación)
    }

    // Getter para obtener el código hash de la firma digital
    public String getCodigoHash() {
        return codigoHash; // Devolvemos el código hash de la firma digital
    }

    // Setter para modificar el código hash de la firma digital
    public void setCodigoHash(String codigoHash) {
        this.codigoHash = codigoHash; // Asignamos el nuevo código hash de la firma digital
    }

    // Getter para obtener la fecha de la firma digital
    public Date getFecha() {
        return fecha; // Devolvemos la fecha de la firma digital
    }

    // Setter para modificar la fecha de la firma digital
    public void setFecha(Date fecha) {
        this.fecha = fecha; // Asignamos la nueva fecha de la firma digital
    }

    // Getter para obtener el usuario asociado a la firma digital
    public Usuario getUsuario() {
        return usuario; // Devolvemos el usuario asociado a la firma digital
    }

    // Setter para modificar el usuario asociado a la firma digital
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario; // Asignamos el nuevo usuario asociado a la firma digital
    }

    // Método para mostrar la información completa de la firma digital (Tell, Don't Ask)
    public void mostrarInformacion() {
        System.out.println("Código Hash: " + codigoHash); // Imprimimos el código hash
        System.out.println("Fecha: " + fecha); // Imprimimos la fecha de la firma
        System.out.print("Firmado por - "); // Prefijo para información del usuario
        usuario.mostrarInformacion(); // Delegamos la presentación del usuario (mejor encapsulación)
    }
}