package GorditoUwU.Condicionales;

//La letra inicial del NIE admite 3 posibles valores:
//
//- X para los NIE cuya fecha de asignación es anterior a 2008.
//
//- Y para los NIE con una fecha posterior.
//
//- La letra Z está prevista para el momento en que se agoten las posibilidades con Y.
//
//A continuación aparecen 7 dígitos que se van asignando consecutivamente según se realizan
// solicitudes del NIE. Y, por último, la letra de control se calcula a partir de un sencillo
// algoritmo de cálculo: en primer lugar se sustituye la X por 0, la Y por 1 o la Z por 2, se
// le añaden los 7 dígitos, y la cifra resultante se divide entre 23. El resto de dicha división,
// cuyo valor varía entre 0 y 22

import javax.swing.*;
import java.util.Scanner;

public class NIE {

    public static void main(String[] args) {

        char primeraLetra;

        String añoCreacion = JOptionPane.showInputDialog("Introduzca el año de creacion del NIE: ");

        int año = Integer.parseInt(añoCreacion);


        if (añoCreacion.length() != 4 && año > 2022) {

            JOptionPane.showInputDialog("El año introducido es incorrecto, intentelo otra vez");

            añoCreacion = JOptionPane.showInputDialog("Introduzca el año de creacion del NIE: ");

        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los 7 digitos de tu NIE: ");

        int digitos = sc.nextInt();

        int digitosCortos = digitos;

        if (año > 2008){
            primeraLetra = 'Y';
            digitos += 10000000;
            System.out.println("La primera letra es Y");
        } else {
            primeraLetra = 'X';
        }

        String letra = null;

        int modulo = digitos % 23;

        switch (modulo){

            case 0: letra = "T";
                break;
            case 1: letra = "R";
                break;
            case 2: letra = "W";
                break;
            case 3: letra = "A";
                break;
            case 4: letra = "G";
                break;
            case 5: letra = "M";
                break;
            case 6: letra = "Y";
                break;
            case 7: letra = "F";
                break;
            case 8: letra = "P";
                break;
            case 9: letra = "D";
                break;
            case 10: letra = "X";
                break;
            case 11: letra = "B";
                break;
            case 12: letra = "N";
                break;
            case 13: letra = "J";
                break;
            case 14: letra = "Z";
                break;
            case 15: letra = "S";
                break;
            case 16: letra = "Q";
                break;
            case 17: letra = "V";
                break;
            case 18: letra = "H";
                break;
            case 19: letra = "L";
                break;
            case 20: letra = "C";
                break;
            case 21: letra = "K";
                break;
            case 22: letra = "E";

        }

        System.out.println("La ultima letra es " + letra);

        System.out.println("EL NIE es: " + primeraLetra + digitosCortos + letra);

    }

}
