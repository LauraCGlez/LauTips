package GorditoUwU.Recursividad;

//Crea un método que obtenga la suma de los números naturales desde 1
//hasta N. Se debe pasar como parámetro el número N

public class ejercicio4 {

    static int suma(int n){


        int resultado = 0;


            if(n == 1){
                resultado = 1;
            }else {
                resultado = n + suma(n - 1);
            }

        return suma(n);
        
    }

    public static void main(String[] args) {

        System.out.println(suma(4));


    }




}
