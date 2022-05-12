package GorditoUwU.Bucles;

//Escribir una aplicación para aprender a contar, que pedirá un número n y
//mostrará todos los números del 1 a n.

import java.util.Scanner;

public class ejercicio23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++){

            System.out.println(i);
        }

    }

}
