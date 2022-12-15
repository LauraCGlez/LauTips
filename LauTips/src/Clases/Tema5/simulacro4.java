package Clases.Tema5;

import java.util.Arrays;

//Crear una tabla que contenga todos los números del 0 al 900 y mostrarla
public class simulacro4 {

    public static void main(String[] args) {

        int[] tabla = new int[901];

        for (int i = 0; i < tabla.length; i++){
            Arrays.fill(tabla, i);
            System.out.println(tabla[i]);
        }

    }

}
