package GorditoUwU.Bucles;

//Implementa la aplicación Película, que pide al usuario un número y muestra en pantalla
//la salida:
//¿Hoy vamos a ver una peli, Juanan?
//¿Hoy vamos a ver una peli, Juanan?
//¿Hoy vamos a ver una peli, Juanan?
//Se muestra «¿Hoy vamos a ver una peli, Juanan?...» tantas veces como indique el número
//introducido. La salida anterior sería para el número 3.

import java.util.Scanner;

public class ejercicio22 {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("Introduzca un numero: ");

        int cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++){

            System.out.println("¿Hoy vamos a ver una peli, Juanan?");

        }

    }

}
