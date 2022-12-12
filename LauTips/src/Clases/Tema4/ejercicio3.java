package Clases.Tema4;

//Realizar una función que calcule y muestre el área o el volumen de un
//cilindro, según se especifique. Para distinguir un caso de otro se le pasará
//como opción un número:
//● 1 para el área
//● 2 para el volumen
//Además hay que pasarle a la función el radio de la base y la altura.
//
//area = 2PI * radio * (altura + radio)
//volumen = PI * radio2
//
//* altura

import javax.swing.*;
public class ejercicio3 {
    public static void main(String[] args) {

        String o = JOptionPane.showInputDialog("Introduce la opcion: '1' para area, '2' para volumen");

        int opc = Integer.parseInt(o);

        String radio = JOptionPane.showInputDialog("Introduce el valor del radio: ");

        int r = Integer.parseInt(radio);

        String altura = JOptionPane.showInputDialog("Introduce el valor de la altura: ");

        int a = Integer.parseInt(altura);

        funcion(opc, a, r);

    }

    static void funcion(int op, int alt, int rad){
        if (op == 1){

            double area = 2 * Math.PI * rad * (alt + rad);

            System.out.println("El area es: " + area);

        } else {

            double volumen = Math.PI * Math.pow(rad,2) * alt;

            System.out.println("El volumen es: " + volumen);

        }
    }
}
