package GorditoUwU.Recursividad;

//Plantear una función que calcule pow(a,n), donde a es real y n es un entero no
//negativo. Realizar una versión iterativa y otra recursiva.
//En primer lugar deberemos analizar cuál es la forma recursiva de dicha
//operación.

import java.util.Locale;
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US); //PARA PERMITIR PUNTO (.) EN LOS DECIMALES

        System.out.println("Introduzca la base: ");

        double base = sc.nextDouble();

        System.out.println("Introduzca el exponente: ");

        int expo = sc.nextInt();

        double resultado = elevado(base, expo);

        System.out.println(base + " elevado a " + expo + " = " + resultado);

        double resultadoRec = elevadoRec(base, expo);

        System.out.println(base + " elevado a " + expo + " = " + resultadoRec);

    }


    //VERSION ITERATIVA
    static double elevado(double a, int n){

        double resultado = 1;//SE INICIALIZA A 1 PORQUE ES UNA MULTIPLICACION

        for (int i = 1; i <= n; i++){
            resultado *= a;
        }
        return resultado;
    }

    //VERSION RECURSIVA
    static double elevadoRec(double a, int n){

        double resultado;

        if(n == 0){
            resultado = 1;
        } else {
            resultado = a * elevado(a, n - 1);
        }

        return (resultado);
    }

}
