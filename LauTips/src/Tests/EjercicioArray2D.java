package Tests;

public class EjercicioArray2D {
    public static void main(String[] args) {

        double acum;
        double interes=0.10;

        double[][] saldo = new double[6][5];

        for (int i=0;i<6;i++){

            saldo[i][0]  = 10000;
            acum = 10000;

            for (int j=1;j<5;j++){
                acum=acum+(acum*interes);

                saldo[i][j]=acum;
            }

            interes=interes+0.01;

        }
        for (int z=0;z<6;z++){
            System.out.println();

            for (int l=0;l<5;l++){
                System.out.printf("%1.2f", saldo[z][l]);
                System.out.println(" ");
            }
        }

    }
}
