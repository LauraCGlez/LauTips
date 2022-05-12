package GorditoUwU.Funciones;

//Diseñar la función calculadora( ), a la que se le pasan dos números reales (operandos) y
//qué operación se desea realizar con ellos. Las operaciones disponibles son: sumar, restar,
//multiplicar o dividir. Estas se especifican mediante un número: 1 para la suma, 2 para la
//resta, 3 para la multiplicación y 4 para la división. La función devolverá el resultado de la
//operación mediante un número real.

import java.util.Scanner;

public class ejercicio8 {

    static float calculadora(float a, float b, int operacion){

        float operacionResult = 0;

        switch (operacion){

            case 1 : operacionResult = a + b;
            break;

            case 2 : operacionResult = a - b;
            break;

            case 3 : operacionResult = a * b;
            break;

            case 4 : operacionResult = a / b;
            break;
        }

        return operacionResult;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos numeros reales: ");

        float num1 = sc.nextFloat();

        float num2 = sc.nextFloat();

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Que operacion desea realizar: suma(1), resta(29, multiplicacion(3) o division(4): ");

        int op = sc1.nextInt();

        calculadora(num1,num2,op);

        System.out.println(calculadora(num1,num2,op));

    }

}
