package GorditoUwU.Condicionales;

//IMPLEMENTAR UNA APLICACION PARA CALCULAR DATOS ESTADISTICOS DE LAS EDADES DE
//LOS ALUMNOS DE UN CENTRO EDUCATIVO. SE INTRODUCIRAN DATOS HASTA QUE UNO
//DE ELLOS SEA NEGATIVO, Y SE MOSTRARA: LA SUMA DE TODAS LAS EDADES INTRODUCIDAS,
//LA MEDIA, EL NUMERO DE ALUMNOS Y CUANTOS SON MAYORES DE EDAD.

import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la edad del alumno: ");

        int edad = sc.nextInt();

        int sumEdades = 0; //ACUMULARA LA SUMA DE TODAS LS EDADES INTRODUCIDAS

        int contador = 0; //CONTADOR DE ALUMNOS EN TOTAL

        int contadorMayores = 0; //CONTADOR DE ALUMNOS MAYORES DE EDAD

        double media; //MEDIA DE EDADES

        while (edad >= 0){
            sumEdades += edad; //ACUMULAMOS LA EDAD INTRODUCIDA
            contador++; //INCREMENTAMOS EL CONTADOR DE EDADES

            if (edad >= 18){
                contadorMayores++; //INCREMENTAMOS EL CONTADOR DE ALUMNOS MAYORES DE EDAD
            }
            System.out.println("Introduce la edad del alumno: ");
            edad = sc.nextInt(); //VOLVEMOS A LEER

        }

        media = (double) sumEdades / contador; //CASTEO PARA HACER UNA DIVISION REAL

        System.out.println("Suma de edades: " + sumEdades);
        System.out.println("Media de edades: " + media);
        System.out.println("Total de alumnos: " + contador);
        System.out.println("Alumnos mayores de edad: " + contadorMayores);

    }

}
