package lectura_archivo;

/**
 *
 * @author Santiago Octavio Varela / @santiagovOK (GitHub)
 * <santiago.varela@tupad.utn.edu.ar>
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException; // Específica para archivo no encontrado.
import java.io.IOException;         // General para errores de E/S (Entrada/Salida).


//Clase que lee un archivo de texto y lo muestra en consola.
// Maneja FileNotFoundException si el archivo no existe.

public class LecturaArchivo {

    public static void main(String[] args) {

        // Definimos el nombre del archivo que intentaremos leer.
        // Si le cambiamos el nombre, es posible observar que el manejo de errores funciona.
        String nombreArchivo = "mensaje.txt"; // El archivo debe estar en el mismo nivel del directorio que la carpeta `src`

        // Usamos try-with-resources.
        // Declaramos los recursos (FileReader, BufferedReader) dentro de los paréntesis del try.

        try (FileReader fr = new FileReader(nombreArchivo);
             BufferedReader br = new BufferedReader(fr)) {

            System.out.println("Contenido del archivo '" + nombreArchivo + "' ");

            String lineaActual;

            // Leemos el archivo línea por línea.
            // br.readLine() devuelve null cuando llega al final del archivo.
            while ((lineaActual = br.readLine()) != null) {
                System.out.println(lineaActual);
            }

            System.out.println("Fin del archivo");

        } catch (FileNotFoundException e) {
            // Capturamos la excepción específica si el archivo no existe.
            System.out.println("Error: El archivo '" + nombreArchivo + "' no se ha encontrado.");
        } catch (IOException e) {
            // Capturamos otros posibles errores de Entrada/Salida.
            System.out.println("Error de E/S: Ocurrió un problema al leer el archivo.");
        }
    }
}