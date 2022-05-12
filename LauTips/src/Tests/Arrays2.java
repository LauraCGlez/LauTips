package Tests;
import javax.swing.*;

public class Arrays2 {
    public static void main(String[] args) {

        //RELLENO MANUAL
        /*String [] countries=new  String[8];

        countries[0]="Spain";
        countries[1]="Cuba";
        countries[2]="Germany";
        countries[3]="England";
        countries[4]="Italy";
        countries[5]="Canada";
        countries[6]="Mexico";
        countries[7]="Brazil";*/

        /*for (int i=0; i<countries.length;i++){
            System.out.println("Pais "+(i+1)+ " "+countries[i]);
        }*/

        //String[] countries={"Spain","Cuba","Germany","England","Italy"};



        //USO DE JOPTIPNPANE
        /*String[] countries=new String[8];

        for (int i=0;i<8;i++){
            countries[i]=JOptionPane.showInputDialog("Introduce pais " + (i+1));
        }

        for (String elements:countries){
            System.out.println("Pais " + elements);
        }*/

        //RELLENO ALEATORIO
        int[] matrizRandom=new int[150];

        for (int i=0; i<matrizRandom.length;i++){
            matrizRandom[i]=(int)Math.round(Math.random()*100);

        }

        for (int numbers:matrizRandom){
            System.out.print(numbers+ " ");
        }
    }
}
