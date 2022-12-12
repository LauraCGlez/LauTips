package GorditoUwU.Funciones;

//Diseñar una función con el siguiente prototipo:
//boolean esPrimo(int n)
//que devolverá true si n es primo y false en caso contrario


import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = sn.nextInt();
        for (int i = 1; i > 0; i++){
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
        if (n < 1){
            primo = false;
        }
        while (i <= (int) Math.sqrt(n) && primo) {
            if (n % i == 0) {
                primo = false;
            }
            i++;
        }
        return (primo);
    }
}
