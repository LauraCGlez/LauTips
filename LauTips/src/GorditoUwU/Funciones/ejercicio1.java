package GorditoUwU.Funciones;

//Diseñar la función eco( ) a la que se le pasa como parámetro de un número
//n, y muestra por pantalla n veces el mensaje <<Eco...>>

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        int numero = sc.nextInt();

        eco(numero); //LLAMADA A LA FUNCION

    }

    static void eco(int n){

        for (int i = 0; i < n; i++){

            System.out.println("<<Eco...>>");

        }

    }

}
