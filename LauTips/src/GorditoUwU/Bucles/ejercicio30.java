package GorditoUwU.Bucles;

//Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.

import java.util.Scanner;

public class ejercicio30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean suspensos = false;

        for (int i = 0; i < 5; i++){

            System.out.println("Introduce calificaciones de 5 alumnos: ");

            int notas = sc.nextInt();

            if (notas < 5){
                suspensos = true;
            }

        }

        System.out.println(suspensos);

    }

}
