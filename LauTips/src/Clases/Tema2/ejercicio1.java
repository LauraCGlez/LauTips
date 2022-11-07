package Clases.Tema2;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {


        //Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.
        //Haciendo uso del if podemos mostrar como resultado final:
        //● “es par”
        //● “es impar”

        Scanner sn = new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int num = sn.nextInt();
        if (num % 2 == 0){
            System.out.println("Es par");
        }
        if (num % 2 != 0){
            System.out.println("Es impar");
        }

    }

}
