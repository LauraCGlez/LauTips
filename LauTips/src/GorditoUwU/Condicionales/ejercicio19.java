package GorditoUwU.Condicionales;

//Realiza un programa en Java que lea dos números pasados por teclado en
//un proceso repetitivo. Este proceso terminará cuando los números leídos
//sean iguales.

import java.util.Scanner;

public class ejercicio19 {

    public static void main(String[] args) {

        int a, b;

        do {

            Scanner sc = new Scanner(System.in);

            System.out.println("Introduzca el primer numero: ");

            a = sc.nextInt();

            System.out.println("Introduzca el segundo numero: ");

            b = sc.nextInt();

            if (a != b){
                System.out.println("Puede continuar, los numeros no son iguales");
            }


        } while (a != b) ;

        System.out.println("Los numeros no pueden ser iguales");


    }

}
