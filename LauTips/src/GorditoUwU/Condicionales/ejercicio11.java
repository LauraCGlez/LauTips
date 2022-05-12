package GorditoUwU.Condicionales;

//DISEÑAR UN PROGRAMA QUE MUESTRE, PARA CADA NUMERO INTRODUCIDO POR TECLADO, SI ES PAR,
//SI ES POSITIVO Y SU CUADRADO. EL PROCESO SE REPETIRA HASTA QUE EL NUMERO INTRODUCIDO SEA 0

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzda un numero entero: ");

        int numero = sc.nextInt();

        while (numero != 0) {

            if (numero % 2 == 0){
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }

            if (numero < 0){
                System.out.println("El numero es negativo");
            } else {
                System.out.println("El numero es positivo");
            }

            System.out.println("El cuadrado del numero introducido es: " + numero * numero);

            System.out.println();

            System.out.println("Introduce un nuevo numero: ");

            numero = sc.nextInt();

        }

        System.out.println("El numero no puede ser cero");

    }

}
