/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad4_tp_poo;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */
public class Unidad4_tp_poo_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Instanciamos objetos usando ambos constructores

        // Empleado 1: usando el constructor con 4 parámetros
        Empleados emp1 = new Empleados(1, "Carlos Ruiz", "Gerente", 50000.0);

        // Empleado 2: usando el constructor sobrecargado (nombre y puesto, 2 parámetros)
        Empleados emp2 = new Empleados("Ana Gómez", "Diseñadora UI/UX");

        // Empleado 3: usando el constructor sobrecargado (nombre y puesto, 2 parámetros)
        Empleados emp3 = new Empleados("Santiago Varela", "Desarrollador de Software");

        // Aplcamos los métodos actualizarSalario() sobre distintos empleados
        System.out.println("- Mejoras salariales en los empleados -\n");
        // Aumentar el salario de emp1 en un 10%
        System.out.println("Le sumamos 10% al salario de " + emp1.getNombre());
        emp1.actualizarSalario(10.0);
        System.out.println("\nAhora su salario es: " + emp1.getSalario());

        // Aumentar el salario de emp2 en una cantidad fija de 2000
        System.out.println("\nLe sumamos 2000 al salario de " + emp2.getNombre());
        emp2.actualizarSalario(2000.0, true);
        System.out.println("\nAhora su salario es: " + emp2.getSalario());
        
        // Aumentar el salario de emp3 en un 15%
        System.out.println("\nLe sumamos 15% al salario de " + emp3.getNombre());
        emp3.actualizarSalario(15.0);
        System.out.println("\nAhora su salario es: " + emp3.getSalario());

        // Imprimir la información de cada empleado con toString()
        
        System.out.println("\nInformación final de los empleados:");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        // Mostrar el total de empleados creados con mostrarTotalEmpleados()

        System.out.println("\nTotal de empleados creados: " + Empleados.mostrarTotalEmpleados());
    }
    
}
