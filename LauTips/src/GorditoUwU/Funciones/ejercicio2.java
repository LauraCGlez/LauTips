package GorditoUwU.Funciones;

//Escribir una función a la que se le pasen dos enteros y muestre todos los
//números comprendidos entre ellos.

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");

        int num1 = sc.nextInt();

        System.out.println("Introduce otro: ");

        int num2 = sc.nextInt();

        comprendidos(num1, num2);

    }

    static void comprendidos(int a, int b){

        int mayor = a > b ? a : b;

        int menor = a < b ? a : b;

        for (int i = menor + 1; i < mayor; i++){

            System.out.println(i);
        }

    }

}
