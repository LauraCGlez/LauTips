package Clases.Tema5;

import java.lang.reflect.Array;
import java.util.Arrays;

// Crear una tabla de 10 elementos enteros. Rellenarlos de cualquier manera.
// Realizar los siguientes métodos para aplicarle a esa tabla:
// a) insertar nuevo elemento, b)borrar un elemento según la posición que se le pase,
// c) vaciar la tabla, d) mostrar la tabla por consola
// Crear una tabla bidimensional de longitud 5 x 5 y rellenarla de la siguiente forma:
// el elemento de la posición [n][m] debe contener el valor 10 x n + m.
// Después se debe mostrar su contenido.
public class ejercicio4 {

    public static void main(String[] args) {

        int[] matriz={5,6,7,8,9,10,11,12,13,14};

        matriz = new int[]{5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        removeElement(matriz, 2);

        Arrays.fill(matriz, 4);

        System.out.println(Arrays.toString(matriz));

        for (int i = 2; i <= matriz.length; i ++){

            Arrays.fill(matriz, i);
            matriz[10] = matriz[i];

        }
    }

    public static void removeElement( int [] matriz, int index ){
        int[] arrDestination = new int[matriz.length - 1];
        int remainingElements = matriz.length - ( index + 1 );
        System.arraycopy(matriz, 0, arrDestination, 0, index);
        System.arraycopy(matriz, index + 1, arrDestination, index, remainingElements);
        System.out.println("Elements -- "  + Arrays.toString(arrDestination));
    }

}
