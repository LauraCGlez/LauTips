package GorditoUwU.Bucles;

//Diseñar un programa que muestre la suma de los 10 primeros números
//impares.

public class ejercicio27 {

    public static void main(String[] args) {

        int suma = 0;

        for (int i = 1; i <= 20; i+=2){

            System.out.print(i+",");

            suma += i;


        }

        System.out.println();
        System.out.println(suma);

    }

}
