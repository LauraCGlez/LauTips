package Clases.Tema2;

import java.util.Scanner;

public class Clase1b {



    public static void main(String[] args) {

        //Realiza un programa que informe al usuario (mostrando true) si un número es múltiplo
        //de otro número. Ambos números se piden por teclado

        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");
        int num1 = sn.nextInt();
        int num2 = sn.nextInt();

        boolean mult = num1 % num2 == 0 && num1 >= num2;

        System.out.println(mult);

    }
}
