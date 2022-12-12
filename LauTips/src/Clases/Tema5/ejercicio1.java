package Clases.Tema5;

//Crear una tabla de longitud 10 que se inicializará con números aleatorios
//comprendidos entre 1 y 100. Mostrar la suma de todos los números
//aleatorios que se guardan en la tabla.

import java.util.Arrays;
public class ejercicio1 {
    public static void main(String[] args) {

        int[] tabla = new int[10];

        int suma = 0;

        for (int i = 0; i< tabla.length; i++){

            double r = Math.random() * 100;
            tabla[i] = (int) r;
            suma += (int) r;

        }
        System.out.println(Arrays.toString(tabla));
        System.out.println(suma);
    }
}
