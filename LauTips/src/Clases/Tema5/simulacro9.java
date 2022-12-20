package Clases.Tema5;

//Función a la que se le pase una matriz bidimensional, unas coordenadas y
//devuelva el elemento que contiene en esa posición.

import java.util.Scanner;

public class simulacro9 {

    public static void main(String[] args) {

        int [][] matriz1 ={
                {10,15,18},
                {5,25,37},
                {7,19,32}
        };

        Scanner sn = new Scanner(System.in);

        System.out.println("Ingrese ls coordenadas(x,y)");

        int coordx = sn.nextInt();

        int coordy = sn.nextInt();

        System.out.println(posicion(matriz1, coordx, coordy));

    }

    static int posicion(int matrix[][], int x, int y){

        int elemento = 0;

        elemento = matrix[x][y];

        return elemento;
    }

}
