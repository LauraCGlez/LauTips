package Tests;

import java.util.Locale;
import java.util.Scanner;


public class Circulo {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor del radio ");
        sc.useLocale(Locale.US);
        double radio = sc.nextDouble();

        double area=Math.PI*Math.pow(radio,2);

        System.out.println("El area del circulo es " + area);
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio");
        sc.useLocale(Locale.US);
        double radio = sc.nextDouble();
        double area = Math.PI*Math.pow(radio,2);
        System.out.println("El area del circulo es "+ area);
    }

}
