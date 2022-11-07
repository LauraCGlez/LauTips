package Clases.Tema2;

import java.util.Scanner;

public class UsoDelIf {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Escribe tu nombre: ");

        String nombre = sn.nextLine();

        if (nombre.length() > 5){

            System.out.println("Tienes un nombre largo");

        } else {
            System.out.println("Tienes un nombre corto");
        }


    }

}
