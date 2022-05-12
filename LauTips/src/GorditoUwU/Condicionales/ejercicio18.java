package GorditoUwU.Condicionales;

//Diseñar un programa que muestre, para cada número introducido por
//teclado, si es par. El proceso se repetirá hasta que el número introducido
//sea 0.

import java.util.Scanner;

public class ejercicio18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");

        int numero = sc.nextInt();

        while (numero != 0) {

            if (numero % 2 == 0) {
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }

            numero = sc.nextInt();
        }

        System.out.println("El numero introducido es 0. Fin del proceso");


    }

}
