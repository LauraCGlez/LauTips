package Clases;

import javax.swing.*;
import java.time.Instant;
import java.time.Year;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class dam {

    public static void main(String[] args) {


        /*int a = 2;

        int b = 3;

        int suma = a + b;

        System.out.println(suma);*/

        String name = JOptionPane.showInputDialog("Escribe tu nombre");

        System.out.println("Tu nombre es: " + name + " y tiene " + name.length() + " letras");

        String[] nameSeparated = name.split("\\\\|");

        System.out.println(Arrays.asList(nameSeparated));

        System.out.println("La posicion 3 la ocupa la letra: " + name.charAt(2));

        System.out.println(name.indexOf("a"));

        System.out.println(name.hashCode());

        int anho;

        Calendar hoy = Calendar.getInstance();

        anho = hoy.get(Calendar.YEAR);

        System.out.println(anho);

        Scanner sn = new Scanner(System.in);

        System.out.println("Ingrese año de nacimiento:");

        int nacimiento = sn.nextInt();

        System.out.println("Edad: " + ( anho - nacimiento));

    }

}
