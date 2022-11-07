package GorditoUwU.Condicionales;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 2 numeros: ");

        int a = sc.nextInt();

        int b = sc.nextInt();

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresar operador(-,+,*,/): ");

        char operador = entrada.next().charAt(0);

        if (operador == '-'){
            System.out.println("Resta de: " + a + " y " + b + " es igual a " + (a-b));
        } else if (operador == '+') {
            System.out.println("Suma de: " + a + " y " + b + " es igual a " + (a+b));
        } else if (operador == '*') {
            System.out.println("Multiplicacion de: " + a + " y " + b + " es igual a " + (a*b));
        } else {
            System.out.println("Division de: " + a + " y " + b + " es igual a " + (a/b));
        }
    }
}
