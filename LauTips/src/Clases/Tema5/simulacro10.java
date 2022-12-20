package Clases.Tema5;


//Devuelve una fila (array unidimensional) de un array bidimensional
//   que se pasa como parámetro.
public class simulacro10 {

    public static void main(String[] args) {

        int [][] matriz1 ={
                {10,15,18},
                {5,25,37},
                {7,19,32}
        };

        for (int[] fila:matriz1){
            System.out.print("");
            for (int l: fila){
                System.out.print(l+" ");
            }
        }

    }



}
