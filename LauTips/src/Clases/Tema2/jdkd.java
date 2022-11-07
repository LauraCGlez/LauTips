package Clases.Tema2;

import java.util.Scanner;

public class jdkd {

    //Solicitar dos números enteros y mostrar cuál es el mayor.

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Escribe dos numeros: ");
        int num1 = sn.nextInt();
        int num2 = sn.nextInt();

        if (num1>num2){
            System.out.println("El numero mayor es el primero: " + num1);
        } else {
            System.out.println("El numero mayor es el segundo: " + num2);
        }
        if (num1==num2) {
            System.out.println("Son iguales");
        }

    }

}
