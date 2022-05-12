package Tests;

public class Arrays {
    public static void main(String[] args) {
        int[] matriz1=new int[5];
        matriz1[0]=5;
        matriz1[1]=38;
        matriz1[2]=-15;
        matriz1[3]=92;
        matriz1[4]=71;

        int[] matriz={5,6,7,8,9,10,11,12,13,14,15};

        for (int i=0;i<matriz.length;i++){
            System.out.println("Valor del indice " +i+ " =" +matriz[i]);
        }
    }
}
