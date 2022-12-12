package Clases.Tema4;

//Crear una función que, mediante un booleano, indique si el carácter que se
//pasa como parámetro de entrada corresponde con una vocal.

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Introduce un caracter:");

        String caracter = sn.next();

        bool(caracter);

    }

    static void bool(String vocal){

        boolean esVocal;

        switch (vocal){
            case "a", "e", "i", "o", "u":
               esVocal = true;
                System.out.println(esVocal);

            default:
                esVocal = false;
                System.out.println(esVocal);
        }

    }

}
