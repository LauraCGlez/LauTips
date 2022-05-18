package GorditoUwU.Recursividad;

//Realizar recursivamente un programa que muestre la serie de números de
//fibonacci.

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calcular fibonacci (n)");

        System.out.println("Introduzca n (se recomienda n < 40): ");

        int a = sc.nextInt();

        int resultado = fibonacci(a);

        System.out.println("\nfibonacci (" + a + ") = " + resultado);

    }

    static int fibonacci(int a){

        int resultado = 1;

        if (a == 0 || a == 1){ //FIBONACCI DE 0 == 1 Y FIBONACCI DE 1 == 1

            resultado = 1;

        } else {

            resultado = fibonacci(a - 1) + fibonacci(a - 2); // RESULTADO ES IGAL A LA SUMA DE FIBONACCI DE LOS DOS INMEDIATOS ANTERIORES

        }

        return resultado;
    }

}
