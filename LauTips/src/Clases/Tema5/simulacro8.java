package Clases.Tema5;

import java.util.Arrays;

//Devuelve el valor máximo de un array bidimensional que se pasa como
//   parámetro.
public class simulacro8 {


        public static void main(String[] args) {
            int[] intArray = {24, 2, 0, 34, 12, 110, 2};

            int maxNum = intArray[0];

            for (int numero : intArray) {
                if (numero > maxNum)
                    maxNum = numero;
            }

            System.out.println("Maximum number = " + maxNum);
        }
    }