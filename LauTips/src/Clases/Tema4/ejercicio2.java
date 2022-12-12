package Clases.Tema4;

import java.util.Scanner;

//Escribir una función a la que se le pasen dos enteros y muestre todos los
//números comprendidos entre ellos.

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Escribe dos numeros enteros: ");

        int a = sn.nextInt();

        int b = sn.nextInt();

        funcion(a,b);

    }

    static void funcion(int num1, int num2){

        for (int i = num1; i <= num2; i++){
            System.out.println(i);
        }

    }

}
