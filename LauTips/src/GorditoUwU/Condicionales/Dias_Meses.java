package GorditoUwU.Condicionales;

import java.util.Scanner;

public class Dias_Meses {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un mes (1 al 12) ");

        int mes = sc.nextInt();

        switch (mes){

            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Este mes tiene 31 dias");
                break;
            case 2:
                System.out.println("Este mes tiene 28 dias");
                break;
            case 4, 6, 9, 11:
                System.out.println("Este mes tiene 30 dias");
                break;
            default:
                System.out.println("El numero introducido es incorrecto, por favor intentelo de nuevo");

        }

    }

}
