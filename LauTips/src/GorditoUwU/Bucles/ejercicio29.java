package GorditoUwU.Bucles;

//Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se
//denota 5! y es igual a 5x4x3x2x1 = 120.

import java.util.Scanner;

public class ejercicio29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        int numero = sc.nextInt();

        int factorial=1;

        for (int i = numero; i >= 1; i--){

           factorial = factorial * i;

        }

        System.out.println("El factorial de " + numero + " es = " + factorial);

    }

}
