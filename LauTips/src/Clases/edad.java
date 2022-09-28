package Clases;

import java.util.Calendar;
import java.util.Scanner;

public class edad {

    public static void main(String[] args) {

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
