package GorditoUwU.Bucles;

//Pedir diez números enteros por teclado y mostrar la media.

import java.util.Scanner;

public class ejercicio25 {

    public static void main(String[] args) {

        int suma = 0;

        double media = 0;

        System.out.println("Introduzca 10 numeros: ");

        for (int i = 0; i < 10; i++){

            Scanner sc = new Scanner(System.in);

            int num = sc.nextInt();

            suma += num;

        }

        media = (double) suma / 10;

        System.out.println(media);

    }


}
