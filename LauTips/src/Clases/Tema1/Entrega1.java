package Clases.Tema1;

import java.util.Scanner;

public class Entrega1 {

    public static void main(String[] args) {

        Scanner sn1 = new Scanner(System.in);

        System.out.println("Tienes que ir a la biblioteca?");

        String respuesta1 = sn1.nextLine();

        boolean biblioteca;

        if (respuesta1 == "si") {

            biblioteca = true;

        } else {

            biblioteca = false;

        }

        Scanner sn2 = new Scanner(System.in);

        System.out.println("Esta lloviendo?");

        String respuesta2 = sn2.nextLine();

        boolean lluvia;

        if (respuesta2 == "si") {

            lluvia = true;

        } else {

            lluvia = false;

        }

        Scanner sn3 = new Scanner(System.in);

        System.out.println("Has terminado las tareas?");

        boolean tareas;

        String respuesta3 = sn3.nextLine();

        if (respuesta3 == "si") {

            tareas = true;

        } else {

            tareas = false;

        }


        boolean salida;

        if (biblioteca == true){

            salida = true;

            System.out.println(salida);

            System.out.println("Podemos salir a la calle");



        } else if (biblioteca == false && (lluvia == true || tareas == false)){

            salida = false;

            System.out.println(salida);

            System.out.println("No podemos salir a la calle");

        } else {

            salida = true;

            System.out.println(salida);

            System.out.println("Podemos salir a la calle");
        }

    }

}