package GorditoUwU.Recursividad;

//ESCRIBIR UNA FUNCION QUE CALCULE DE FORMA RECURSIVA EL MAXIMO COMUN DIVISOR DE DOS NUMEROS
//              mcd (a - b, b) si a >= b
//              mcd (a, b - a) si b > a
//mcd(a,b) =    a              si b = 0
//              b              si a = 0

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {

        int a, b, resultado;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer numero: ");

        a = sc.nextInt();

        System.out.println("Introduce el segundo numero: ");

        b = sc.nextInt();

        resultado = mcd(a, b);

        System.out.println("El mcd es " + resultado);

    }

    static int mcd(int a,int b){

        int resultado;

        if (a == 0){

            resultado = b;

        } else {

            int min = a <= b ? a : b;

            int max = a <= b ? b : a;

            resultado = mcd(min, max - min);

        }
        return (resultado);
    }
}
