package Clases.Tema4;

import java.util.Scanner;

//DISEÑA UNA FUNCIONA A LA QUE SE LE PASAN LAS HORAS Y MINUTOS
//DE DOS INSTANTES DE TIEMPO, CON EL SIGUIENTE PROTOTIPO:
//static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2)
//LA FUNCION DEVOLVERA LA CANTIDAD DE MINUTOS QUE EXISTEN DE DIFERENCIA
//ENTRE LOS DOS INSTANTES UTILIZADOS
public class ejercicio8 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Ingrese primera hora: ");

        int h1 = sn.nextInt();

        System.out.println("Ingrese minutos: ");

        int m1 = sn.nextInt();

        System.out.println("Ingrese segunda hora: ");

        int h2 = sn.nextInt();

        System.out.println("Ingrese minutos: ");

        int m2 = sn.nextInt();

        if (m1 < 0 || m1 > 59){
            System.out.println("Los minutos de la primera hora estan mal");
            System.out.println("Ingrese minutos: ");
            m1 = sn.nextInt();
        }

        if (m1 < 0 || m1 > 59){
            System.out.println("Los minutos de la segunda hora estan mal");
            System.out.println("Ingrese minutos: ");
            m2 = sn.nextInt();
        }

        if (h1 < 0 || h1 > 23){
            System.out.println("La primera hora esta mal");
            System.out.println("Ingrese primera hora: ");
            h1 = sn.nextInt();
        }

        if (h2 < 0 || h2 > 23){
            System.out.println("La segunda hora esta mal");
            System.out.println("Ingrese segunda hora: ");
            h2 = sn.nextInt();
        }

        System.out.println("La diferencia de minutos es: " + diferenciaMin(h1, m1, h2, m2));

    }

    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2){

        int diferencia = 0;

        if (hora1 > hora2){
            diferencia = (hora1 * 60 + minuto1) - (hora2 * 60 + minuto2);
        } else {
            diferencia = (hora2 * 60 + minuto2) - (hora1 * 60 + minuto1);
        }
        return diferencia;
    }
}
