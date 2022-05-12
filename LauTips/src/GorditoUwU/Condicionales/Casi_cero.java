package GorditoUwU.Condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Casi_cero {

    public static void main(String[] args) {

        Scanner num1 = new Scanner(System.in);
        num1.useLocale(Locale.US); //PARA PODER USAR . CON LOS DECIMALES
        System.out.println("Introduce un numero decimal ");
        double a = num1.nextDouble();

        if (-1 < a && a < 1 && a != 0){
            System.out.println("Es un numero casi-cero");
        }else {
            System.out.println("No es un numero casi-cero");
        }

    }

}
