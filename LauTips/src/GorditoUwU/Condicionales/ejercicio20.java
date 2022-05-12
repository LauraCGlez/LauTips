package GorditoUwU.Condicionales;

//Programa que lea 10 números desde teclado en un proceso repetitivo y
//muestre la suma. Realizar el programa con <<do-while>>

import java.util.Scanner;

public class ejercicio20 {

    public static void main(String[] args) {

        int a;

        int suma = 0;

        int cont = 0;

        System.out.println("Introduzca 10 numeros");

        do {

            Scanner sc = new Scanner(System.in);

            a = sc.nextInt();

            cont ++;

            suma += a;


        } while (cont < 10);

        System.out.println("La suma de los numeros es: " + suma);

    }

}
