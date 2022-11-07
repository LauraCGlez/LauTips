package Clases.Tema1;

import javax.swing.*;
import java.util.Scanner;

public class numero {

        public static void main(String[] args) {

            //Diseñar un programa que pida un número al usuario, por teclado, y a continuación lo
            //muestre.

            Scanner sc = new Scanner(System.in);

            System.out.println("Escriba un numero: ");

            int num = sc.nextInt();

            System.out.println(num);

            JOptionPane.showMessageDialog(null, "Hello World");

        }



}
