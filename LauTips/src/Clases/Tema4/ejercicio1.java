package Clases.Tema4;
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int numero = sn.nextInt();
        eco(numero);
    }
    static void eco (int numero){
        for (int i = 0; i < numero; i++){
            System.out.println("<<Eco...>>");
        }
    }
}
