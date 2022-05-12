package GorditoUwU.Condicionales;

//Pedir dos números enteros y decir si son iguales o no.

import java.util.Scanner;

/*public class ejercicio3 {
    public static void main(String[] args) {

        Scanner num1 = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int a = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Introduce otro numero: ");
        int b = num2.nextInt();

        if (a==b){
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros son diferentes");
        }

    }
}*/

//MODIFICACION PARA DECIR EN CASO DE QUE NO SEAN IGUALES CUAL ES MAYOR

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner num1 = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int a = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Introduce otro numero: ");
        int b = num2.nextInt();

        if (a==b){
            System.out.println("Los numeros son iguales");
        } else {
            if (a > b){
                System.out.println(a + " es mayor que " + b);
            }else {
                System.out.println(a + " es menor que " + b);
            }
        }

    }
}
