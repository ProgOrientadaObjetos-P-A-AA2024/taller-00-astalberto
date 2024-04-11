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
import java.util.Scanner;
import paquete1.Mensaje;

public class Demo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Para poder importar un paquete utilizamos "import" en adicion de la ruta
        // del paquete y de la clase a usar para poder usar el procedimiento o funcion
        Scanner entrada = new Scanner(System.in);
        int check;
        String msg = Mensaje.obtenerMensaje();
        System.out.println("Ingrese 1/2/3/4/5");
        check = entrada.nextInt();
        if (check >= 1 && check <= 5) {
            System.out.printf("%s\n", msg);
        } else {
            System.out.printf("%s\n", msg.toUpperCase());
        }
    }

}
// 12345 original // otro Mayus
