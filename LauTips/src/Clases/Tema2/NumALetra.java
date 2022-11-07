package Clases.Tema2;

import javax.swing.*;

public class NumALetra {

    //Escribe un programa que solicite al usuario un numero comprendido entre
    //1 y 99. El programa debe mostrarlo con letras, por ejemplo, para 56, se
    //vera: <<cincuenta y seis>>

    public static void main(String[] args) {

        String cifras = JOptionPane.showInputDialog("Introduzca un numero entre 1 y 99: ");

        int num=0;

        switch (num){
            case 11:
                System.out.println("once");
                break;
            case 12:
                System.out.println("doce");
                break;
            case 13:
                System.out.println("trece");
                break;
            case 14:
                System.out.println("catorce");
                break;
            case 15:
                System.out.println("quince");
                break;
        }

        char primeraCifra = cifras.charAt(0);
        char segundaCifra = cifras.charAt(1);

        System.out.println(primeraCifra + " y " + segundaCifra);

    }

}
