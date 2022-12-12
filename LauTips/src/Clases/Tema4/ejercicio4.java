package Clases.Tema4;

import java.util.Scanner;

//Diseñar una función que reciba dos números enteros y devuelve el mayor de
//ambos.
public class ejercicio4 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Ingresa dos numeros: ");

        int num1 = sn.nextInt();

        int num2 = sn.nextInt();

        num(num1, num2);

    }

    static int num(int a,int b){

        int mayor;

        if (a == b){
            System.out.println("Los numeros son iguales");
        }

        if (a > b){
            mayor = a;
            System.out.println("El numero mayor es: " + mayor);
        } else {
            mayor = b;
            System.out.println("El numero mayor es: " + mayor);
        }

        return mayor;
    }

}
