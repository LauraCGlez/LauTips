package Tests;

public class ArraysBidim {
    public static void main(String[] args) {
        int[][] matrizBi =new int[4][5];

        matrizBi[0][0]=15;
        matrizBi[0][1]=21;
        matrizBi[0][2]=18;
        matrizBi[0][3]=9;
        matrizBi[0][4]=15;

        matrizBi[1][0]=10;
        matrizBi[1][1]=52;
        matrizBi[1][2]=17;
        matrizBi[1][3]=19;
        matrizBi[1][4]=7;

        matrizBi[2][0]=19;
        matrizBi[2][1]=2;
        matrizBi[2][2]=19;
        matrizBi[2][3]=17;
        matrizBi[2][4]=7;

        matrizBi[3][0]=92;
        matrizBi[3][1]=13;
        matrizBi[3][2]=11;
        matrizBi[3][3]=32;
        matrizBi[3][4]=41;


        for (int i=0; i<4; i++){

            for (int j=0; j<5;j++){

                System.out.println(matrizBi[i][j]);
            }
        }
    }
}
