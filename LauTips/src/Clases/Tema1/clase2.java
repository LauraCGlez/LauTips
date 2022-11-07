package Clases.Tema1;

import GorditoUwU.Condicionales.Fecha;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class clase2 {

    public static void main(String[] args) {

        int dia, mes, anho;

        Calendar hoy = Calendar.getInstance();

        dia = hoy.get(Calendar.DATE);

        mes = hoy.get(Calendar.MONTH) + 1;

        anho = hoy.get(Calendar.YEAR);

        LocalDateTime uno = LocalDateTime.now();

        LocalDate dos = LocalDate.now();

        System.out.println("La fecha de hoy es: " + dia + " /" + mes  + " /" + anho);

        System.out.println(uno);

        System.out.println(dos);
    }



}
