package GorditoUwU.Condicionales;

//Solicitar dos números enteros y mostrar cuál es el mayor.

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner num1 = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int a = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Introduce otro numero: ");
        int b = num2.nextInt();

        if (a>b){
            System.out.println("El primer numero es mayor");
        } else {
            System.out.println("El segundo numero es mayor");
        }

    }
}
