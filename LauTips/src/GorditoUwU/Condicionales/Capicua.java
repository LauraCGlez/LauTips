package GorditoUwU.Condicionales;

//ESCRIBE UNA APLICACION QUE SOLICITE AL USUARIO UN NUMERO COMPRENDIDO ENTRE 0 Y 9999. LA
//APLICACION TENDRA QUE INDICAR SI EL NUMERO INTRODUCIDO ES CAPICUA

import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {

        int falta, invertido, resta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entre 0 y 9999: ");
        int numero = sc.nextInt();
        falta = numero;
        invertido = 0;
        resta = 0;

        while (falta != 0){
            resta = falta % 10;
            invertido = invertido * 10 + resta;
            falta = falta / 10;
        }
        if (invertido == numero){
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicua");
        }
    }
}
