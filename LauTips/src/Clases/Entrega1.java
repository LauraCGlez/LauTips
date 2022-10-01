package Clases;

import java.util.Scanner;

public class Entrega1 {

    public static void main(String[] args) {

        Scanner sn1 = new Scanner(System.in);

        System.out.println("Tienes que ir a la biblioteca?");

        String respuesta1 = sn1.next();

        boolean biblioteca = true;

        if (respuesta1 == "si") {

            biblioteca = true;

        } else {

            biblioteca = false;

        }

        Scanner sn2 = new Scanner(System.in);

        System.out.println("Esta lloviendo?");

        String respuesta2 = sn2.next();

        boolean lluvia = true;

        if (respuesta2 == "si") {

            lluvia = true;

        } else {

            lluvia = false;

        }

        Scanner sn3 = new Scanner(System.in);

        System.out.println("Has terminado las tareas?");

        boolean tareas = true;

        String respuesta3 = sn3.next();

        if (respuesta3 == "si") {

            tareas = true;

        } else {

            tareas = false;

            if (biblioteca == true){

                System.out.println("Podemos salir a la calle");

            } else if (biblioteca == false || lluvia == false || tareas == true){

                System.out.println("Podemos salir a la calle");

            } else {
                System.out.println("No salimos");
            }

        }

    }

}
