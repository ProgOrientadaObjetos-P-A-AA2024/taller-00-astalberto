/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
import paquete1.Mensaje;

public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Para poder importar un paquete utilizamos "import" en adicion de la ruta
        // del paquete y de la clase a usar para poder usar el procedimiento o funcion
        String msg = Mensaje.obtenerMensaje();
        System.out.printf("%s\n", msg);
    }

}
