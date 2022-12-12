package Clases.Tema5;

import java.util.Arrays;
import java.util.Scanner;
public class ejercicio3 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Introduce 5 numeros decimales: ");

        double[] tabla = new double[5];

        for (int i = 0; i < tabla.length; i++){

            tabla[i] = sn.nextDouble();

        }

        System.out.println(Arrays.toString(tabla));

    }

}
