package GorditoUwU.Condicionales;

import java.util.Scanner;

//RUTINA QUE PIDE UN NUMERO E IMPRIME PAR SI ES DIVISIBLE ENTRE 2 O IMPAR SI NO LO ES

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = num.nextInt();


       /* if(numero%2==0){

            System.out.println("El numero es par");

        } else {

            System.out.println("El numero es impar");
        }
        */
        if (numero%2==0){
            System.out.println("Par");
        }

        if (numero%2!=0){
            System.out.println("Impar");
        }
    }
}
