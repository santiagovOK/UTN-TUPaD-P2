/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad4_tp_poo;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Empleados {
        
    // Construimos el estado interno o "private" de Empleados
    private int id;          // Variable para identificador único de empleado
    private String nombre;         // Variable para nombre completo del empleado
    private String puesto;    // Variable para puesto o cargo que ocupa el empleado
    private double salario; // Variable para salario actual del empleado
    private static int totalEmpleados = 0;// Variable para contador global de empleados creados
    
    // CONSTRUCTORES
    
    // Primer constructor sobrecargado (4 atributos como parámetros)
    public Empleados(int id, String nombre, String puesto, double salario) {
        setId(id);                  // Usamos el setter para validar el id
        setNombre(nombre);          // Usamos el setter para validar el nombre
        setPuesto(puesto);          // Usamos el setter para validar el puesto
        setSalario(salario);        // Usamos el setter para validar el salario
        totalEmpleados++;           // Incrementamos el contador global
    }
    
    // Segundo constructor sobrecargado (recibe 2 atributos, nombre y puesto)
    public Empleados(String nombre, String puesto) {
        this(totalEmpleados + 1, nombre, puesto, 30000.0); // Asigna id automático y salario por defecto.
    }                                                   // Incrementa en uno totalEmpleados temporalmente. Si lo dejara totalEmpleados++ incrementaría dos veces. 
                                                        //En resumen, lo incrementa a través del primer constructor
    
    // MÉTODOS
    
    // Primer método sobrecargado (recibe porcentaje de aumento como parámetro)
    public void actualizarSalario(double porcentaje) {
        actualizarSalario((porcentaje / 100.0) * this.salario, true); // Invoca al método sobrecargado de actualizarSalario por un monto fijo (el que le sigue)
    }
    // Segundo método sobrecargado (actualizar salario con un monto fijo (dos parámetros)
    public void actualizarSalario(double cantidadFija, boolean esFija) {
        this.salario += cantidadFija; // Suma la cantidad fija al salario
    }
    
    // Método estático
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados; // Retorna el total de empleados almacenado en el contador static que creamos anteriormente
    }
    
    // SETTERS

    // Setter para el id con validación
    public void setId(int id) {
        if (id <= 0) {
            System.out.println("El id debe ser mayor que 0");
        }
        this.id = id;
    }

    // Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Setter para el puesto
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    // Setter para el salario con validación
    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("El salario no puede ser negativo");
        } else {
            this.salario = salario;
        }
    }

    // GETTERS para los atributos
    
    // Getter para acceder a id, que es private
    public int getId() {
        return this.id;
    }
    
    // Getter para acceder a nombre, que es private

    public String getNombre() {
        return this.nombre;
    }

    // Getter para acceder a puesto, que es private

    public String getPuesto() {
        return this.puesto;
    }

    // Getter para acceder a salario, que es private

    public double getSalario() {
        return this.salario;
    }
    
    // Getter estático para acceder al contador de empleados
    public static int getTotalEmpleados() {
        return totalEmpleados;
    }
    
    // toString para mostrar los datos, hecho mediante el template de NetBeans

    @Override
    public String toString() {
        return "Empleados{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    
    
    
    
}


