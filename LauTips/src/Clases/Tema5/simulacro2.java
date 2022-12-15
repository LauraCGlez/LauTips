package Clases.Tema5;

import java.lang.reflect.Array;
import java.util.Arrays;

//Ordenar la siguiente tabla [5,7,8,4,3,6,0,0,8,1] de menor a mayor.
public class simulacro2 {

    public static void main(String[] args) {

        int[] tabla = {5, 7, 8, 4, 3, 6, 0, 0, 8, 1};

        /*for (int numero:tabla)
            System.out.println(numero);*/

        //System.out.println(Arrays.toString(tabla));

        //Arrays.sort(tabla);

        //System.out.println(Arrays.toString(ordenar(tabla)));

        System.out.println(Arrays.toString(tabla));

        ordenar1(tabla);

        System.out.println(Arrays.toString(tabla));

    }

    static int[] ordenar(int tabla[]){

        int[] tablaOrdenada = tabla;

        Arrays.sort(tablaOrdenada);

        return tablaOrdenada;
    }

    static void ordenar1(int tabla[]){

        Arrays.sort(tabla);

    }

}
