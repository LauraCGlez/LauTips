package GorditoUwU.Bucles;

//Diseñar un programa que pida al usuario un número positivo y lo muestre
//unidad a unidad. Por ejemplo, para el número 123, debe mostrar primero el 3,
//a continuación el 2, y por último el 1.

import java.util.Scanner;

public class ejercicio28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero positivo: ");

        int numero = sc.nextInt();

        if (numero < 0){

            System.out.println("El numero introducido no es correcto, intentelo otra vez: ");

            numero = sc.nextInt();

        }

        int cifras;

        /*for (int i = 0; i <= cifras; i++){

            numero / 100 =

        }*/

    }

}
