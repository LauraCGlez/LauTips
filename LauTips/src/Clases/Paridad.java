package Clases;

import java.util.Scanner;

public class Paridad {

    public static void main(String[] args) {

        //Escribir un programa que pida un número al usuario e indique mediante un literal
        //booleano si el número es par.

        Scanner numero = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");

        int numerx = numero.nextInt();

        boolean paridad;

        paridad = (numerx % 2 == 0);

        System.out.println(paridad);

    }

}
