package Clases.autoescuela;

//Crea en un Test una Ficha y prueba a mostrar el DNI del alumno y la matrícula del coche.
public class TestFicha {

    public static void main(String[] args) {

        Ficha f = new Ficha(new Profesor("vasco", "13243546K", 1234.09),new Alumno("Lisa", "87654321K"), new Coche("123456L", "Renault", "Twingo"));

        System.out.println(f.a.dni);
        System.out.println(f.c.matricula);

    }
}
