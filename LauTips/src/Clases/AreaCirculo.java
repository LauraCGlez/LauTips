package Clases;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");

        double diametro = sc.nextInt();

        double radio = (diametro)/2;

        final double pi = Math.PI;

        System.out.println("El area del circulo es: " + (pi * Math.pow(radio,2)));

    }

}