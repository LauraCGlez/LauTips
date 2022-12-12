package GorditoUwU.Funciones;

//Crear una función que, mediante un booleano, indique si el carácter que se
//pasa como parámetro de entrada corresponde con una vocal.

import javax.swing.*;

public class ejercicio5 {

    public static void main(String[] args) {
        String intro = JOptionPane.showInputDialog("Introduzca una letra: ");
        vocal(intro);
        System.out.println(vocal(intro));
    }

    static boolean vocal(String letra){
        boolean esVocal = false;
        switch (letra){
            case "a", "e", "i", "o", "u" :
                esVocal = true;
            break;
            default:
                esVocal = false;
        }
        return esVocal;
    }

}
