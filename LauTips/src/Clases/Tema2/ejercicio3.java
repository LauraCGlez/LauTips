package Clases.Tema2;

import java.util.Scanner;

public class ejercicio3 {

    //Solicitar dos números enteros y mostrar cuál es el mayor.

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Escribe dos numeros: ");
        int num1 = sn.nextInt();
        int num2 = sn.nextInt();

        if (num1>num2){
            System.out.println("El numero mayor es el primero: " + num1);
        } else if (num1<num2){
            System.out.println("El numero mayor es el segundo: " + num2);
        } else {
            System.out.println("Los numeros son iguales");
        }

    }

}
