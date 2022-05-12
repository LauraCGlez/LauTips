package GorditoUwU.Condicionales;

//CREAR UN PROGRAMA QUE SOLICITE AL USUARIO UNA FECHA (DIA, MES, AÑO)
// Y MUESTRE LA FECHA CRRESPONDIENTE AL DIA SIGUIENTE

import java.util.Scanner;

public class Fecha {

    public static void main(String[] args) {

        System.out.println("Introduce la fecha actual (dd, mm, aaaa: )");

        Scanner sc = new Scanner(System.in);

        int diasDelMes = 0;

        int dia = sc.nextInt();

        if (dia < 0 && dia > 31){
            System.out.println("Dia incorrecto");
        }

        int mes = sc.nextInt();

        if (mes < 0 && mes > 12){
            System.out.println("Mes incorrecto");
        }

        int agno = sc.nextInt();

        if (agno < 0 && agno > 2022){
            System.out.println("Año incorrecto");
        }

        System.out.println("La fecha actual es: " + dia + ", " + mes + ", " + agno);


        diasDelMes = switch (mes){

            case 2 -> 28;

            case 4, 6, 9, 11 -> 30;

            default -> 31;

        };


        dia ++;

        if (dia > diasDelMes){
            dia = 1;
            mes ++;
        }

        if (mes > 12){
            mes = 0;
            agno ++;
        }

        if (agno == 0){
            agno = 1;
        }

        System.out.println("Mañana sera: " + dia + "/" + mes + "/" + agno);

    }

}
