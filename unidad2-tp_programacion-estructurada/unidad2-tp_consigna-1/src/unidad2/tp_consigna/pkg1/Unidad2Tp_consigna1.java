/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2.tp_consigna.pkg1;

import java.util.Scanner;
/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub) <santiago.varela@tupad.utn.edu.ar>
 */
public class Unidad2Tp_consigna1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el objeto Scanner para poder leer posteriormente las entrasdas del usuario
        Scanner input = new Scanner(System.in);
        
        // Imprimimos mensaje previo al `input` del usuario indicando que ingrese el año
        System.out.println("Ingresá un año para que verifiquemos si es bisiesto o no: ");
        
        // Inicializamos la variable `anio` y le asignamos el valor ingresado por el usuario con `input.nextInt()`  
        int anio = input.nextInt();
        
        // Inicializamos la variable `esBisiesto` tipo boolean en falso para luego convalidar si el año es bisiesto o no.
        
        boolean esBisiesto = false;
       
        // Estructura condicional para evaluar si el año es bisiesto o no, en función de las diferentes condiciones para considerar un año como bisiesto
        if (anio % 4 == 0) {
            if (anio % 100 != 0) {
                esBisiesto = true;
            } else if (anio % 400 == 0) {
                esBisiesto = true;
            } else {
                esBisiesto = false;
            }
            
        // Si directamente no es divisible por 4, `esBisiesto` será falso  
        } else {
            esBisiesto = false;
        }
        
        // Creamos otra estructura condicional para imprimir un mensaje al usuario en función de si `esBisiesto` o no
        
        if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
        
    }
    
}
