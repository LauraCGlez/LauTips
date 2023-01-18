package Clases.Tema6.persona;

public class Ejercicio2 {


    public static void main(String[] args) {

        Movie m = new Movie();

        m.name = "Titanic";

        m.year = 1999;

        m.duration = 205;

        System.out.println(m.name);

    }

    static class Movie{
        String name;
        int year;
        double duration;

    }
}
