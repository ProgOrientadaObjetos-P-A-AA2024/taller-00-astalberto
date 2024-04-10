/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
import paquete5.Dato;
public class Informacion {
    
    public static int obtenerHabitantes(){
        return Dato.obtenerNumeroHombres() + Dato.obtenerNumeroMujeres();
    }
}
