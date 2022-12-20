package Clases.Tema5;

import java.util.Arrays;

//Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra matriz nxn.
public class simulacro7 {

    public static void main(String[] args) {

        int [][] matriz1 ={
                {10,15,18},
                {5,25,37},
                {7,19,32}
        };

        int [][] matriz2 ={
                {10,15,18},
                {5,25,37},
                {7,19,32}
        };

        sumar(matriz1, matriz2);

    }

    public static int [][]sumar(int mat1[][],int mat2[][]){
        int suma[][]=new int[3][3];
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                suma[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(suma[i][j]+" ");
            }
            System.out.println(" ");
        }
        return suma;
    }


}
