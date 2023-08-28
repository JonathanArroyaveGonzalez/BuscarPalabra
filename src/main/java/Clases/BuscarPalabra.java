package Clases;

import javax.swing.*;

/**
 * Descripcion de la Clase
 *
 * @author Jonathan A.
 * @version 1.0
 */
public class BuscarPalabra {

    public static void main(String[] args) {
        String ruta = JOptionPane.showInputDialog("Ingrese la ruta de la carpeta a examinar: \n");
        String palabraBuscada = JOptionPane.showInputDialog("Ingrese la palabra a buscar: \n");

        AdministradorDeArchivos buscar = new AdministradorDeArchivos(ruta, palabraBuscada);
        buscar.encontrarArchivos();
    }
}
