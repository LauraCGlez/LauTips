package Clases.Tema5;

import java.util.Arrays;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Introduce 5 numeros: ");

        int[] tabla = new int[5];

        for (int i = 0; i < tabla.length; i++){

            tabla[i] = sn.nextInt();

        }

        System.out.println(Arrays.toString(tabla));

    }

}
