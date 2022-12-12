package Clases.Tema5;

//Crear una tabla de 10 elementos enteros. Rellenarlos de cualquier manera.
// Realizar los siguientes métodos para aplicarle a esa tabla:
// a) insertar nuevo elemento, b)borrar un elemento según la posición que se le pase,
// c) vaciar la tabla, d) mostrar la tabla por consola
//Crear una tabla bidimensional de longitud 5 x 5 y rellenarla de la siguiente forma:
// el elemento de la posición [n][m] debe contener el valor 10 x n + m.
// Después se debe mostrar su contenido.
public class ejercicio4 {

   /* public static void main(String[] args) {

        int[] tabla1 = new int[10];

        for (int i = 2; i <= tabla1.length; i ++){

            tabla1[20] = tabla1[i];

        }
    }*/

    public static void main(String[] args){

        int[][] tabla2 = new int[(int) (Math.random()*9+1)][(int) (Math.random()*9+1)];

        for (int i = 1; i <= 5; i = i * 10){

            for (int j = 1; j <= 5; j = j * 10){

                tabla2[i][j] = (int) (Math.random()*9+1);

                System.out.println(tabla2[i][j]);

            }
        }
    }
}
