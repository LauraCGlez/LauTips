package Clases.Tema2;

import java.util.Scanner;

public class Clase1 {

    public static void main(String[] args) {

        //Escribe una aplicación que pida al usuario dos números enteros y muestre true si ambos
        //números son distintos entre sí o alguno de ellos es cero; y false en caso contrario.

        Scanner sn = new Scanner(System.in);
        System.out.println("Escriba dos numeros enteros");
        int num1 = sn.nextInt();
        int num2 = sn.nextInt();

        boolean distintos = num1 != num2;
        boolean cero = (num1 == 0) || (num2 == 0);
        boolean resultado = distintos || cero;
        System.out.println("Los numeros son distintos?: " + distintos);
        System.out.println("uno de los dos es cero?: " + cero);
        System.out.println(resultado);
    }

}
