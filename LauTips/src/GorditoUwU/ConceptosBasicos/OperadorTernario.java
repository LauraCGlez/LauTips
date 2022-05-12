package GorditoUwU.ConceptosBasicos;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        Scanner num1 = new Scanner(System.in);
        System.out.println("a= ");
        int a = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.println("b= ");
        int b = num2.nextInt();

        String c;

        c = a < b ? "a es menor que b" : "b es menor que a";
        System.out.println(c);
    }
}
