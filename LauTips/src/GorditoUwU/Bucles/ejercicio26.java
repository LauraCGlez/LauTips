package GorditoUwU.Bucles;

//Implementar una aplicación que pida al usuario
//un número comprendido entre 1 y 10. Hay que
//mostrar la tabla de multiplicar de dicho número,
//asegurándose de que el número introducido se
//encuentra en el rango establecido.

import java.util.Scanner;

public class ejercicio26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entre 1 y 10: ");

        int numero = sc.nextInt();

        if (numero > 10 || numero < 1){

            System.out.println("El numero es incorrecto, vuelva a intentarlo");

            numero = sc.nextInt();

        }

        for (int i=0; i <= 10; i++){

            System.out.println(numero + "*" + i + "=" + numero * i);

        }

    }

}
