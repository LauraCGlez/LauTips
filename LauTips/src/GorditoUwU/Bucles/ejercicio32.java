package GorditoUwU.Bucles;

//Pedir por consola un número n y dibujar un triángulo rectángulo de n
//elementos de lado, utilizando para ello asteriscos (*). Por ejemplo, para n= 4:

import java.util.Scanner;

public class ejercicio32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");

        int numero = sc.nextInt();

        for (int i = numero; i > 0; i--){

            for (int j = i; j > 1; j--){
                System.out.print("*");
            }

            System.out.println("*");

        }

    }

}
