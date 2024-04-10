/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
import paquete3.Informacion;
import paquete4.Palabra;
public class Mensaje {

    public static String obtenerMensaje() {
        int info = Informacion.obtenerHabitantes();
        return String.format("%s, una ciudad llena de arte y naturaleza"+
                " con %s", Palabra.obtenerPalabra(),info);
    }
}
