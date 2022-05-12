package GorditoUwU.ConceptosBasicos;

import java.util.Scanner;

public class Calcular_maximo {

    public static void main(String[] args) {

        Scanner uno = new Scanner(System.in);
        System.out.println("Introduce un numero ");
        int num1 = uno.nextInt();

        Scanner dos = new Scanner(System.in);
        System.out.println("Introduce otro numero ");
        int num2 = dos.nextInt();

        int maximo = num1 > num2 ? num1 : num2;
        System.out.println("El maximo es: " + maximo);

    }

}
