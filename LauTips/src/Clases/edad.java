package Clases;

import javax.swing.*;
import java.util.Calendar;
import java.util.Scanner;

public class edad {

    public static void main(String[] args) {

       /* int anho;

        Calendar hoy = Calendar.getInstance();

        anho = hoy.get(Calendar.YEAR);

        System.out.println(anho);

        Scanner sn = new Scanner(System.in);

        System.out.println("Ingrese año de nacimiento:");

        int nacimiento = sn.nextInt();

        System.out.println("Has cumplido o cumples: " + ( anho - nacimiento));


        //Actividad: pedir al usuario su edad y mostrar la que tendrá el próximo año.

        Scanner sn1 = new Scanner(System.in);

        System.out.println("Escribe tu edad: ");

        int edad = sn1.nextInt();

        System.out.println("El proximo año vas a cumplir: " + (edad + 1));

        //Actividad: calcular una aplicación que calcule la media aritmética de dos notas
        //enteras. Hay que tener en cuenta que la media puede contener decimales.

        Scanner nota1 = new Scanner(System.in);

        System.out.println("Ingrese la primera nota: ");

        double not1 = nota1.nextDouble();

        Scanner nota2 = new Scanner(System.in);

        System.out.println("Ingresa la segunda nota: ");

        double not2 = nota2.nextDouble();

        double media = (not1 + not2)/2;

        System.out.println("Tu media aritmetica es: " + media);

        //EJERCICIO: Realizar una aplicación que solicite al usuario su edad y le indique si es mayor
        //de edad (mediante un literal booleano: true o false).

        Scanner edadx = new Scanner(System.in);

        System.out.println("Introduzca su edad");

        int edadxx = edadx.nextInt();

        if (edadxx >= 18){
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        } */

        //Escribir un programa que pida un número al usuario e indique mediante un literal
        //booleano si el número es par.

        Scanner numero = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");

        int numerx = numero.nextInt();

        boolean paridad = true;

        if (numerx % 2 == 0){

            paridad = true;

            System.out.println("El numero es par");

            System.out.println(paridad);

        } else {

            paridad = false;

            System.out.println("El numero es impar");

            System.out.println(paridad);

        }

    }

}
