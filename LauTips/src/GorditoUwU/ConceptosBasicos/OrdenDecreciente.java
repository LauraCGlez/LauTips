package GorditoUwU.ConceptosBasicos;

import java.util.Scanner;

public class OrdenDecreciente {

    public static void main(String[] args) {

        Scanner uno = new Scanner(System.in);
        System.out.println("Introduce un numero ");
        int num1 = uno.nextInt();

        Scanner dos = new Scanner(System.in);
        System.out.println("Introduce otro numero ");
        int num2 = dos.nextInt();

        int mayor, menor;

        mayor = num1 > num2 ? num1 : num2; // SI NUM1 ES EL MAYOR, ENTONCES MAYOR = NUM1

        menor = num1 < num2 ? num1 : num2; //SI NUM1 ES MENOR, ENTONCES MENOR = NUM1

        System.out.println(mayor + ", " + menor);

    }

}
