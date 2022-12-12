package GorditoUwU.Funciones;

import java.util.Scanner;

//a^n = a * a ^n-1
public class ejercicio16 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        int numero = sn.nextInt();

        System.out.println("Introduce el exponente: ");

        int n = sn.nextInt();

        System.out.println("resultado: " + recursiva(numero, n));

    }

    static int recursiva(int base, int exponente){

        int resultado = 0;

        if (exponente == 0){
            resultado = 1;
        } else {
            resultado = base * recursiva(base, exponente - 1);
        }
        return resultado;
    }

}
