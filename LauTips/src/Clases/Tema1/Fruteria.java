package Clases.Tema1;

import java.util.Scanner;

public class Fruteria {

    //Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras.
    //Por este motivo es necesario diseñar una aplicación que solicite las ventas (en kg) de cada
    //semestre para cada fruta. La aplicación mostrará el importe total sabiendo que el precio del kilo
    //de manzanas está fijado en 2,35 € y el kilo de peras en 1,95 €.

    public static void main(String[] args) {

        double beneficios, beneficiosPeras, beneficiosManzanas;

        double s1m, s2m, s1p, s2p;

        Scanner sn1 = new Scanner(System.in);

        System.out.println("Ventas primer semestre de manzanas en kg: ");

        s1m = sn1.nextDouble();

        Scanner sn2 = new Scanner(System.in);

        System.out.println("Ventas segundo semestre de manzanas en kg: ");

        s2m = sn2.nextDouble();

        Scanner sn3 = new Scanner(System.in);

        System.out.println("Ventas primer semestre de peras en kg: ");

        s1p = sn3.nextDouble();

        Scanner sn4 = new Scanner(System.in);

        System.out.println("Ventas segundo semestre de peras en kg: ");

        s2p = sn4.nextDouble();

        beneficiosManzanas = (s1m * 2.35) + (s2m * 2.35);

        beneficiosPeras = (s1p * 1.95) + (s2p * 1.95);

        beneficios = beneficiosManzanas + beneficiosPeras;

        System.out.println("Beneficios de las manzanas: " + beneficiosManzanas);

        System.out.println("Beneficios de las peras: " + beneficiosPeras);

        System.out.println("Beneficios totales: " + beneficios);

    }

}
