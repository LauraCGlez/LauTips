package Clases.Tema3;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Escribe el numero: ");
        int numeros = sn.nextInt();
        int contador = 1;
        int suma = numeros;

        while (contador < 10){
            numeros = sn.nextInt();
            contador++;
            suma+=numeros;
        }
        System.out.println("Contador: " + contador);
        System.out.println("Suma: " + suma);
        double promedio = (double) suma/contador;
        System.out.println("Promedio: " + promedio);
    }
}
