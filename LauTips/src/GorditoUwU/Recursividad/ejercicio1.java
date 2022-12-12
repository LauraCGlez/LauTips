package GorditoUwU.Recursividad;

//FACTORIAL RECURSIVAMENTE

public class ejercicio1 {
    static long factorial(int n){

        long result;

        if (n == 0){
            result = 1; //CASO BASE
        } else {
            result = n * factorial(n - 1); //LLAMADA A LA FUNCION RECURSIVA
        }
        return (result);

    }
    public static void main(String[] args) {

        long solucion = factorial(5);

        System.out.println(solucion);
    }
}
