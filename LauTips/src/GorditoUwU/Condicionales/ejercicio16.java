package GorditoUwU.Condicionales;

//DISEÑA UNA APLICACION QUE MUESTRE LA EDAD MAXIMA Y MINIMA DE UN GRUPO DE ALUMNOS. EL USUARIO
//INTRODUCIRA LAS EDADES Y TERMINARA ESCRIBIENDO UN -1.

import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la edad del alumno: ");

        int edad = sc.nextInt();

        int edadMax = 0;

        int edadMin = 300;

        int cont = 0;

        while (edad != -1){

            if (edad > edadMax){
                edadMax = edad;
            }

            if (edad < edadMin && edad != -1){
                edadMin = edad;
            }

            System.out.println("Introduce la edad del alumno: ");

            edad = sc.nextInt();

            cont ++;


        }

        System.out.println("edad maxima es: " + edadMax);

        System.out.println("edad minima es: " + edadMin);

        System.out.println("el total de edades introducidas fue: " + cont);

    }

}
