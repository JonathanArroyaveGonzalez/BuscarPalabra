package Clases;

/**
 * Descripcion de la Clase
 * Contiene los metodos para leer archivos con extensión .txt, .xml, .json o .csv
 * en una carpeta especifica.
 *
 * @author Jonathan A.
 * @version 1.0
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AdministradorDeArchivos {

    private String ruta;
    private String palabraBuscada;
    private int totalOcurrencias = 0;

    public AdministradorDeArchivos(String ruta, String palabraBuscada) {
        this.ruta = ruta;
        this.palabraBuscada = palabraBuscada;
    }

    public void encontrarArchivos() {
        // Crear un objeto File para la carpeta
        File carpeta = new File(ruta);

        // Verificar si la carpeta existe y es un directorio
        if (carpeta.exists() && carpeta.isDirectory()) {
            // Obtener la lista de archivos en la carpeta
            File[] archivos = carpeta.listFiles();

            // Recorrer los archivos
            for (File archivo : archivos) {
                if (archivo.isFile() && validarTipoDeArchivo(archivo.getName())) {
                    int ocurrenciasEnArchivo = ocurrenciasPorArchivo(archivo);
                    totalOcurrencias += ocurrenciasEnArchivo;
                    System.out.println("Archivo: " + archivo.getName() + " - Ocurrencias: " + ocurrenciasEnArchivo);
                }
            }

            System.out.println("Total de ocurrencias en toda la carpeta: " + totalOcurrencias);
        } else {
            System.out.println("La ruta no es válida o la carpeta no existe.");
        }
    }

    // Función para verificar si un archivo tiene una extensión compatible
    private static boolean validarTipoDeArchivo(String nombreArchivo) {
        return nombreArchivo.endsWith(".txt") || nombreArchivo.endsWith(".xml") || nombreArchivo.endsWith(".json") || nombreArchivo.endsWith(".csv");
    }

    // Función para contar las ocurrencias de una palabra en un archivo
    private int ocurrenciasPorArchivo(File archivo) {
        int contadorPorArchivo = 0;
        try (BufferedReader leer = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = leer.readLine()) != null) {
                contadorPorArchivo += ocurrenciasPorLinea(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contadorPorArchivo;
    }

    // Función para contar las ocurrencias de una palabra en una línea
    private int ocurrenciasPorLinea(String linea) {
        int contadorPorLinea = 0;
        String[] palabras = linea.split("\\s+");
        for (String palabra : palabras) {
            if (palabra.equalsIgnoreCase(this.palabraBuscada)) {
                contadorPorLinea++;
            }
        }
        return contadorPorLinea;
    }
}

