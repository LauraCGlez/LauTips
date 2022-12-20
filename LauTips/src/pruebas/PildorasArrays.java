package pruebas;

public class PildorasArrays {

    public static void main(String[] args) {

        int [] prueba = new int[5]; //DECLARACION DE LA MATRIZ O ARRAY

        int [] prueba1 = {2,3,4,5,6}; //DECLARACION DE LA MATRIZ O ARRAY

        for (int i = 0; i < prueba.length; i++){
            prueba[i] = (int)Math.round(Math.random()*100);
            System.out.println(prueba[i]);
        }

        for (int i = 0; i < prueba1.length; i++){
            System.out.println(prueba1[i]);
        }

        int[][] matrizBi1 = new int[(int) (Math.random()*9+1)][(int) (Math.random()*9+1)];

        int[][] matrizBi = new int[4][4];

        for (int i = 0; i < matrizBi.length; i++){

            System.out.println();

            for (int j = 0; j < matrizBi.length; j++){

                matrizBi[i][j] = (int)Math.round(Math.random()*100);

                System.out.print(matrizBi[i][j] + " ");

            }
        }

        System.out.println();

        System.out.println("Lo mismo pero con foreach");

        for (int[]fila:matrizBi) {
            System.out.println();

            for (int columna: fila) {
                System.out.print(columna + " ");
            }
        }
    }
}
