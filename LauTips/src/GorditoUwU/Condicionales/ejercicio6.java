package GorditoUwU.Condicionales;

//Escribir una aplicación que indique cuántas cifras tiene un número entero introducido por
//teclado que estará comprendido entre 0 y 99999.

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Introduce un numero entre 0 y 99999: ");
        String cifras = num.next();

        if (cifras.length() == 1){
            System.out.println("una cifra");
        } else if (cifras.length() == 2) {
            System.out.println("dos cifras");
        } else if (cifras.length() == 3) {
            System.out.println("tres cifras");
        } else if (cifras.length() == 4) {
            System.out.println("cuatro cifras");
        } else if (cifras.length() == 5) {
            System.out.println("cinco cifras");
        } else {
            System.out.println("El numero es incorrecto");
        }
    }
}
