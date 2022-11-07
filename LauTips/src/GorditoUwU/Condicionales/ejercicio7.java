package GorditoUwU.Condicionales;

//Pedir una nota entera de O a 10 y mostrarla de la siguiente forma: insuficiente (de O a 4),
//suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).
//REALIZAR CON IF ELSE
//REALIZAR CON SWITCH

import javax.swing.*;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba su nota sobre 10 ");

        int nota = sc.nextInt();

        //CON IF ELSE

      /*  if (nota >= 0 && nota <= 4){
            System.out.println("insuficiente");
        } else if (nota == 5) {
            System.out.println("suficiente");
        } else if (nota == 6){
            System.out.println("bien");
        } else if (nota == 7 || nota == 8) {
            System.out.println("notable");
        } else {
            System.out.println("sobresaliente");
        }*/


        //CON SWITCH

        switch (nota) {
            case 0, 1, 2, 3, 4:
                System.out.println("insuficiente");
                break;
            case 5:
                System.out.println("suficiente");
                break;
            case 6:
                System.out.println("bien");
                break;
            case 7, 8:
                System.out.println("notable");
                break;
            default:
                System.out.println("sobresaliente");
        }
    }
}