package GorditoUwU.Condicionales;

import java.util.Scanner;

//INTRODUCIR 2 NUMEROS Y DEVOLVER TRUE SI SON DISTINTOS O UNO DE LOS DOS ES IGUAL A CERO

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner numero1 = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int a = numero1.nextInt();

        Scanner numero2 = new Scanner(System.in);
        System.out.println("Introduce otro numero: ");
        int b = numero2.nextInt();


        if (a!=b || a==0 || b==0){
            System.out.println(true);

        }else {
            System.out.println(false);
        }

    }
}

