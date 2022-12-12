package GorditoUwU.Funciones;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Introduce dos numeros: ");

        int a = sn.nextInt();

        int b = sn.nextInt();

        System.out.println(suma(a, b));

    }

    static int suma(int a,int b){

        int resultado;

        if (b == 1){
            resultado = a + 1;
        } else {
            resultado = suma(a + 1, b - 1);
        }
        return resultado;
    }
}
