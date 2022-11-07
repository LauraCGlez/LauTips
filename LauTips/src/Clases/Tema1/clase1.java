package Clases.Tema1;

import java.util.Scanner;

public class clase1 {

    public static void main(String[] args) {

        int mes = 0;

        do {

            Scanner sc = new Scanner(System.in);

            System.out.println("Introducir numero de mes: ");

            mes = sc.nextInt();

            switch (mes) {

                case 1, 3, 5, 7, 8, 10, 12:

                    System.out.println("Mes con 31 dias");

                    mes = 31;

                    break;

                case 4, 6, 9, 11:

                    System.out.println("Mes con 30 dias");

                    mes = 30;

                    break;

                default:

                    System.out.println("Mes con 28 dias");

                    mes = 28;

                    break;


            }

            for (mes = 0; mes < 13; mes++) {
                mes = mes + mes;
                System.out.println(mes);
            }

        } while (mes != 0 & mes < 365);

        int suma = mes + mes;

        System.out.println(suma);

    }

}








