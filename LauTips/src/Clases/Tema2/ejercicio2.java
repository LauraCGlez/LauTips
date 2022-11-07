package Clases.Tema2;

import java.util.Scanner;

public class ejercicio2 {

    //Pedir dos números enteros y decir si son iguales o no.

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Escribe dos numeros: ");
        int num1 = sn.nextInt();
        int num2 = sn.nextInt();

        if (num1==num2){
            System.out.println("Los numeros son iguales");
        }
        if (num1 != num2){
            System.out.println("Son diferentes");
        }

    }

}
