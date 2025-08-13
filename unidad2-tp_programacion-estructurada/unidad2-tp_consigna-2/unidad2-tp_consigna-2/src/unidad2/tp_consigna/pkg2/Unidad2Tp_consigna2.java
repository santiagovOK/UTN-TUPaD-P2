/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unidad2.tp_consigna.pkg2;

import java.util.Scanner;
/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub) <santiago.varela@tupad.utn.edu.ar>
 */
public class Unidad2Tp_consigna2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el objeto Scanner para poder leer posteriormente las entrasdas del usuario
        Scanner input = new Scanner(System.in);
        
        // Imprimimos mensaje previo para indicar al usuario que es lo que hará el programa y solicitarle los números a ingresar

        System.out.println("Este programa evaluará cuál número es mayor. Deberás ingresar tres números enteros.");
        System.out.println("Ingresá un primer número: ");
        
        int num1 = input.nextInt();
        
        System.out.println("Ingresá un segundo número: ");
        
        int num2 = input.nextInt();
        
        System.out.println("Ingresá un tercer número: ");
              
        int num3 = input.nextInt();
        
        // Variable que almacenará el resultado
        int numMayor;
        
        // Iniciamos la estructura condicional anidada para comparar los tres números en cada caso.
        // Si bien se encuentra el mayor o igual `>=`, cuando haya dos números iguales la salida será del primero que aparezca en la secuencia
        if (num1 >= num2) {
            
            if (num1 >= num3) {
                numMayor = num1;
            } else {
                numMayor = num3;
            }
         
        } else {   
            if (num2 >= num3) {
                numMayor = num2;
            } else {
                numMayor = num3;
            }
        }
        
        // Imprimimos el resultado con la salida de `numMayor`
        
        System.out.println("El mayor es: " + numMayor);
        
    }
    
}
