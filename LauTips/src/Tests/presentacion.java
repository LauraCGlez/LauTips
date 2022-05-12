package Tests;

import javax.swing.*;
//import java.util.Scanner;

public class presentacion {
  /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Bienvenido " + nombre);
    }*/

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        System.out.println("Bienvenido " + nombre);
    }
}
