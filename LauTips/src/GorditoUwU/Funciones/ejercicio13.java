package GorditoUwU.Funciones;

//Crea un método que obtenga la suma de los números naturales desde 1
//hasta N. Se debe pasar como parámetro el número N

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        int numero = sn.nextInt();

        System.out.println("La suma hasta "+ numero+ " es: " + suma(numero));

    }

    static int suma(int n){

        int resultado;

        if (n == 1){
            resultado = 1;
        } else {
            resultado = n + suma(n - 1);
        }

        return resultado;
    }

}
