package Tests;
import javax.swing.*;

public class Factorial {
    public static void main(String[] args) {
        Long result=1L;
        int number=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

        for (int i=number;i>0;i--){
            result=result*i;
        }
        System.out.println("El factorial de " +number +" es " + result);
    }
}
