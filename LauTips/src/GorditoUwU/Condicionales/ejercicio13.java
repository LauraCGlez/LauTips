package GorditoUwU.Condicionales;

//CODIFICAR UN JUEGO <EL NUMERO SECRETO>, QUE CONSISTE EN ACERTAR UN NUMERO ENTRE 1 Y 100
//(GENERADO ALEATORIAMENTE). PARA ELLO SE INTRODUCE POR TECLADO UNA SERIE DE NUMEROS, PARA
//LOS QUE SE INDICA: <MAYOR> O <MENOR>, SEGUN SEA MAYOR O MENOR SON RESPECTO AL NUMERO
//SECRETO. EL PROCESO TERMINA CUANDO EL USUARIO ACIERTA O CUANDO SE RINDE (INTRODUCIENDO
//UN -1).

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {

        int aleatorio = (int) (Math.random() * 100 + 1); //NUMERO ALEATORIO ENTRE 1 Y 100

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        int numero = sc.nextInt();

        int intentos = 1;

        while (numero != aleatorio && numero != -1){

            if (numero < aleatorio){
                System.out.println("El numero introducido es menor que el numero secreto");
            } else {
                System.out.println("El numero introducido es mayor que el numero secreto");
            }

            intentos ++;

            System.out.println("Introduce un numero: ");

            numero = sc.nextInt();

        }

        System.out.println("Usted ha acertado en " + intentos + " intentos");


    }

}
