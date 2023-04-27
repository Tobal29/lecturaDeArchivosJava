import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.awt.*; // para hacer el sonido se llama con Toolkit.getDefaultToolkit().beep(); (no es nesesario)

public class leerArchivoRegistros {

    public static void main(String[] args) {
        String nombreArchivo = "registros.txt"; // menciono el archivo txt a leer
        File archivo = new File(nombreArchivo); // creo la File archivo

        try (Scanner scanner = new Scanner(archivo)) { // el try controlara errores, si existe errores saltara al catch

            while (scanner.hasNextLine()) { // se ejecutara el while mientras exista un salto de linea que no este vacio
                String linea = scanner.nextLine(); // metemos toda la linea en un string llamada linea
                String[] campos = linea.split(","); // especifico que el "," separara los elementos de la linea

            
                // obtengo los valores de linea
                // Integer.parseInt() convierte un int a string
                // el trim() elimina elimina los espacios en blanco
                int numero = Integer.parseInt(campos[0].trim());
                String nombre = campos[1].trim();
                String apellido = campos[2].trim();
                int codigo = Integer.parseInt(campos[0].trim());

                // utilizo los valores que obtuve arriba (en este caso los imprimo)
                System.out.println("Numero: " + numero);
                System.out.println("Nombre: " + nombre);
                System.out.println("Apellido: " + apellido);
                System.out.println("codigo: " + codigo);
                System.out.println();

            }

        } catch (FileNotFoundException e) { // si el archivo no existe despliega el error guardado en "e"

        
            Toolkit.getDefaultToolkit().beep();
            System.out.println(
                    "░░░░░░░░░░░░▄▐\n" +
                    "░░░░░░▄▄▄░░▄██▄\n" +
                    "░░░░░▐▀█▀▌░░░░▀█▄\n" +
                    "░░░░░▐█▄█▌░░░░░░▀█▄\n" +
                    "░░░░░░▀▄▀░░░▄▄▄▄▄▀▀\n" +
                    "░░░░▄▄▄██▀▀▀▀\n" +
                    "░░░█▀▄▄▄█░▀▀\n" +
                    "░░░▌░▄▄▄▐▌▀▀▀\n" +
                    "▄░▐░░░▄▄░█░▀▀ U HAVE BEEN SPOOKED BY THE\n" +
                    "▀█▌░░░▄░▀█▀░▀   [ "+e+" ]  E R R O R \n"+
                    "░░░░░░░▄▄▐▌▄▄\n" +
                    "░░░░░░░▀███▀█░▄\n" +
                    "░░░░░░▐▌▀▄▀▄▀▐▄\n" +
                    "░░░░░░▐▀░░░░░░▐▌\n" +
                    "░░░░░░█░░░░░░░░█\n" +
                    "░░░░░▐▌░░░░░░░░░█\n" +
                    "░░░░░█░░░░░░░░░░▐\n" +
                            "CERRANDO SISTEMA");

        }
    }
}
