package GorditoUwU.Condicionales;

//UN CENTRO DE INVESTIGACION DE LA FLORA URBANA NECESITA UNA APLICACION QUE MUESTRE CUAL ES
//EL ARBOL MAS ALTO. PARA ELLO SE INTRODUCIRA POR TECLADO LA ALTURA (EN CM) DE CADA ARBOL
//(TERMINANDO LA INTRODUCCION DE DATOS CUANDO SE UTILICE -1 COMO ALTURA). LOS ARBOLES SE
//IDENTIFICAN MEDIANTE ETIQUETAS CON NUMEROS UNICOS CORRELATIVOS, COMENZANDO EN 0. DISEÑAR
//UNA APLICACION QUE RESUELVA EL PROBLEMA PLANTEADO

import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura del arbol (1): ");

        int altura = sc.nextInt();

        int arbolMasAlto;

        int etiquetaMasAlto;

        int etiqueta = 1;

        arbolMasAlto = altura;

        etiquetaMasAlto = 0;

        while (altura != -1){

            if (altura > arbolMasAlto){
                arbolMasAlto = altura;
                etiquetaMasAlto = etiqueta;
            }

            etiqueta ++;

            System.out.println("Altura del arbol (" + etiqueta + "): ");

            altura = sc.nextInt();

        }

    }

}
