package GorditoUwU.Funciones;

//Diseñar una función con el siguiente prototipo:
//boolean esPrimo(int n)
//que devolverá true si n es primo y false en caso contrario

import javax.swing.*;

public class ejercicio6 {

    public static void main(String[] args) {

        int numero;

        for (int i = 1; i <= 15; i++){
            if (esPrimo(i)){
                System.out.println(i + " es primo");
            } else {
                System.out.println(i + " es compuesto");
            }
        }
    }

    static boolean esPrimo(int n){

        boolean primo = true;

        int i = 2;

        if (n < 2){

            primo = false;
        }

        while (i <= (int) Math.sqrt(n) && primo == true) {

            if (n % i == 0) {
                primo = false;
            }
            i++;
        }
        return (primo);
    }
}
