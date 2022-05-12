package GorditoUwU.Funciones;

//Realizar una función que calcule y muestre el área o el volumen de un
//cilindro, según se especifique. Para distinguir un caso de otro se le pasará
//como opción un número:
//● 1 para el área
//● 2 para el volumen
//Además hay que pasarle a la función el radio de la base y la altura.
//area = 2PI * radio * (altura + radio)
//volumen = PI * radio2 * altura

import javax.swing.*;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class ejercicio3 {

    public static void main(String[] args) {

        String opcion = JOptionPane.showInputDialog("Elige una opcion '1 = area' o '2 = volumen'");

        int numero = Integer.parseInt(opcion);

        String rad = JOptionPane.showInputDialog("Ingrese el radio: ");

        int r = Integer.parseInt(rad);

        String al = JOptionPane.showInputDialog("Ingrese la altura: ");

        int a = Integer.parseInt(al);

        calculo(numero, r, a);

    }

    static void calculo(int a, int radio, int altura){

        if (a == 1){

            double area = 2 * PI * radio * (altura + radio);

            System.out.println("EL area es " + area);

        } else {

            double volumen = PI * pow(radio,2) * altura;

            System.out.println("El volumen es " + volumen);

        }

    }

}
