package Clases.Tema5;

//Devuelve una columna (array unidimensional) de un array
//   bidimensional que se pasa como parámetro.
public class simulacro11 {

        public static void main(String[] args) {

            int [][] matriz1 ={
                    {10,15,18},
                    {5,25,37},
                    {7,19,32}
            };

            for (int[] columna:matriz1){
                System.out.print("");
                for (int l: columna){
                    System.out.println(l+" ");
                }
            }

        }

    }

