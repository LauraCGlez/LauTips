package GorditoUwU.Funciones;

//Crear una función que, mediante un booleano, indique si el carácter que se
//pasa como parámetro de entrada corresponde con una vocal.

import javax.swing.*;

public class ejercicio5 {

    public static void main(String[] args) {

        String intro = JOptionPane.showInputDialog("Introduzca una letra");

        vocal(intro);

    }

    static boolean vocal(String letra){

        boolean esVocal = false;

        switch (letra){
            case "a", "e", "i", "o", "u" :
                System.out.println("Es una vocal");
                esVocal = true;
            break;
            default:
                System.out.println("Es una consonante");
                esVocal = false;
        }
        return esVocal;
    }

}
