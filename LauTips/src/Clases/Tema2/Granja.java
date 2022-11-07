package Clases.Tema2;

import java.util.Scanner;

public class Granja {

    //En una granja se compra diariamente una cantidad(comidaDiaria) de comida para
    //los animales. El numero de animales que alimentar(todos de la misma especie)
    //es numAnimales, y sabemos que cada animal come una media de kilosPorAnimal.
    //Diseña un programa que solicite al usuario los valores anteriores y determine
    //si disponemos de alimento suficiente para cada animal. En caso negativo a de
    //calcular cual es la racion que corresponde a cada uno de los animales.
    //Evitar que la aplicacion realice divisiones por cero.

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Cantidad de raciones: ");

        double comidaDiaria = sn.nextInt();

        System.out.println("Cantidad de animales: ");

        double numAnimales = sn.nextInt();

        if (numAnimales == 0){
            System.out.println("No tenemos animales para alimentar");
        } else if (comidaDiaria >= numAnimales){
            double resto = comidaDiaria%(numAnimales);
            System.out.println("Alcanza para todos los animales y sobra " +resto);
        } else {
            double kilosPorAnimal = comidaDiaria / numAnimales;
            System.out.println("A cada animal le corresponde: " + kilosPorAnimal + " raciones");
        }
    }
}