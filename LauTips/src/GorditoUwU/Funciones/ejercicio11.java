package GorditoUwU.Funciones;

//Plantear una función que calcule pow(a,n), donde a es real y n es un entero no
//negativo. Realizar una versión iterativa y otra recursiva.
//En primer lugar deberemos analizar cuál es la forma recursiva de dicha
//operación.

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Introduce un numero real: ");

        int a = sn.nextInt();

        System.out.println("Introduce el exponente: ");

        int b = sn.nextInt();

        if (b < 0){
            System.out.println("El exponente tiene que ser no negativo");
        }

        System.out.println("El resultado es: " + funcion(a,b));;

    }

    static double funcion(double base, int exponente){

        double resultado;

        if (exponente == 0){
            resultado = 1;
        } else {
            resultado = Math.pow(base, funcion(base, (exponente - 1)));
        }

        return resultado;
    }


}
