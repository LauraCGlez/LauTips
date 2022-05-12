package GorditoUwU.Condicionales;

//Desarrollar un programa que permita la carga de 10 valores por teclado y
//nos muestre posteriormente la suma de los valores ingresados y su
//promedio.

import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 10 numeros");

        int numero = sc.nextInt();

        int cont = 1;

        int suma = 0;

        double media;

        while (cont < 10){
            numero = sc.nextInt();
            cont ++;
            suma += numero;
        }

        media = (double) suma / cont;

        System.out.println("La suma total es: " + suma);

        System.out.println("El promedio es: " + media);

    }

}
