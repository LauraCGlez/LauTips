package GorditoUwU.Funciones;

//Diseñar una función que reciba dos números enteros y devuelve el máximo
//de ambos.

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos numero enteros: ");

        int num1 = sc.nextInt();

        int num2 = sc.nextInt();

        System.out.println("El mayor de los numeros es " + maximo(num1, num2));

    }

    static int maximo(int a, int b){

        int mayor = a > b ? a : b;

        return mayor;

    }

}
