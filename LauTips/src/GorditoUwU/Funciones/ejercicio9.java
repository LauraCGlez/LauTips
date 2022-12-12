package GorditoUwU.Funciones;

//Buscador de numeros primos infinitos

    public class ejercicio9 {

        public static void main(String[] args) {


            for (int i = 1; i > 0; i++){
                System.out.println(i + " primo");
            }
        }
        static boolean esPrimo(int n){
            boolean primo = true;
            int i = 2;
            if (n < 1){
                primo = false;
            }
            while (i <= (int) Math.sqrt(n) && primo) {
                if (n % i == 0) {
                    primo = false;
                }
                i++;
            }
            return (primo);
        }
    }



