package Tests;

public class ArraysBidim2 {
    public static void main(String[] args) {

        int [][] matrix ={
                {10,15,18,19,21},
                {5,25,37,41,15},
                {7,19,32,14,90},
                {85,2,7,40,27}
        };

        //FOR TRADICIONAL
        /*for (int i=0;i<4;i++){
            System.out.println();
            for (int j=0;j<5;j++){
                System.out.println(matrix[i][j]+" ");
            }
        }*/

        //fOR-EACH
        for (int[] fila:matrix){
            System.out.print("");
            for (int l: fila){
                System.out.println(l+" ");
            }
        }
    }
}
