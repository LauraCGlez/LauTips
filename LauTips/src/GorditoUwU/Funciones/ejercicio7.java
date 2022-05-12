package GorditoUwU.Funciones;

//Diseñar una función a la que se le pase un número entero y devuelva el
//número de divisores primos que tiene.

public class ejercicio7 {

    static boolean esPrimo(int n){

        boolean primo = true;

        int i = 2;

        if (n < 2){

            primo = false;
        }

        while (i <= (int) Math.sqrt(n) && primo == true) {

            if (n % i == 0) {
                primo = false;
            }
            i++;
        }
        return (primo);
    }


    static int divisores(int num){

        int cont = 0; //CONTADOR DE DIVISORES

        for (int i = 2; i <= num; i++){

            if (esPrimo(i) && num % i == 0){
                cont ++;
            }

        }

        return (cont);
    }


    public static void main(String[] args) {

        System.out.println("Divisores primos de 24: " + divisores(24));

    }

}
