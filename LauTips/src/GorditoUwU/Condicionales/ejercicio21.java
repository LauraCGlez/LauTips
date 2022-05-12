package GorditoUwU.Condicionales;

//Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El
//jugador tendrá que introducir la solución de la suma de dos números
//aleatorios comprendidos entre 1 y 100. Mientras la solución introducida sea
//correcta, el juego continuará. En caso contrario, el programa terminará y
//mostrará el número de operaciones realizadas correctamente.

import java.util.Scanner;

public class ejercicio21 {

    public static void main(String[] args) {

        int a;

        int b;

        int suma = 0;

        int respuesta;

        int cont = -1;


        do {
            Scanner sc = new Scanner(System.in);

            a = (int) (Math.random()*100 + 1);

            b = (int) (Math.random()*100 + 1);

            System.out.println("Introduzca la suma de " + a + " + " + b);

            respuesta = sc.nextInt();


            suma = a + b;

            if (respuesta == (a + b)){
                System.out.println("La respuesta es correcta, puede continuar");
            }

            cont ++;



        } while (suma == respuesta);


        System.out.println("Lo sentimos su respuesta no es correcta, ha tenido " + cont + " respuestas correctas");

    }
}
