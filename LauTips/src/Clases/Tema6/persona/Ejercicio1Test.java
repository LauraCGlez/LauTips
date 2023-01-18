package Clases.Tema6.persona;

public class Ejercicio1Test {

    public static void main(String[] args) {

        Ejercicio1 m = new Ejercicio1();

        m.modelo = "IPhone";

        m.anhoLanzamiento = 2022;

        m.tamanho = 7.5;

        System.out.println("El modelo del dispositivo es: " + m.modelo);

        System.out.println("Antiguedad: " + m.getAntiguedad(m.anhoLanzamiento) + " año(s)");

        m.cambiar(2022);

        System.out.println("Segun su tamaño es: " + m.getTamanho(m.tamanho));

    }

}
