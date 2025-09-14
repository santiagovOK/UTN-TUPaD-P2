/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5_tp_uml_consigna2;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Celular {
   // Atributos privados que definen las características del celular
    private String imei;
    private String marca;
    private String modelo;
    
    // Referencia para agregación con Batería
    // En agregación, el contenedor puede recibir el objeto desde afuera
    private Bateria bateria;
    
    // Referencia para asociación bidireccional con Usuario
    private Usuario usuario;
    
    public Celular(String imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria; // Agregación: recibe batería existente
        
        // Establecemos relación bidireccional con usuario
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }
    
    // Getters
    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    // Getters adicionales para acceso completo a los atributos
    public String getImei() {
        return imei;
    }
    
    // Getter para la agregación con Batería
    public Bateria getBateria() {
        return bateria;
    }
    
        
    // Getter para la asociación bidireccional con Usuario
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setImei(String imei) {
        this.imei = imei;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    // Setter para la agregación con Batería
    // En agregación, se puede cambiar la batería por otra existente
    
    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
    // Setter que mantiene la bidireccionalidad automáticamente
    public void setUsuario(Usuario usuario) {
        // Desconectamos al usuario anterior si existe
        if (this.usuario != null && this.usuario.getCelular() == this) {
            this.usuario.setCelular(null);
        }
        
        // Establecemos nueva conexión
        this.usuario = usuario;
        
        // Mantener consistencia bidireccional
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }
    
    // Métodos de comportamiento (Tell, Don't Ask)
    
    // Método que encapsula la información de la batería
    public void mostrarInformacionBateria() {
        if (bateria != null) {
            System.out.println("Batería: " + bateria.getModelo() + 
                             " (" + bateria.getCapacidad() + " mAh)");
        } else {
            System.out.println("Sin batería asignada");
        }
    }
    
    // Método que muestra información completa del celular
    public void mostrarInformacionCompleta() {
        System.out.println("- Información del Celular -");
        System.out.println("IMEI: " + imei);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        
        // Delegamos información de batería
        mostrarInformacionBateria();
        
        // Mostramos información del usuario propietario
        if (usuario != null) {
            System.out.println("Propietario: " + usuario.getNombre() + 
                             " (DNI: " + usuario.getDni() + ")");
        } else {
            System.out.println("Sin propietario asignado");
        }
    }
}
