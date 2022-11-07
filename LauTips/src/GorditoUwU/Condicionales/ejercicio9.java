package GorditoUwU.Condicionales;

//Escribir un programa que pida una hora de la siguiente forma: hora, minutos y segundos.
//El programa debe mostrar qué hora será un segundo más tarde. Por ejemplo:
//hora actual [10:41:59] —+ hora actual +1 segundo: [10:42:00]

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la hora actual (00 a 24): ");

        int hora = sc.nextInt();

        if (hora < 0 || hora > 23){
            System.out.println("Hora incorrecta, vuelva a intentarlo");
        }

        System.out.println("Introduce los minutos (00 a 59): ");

        int minutos = sc.nextInt();

        if (minutos < 0 || minutos > 59){
            System.out.println("Minutos incorrectos, vuelva a intentarlo");
        }

        System.out.println("Introduce los segundos (00 a 59): ");

        int segundos = sc.nextInt();

        if (segundos < 0 || segundos > 59){
            System.out.println("Segundos incorrectos, vuelva a intentarlo");
        }

        System.out.println("La hora actual es: " + "[" + hora + ":" + minutos + ":" + segundos + "]");

        segundos ++;

        if (segundos > 59){
            segundos = 0;
            minutos ++;
        }

        if (minutos > 59){
            minutos = 0;
            hora ++;
        }

        if (hora > 23){
            hora = 0;
        }

        System.out.println("La hora actual más 1 segundo es: "+ "[" + hora + ":" + minutos + ":" + segundos + "]");

    }

}
