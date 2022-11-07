package Clases.Tema2;

import java.util.Scanner;

public class JuegoSuma {

    //Realiza el <<juego de la suma>>, que consiste en que aparezcan dos numeros
    //aleatorios (entre 1 y 99) que el usuario tiene que sumar. La aplicacion debe
    //indicar si el resultado de la operacion es correcto o incorrecto.

    public static void main(String[] args) {

        int a = (int)(Math.random()*100);

        System.out.println("Primer numero aleatorio: " + a);

        int b = (int)(Math.random()*100);

        System.out.println("Segundo numero aleatorio: "+ b);

        Scanner sn = new Scanner(System.in);

        System.out.println("Escribe cuanto da la suma de ambos numeros: ");

        int suma = sn.nextInt();

        int sum = a + b;

        if (suma == sum){
            System.out.println("Respuesta correcta!");
        } else {
            System.out.println("Aprende a sumar! La respuesta es: " + sum);
        }
    }
}
