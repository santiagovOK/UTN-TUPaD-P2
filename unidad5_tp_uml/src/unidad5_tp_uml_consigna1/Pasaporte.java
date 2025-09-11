/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna1;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Pasaporte {
    // Construimos el estado interno o "private" de Pasaporte

    private String numero;
    private String fechaEmision;
    
    // Composición: Pasaporte → Foto (el pasaporte "contiene" la foto)
    private Foto foto;
    
    // Asociación bidireccional con Titular
    private Titular titular;

    // Constructor - Crear pasaporte con foto incluida (composición)
    public Pasaporte(String numero, String fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        // La foto se crea como parte del pasaporte (composición)
        this.foto = new Foto(imagen, formato);
    }

    // Getters
    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    // Getter para la foto (composición)
    public Foto getFoto() {
        return foto;
    }

    // Métodos de asociación bidireccional con Titular
    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        // Asegurar bidireccionalidad
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
    
        // Comportamiento para mostrar info de foto (Tell, don't ask)
    public void mostrarInformacionFoto() {
        if (foto != null) {
            System.out.println("Foto: " + foto.getImagen() + " (" + foto.getFormato() + ")");
        } else {
            System.out.println("Sin foto asociada");
        }
    }
    
    // Método para obtener info de foto como String (Tell, don't ask
    public String obtenerInfoFoto() {
        return foto != null ? foto.getImagen() + " (" + foto.getFormato() + ")" : "Sin foto";
    }
}

