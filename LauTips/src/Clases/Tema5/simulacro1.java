package Clases.Tema5;

import java.util.Scanner;

//Crea un método al que se le pase: una tabla rellena de enteros y un entero.
//Habrá que buscar ese elemento en la tabla.
public class simulacro1 {

    public static void main(String[] args) {

        int[] matriz = new int[5];

        Scanner sn = new Scanner(System.in);

        System.out.println("Introduce una posicion: ");

        int posicion = sn.nextInt();

        buscador(matriz, posicion);

    }

    static void buscador(int[] matriz, int n){

        for (int i = 0; i < matriz.length; i++){

           matriz[5] = matriz[i];

           System.out.println(matriz[n]);

        }
    }
}
