package GorditoUwU.Funciones;

//FACTORIAL RECURSIVAMENTE

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Introduce un numero para calcular su factorial:");

        int numero = sn.nextInt();

        System.out.println("El factorial de " + numero + " es: " + factorial(numero));

    }

    static int factorial(int n){

        int resultado;

        if (n == 0){
            resultado = 1;
        } else {
            resultado = n * factorial(n-1);
        }
        return resultado;
    }
}
