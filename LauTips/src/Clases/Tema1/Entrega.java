package Clases.Tema1;

import java.util.Scanner;

public class Entrega {

    //Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que nos
    //influyen en esta decisión: si está lloviendo y si hemos terminado nuestras tareas.
    //Sólo podemos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. Existe
    //una opción en la que, indistintamente de los anterior, podremos salir a la calle: el hecho de que
    //tengamos que ir a la biblioteca (para realizar algún trabajo entregar los libros, etcétera).
    //Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir
    //a la biblioteca. El algoritmo debe mostrar mediante un booleano (TRUE o FALSE) si es posible
    //que se le otorgue el permiso para ir a la calle.

    public static void main(String[] args) {

        Scanner sn1 = new Scanner(System.in);

        System.out.println("Tienes que ir a la biblioteca?");

        boolean biblioteca = sn1.nextBoolean();

        Scanner sn2 = new Scanner(System.in);

        System.out.println("Esta lloviendo?");

        boolean lluvia = sn2.nextBoolean();

        Scanner sn3 = new Scanner(System.in);

        System.out.println("Has terminado las tareas?");

        boolean tareas = sn3.nextBoolean();

        boolean salida;

        salida = biblioteca;

        System.out.println(salida);

        if (biblioteca == true){

            System.out.println("Podemos salir a la calle");

        } else if (lluvia == false && tareas == true){

            System.out.println("Podemos salir a la calle");

        } else {

            System.out.println("No salimos");
        }


    }

}
