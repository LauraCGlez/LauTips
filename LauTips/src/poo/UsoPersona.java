package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {
    public static void main(String[] args) {

        Persona[] lasPersonas = new Persona[2];

        lasPersonas[0] = new Empleado2("Luis", 50000, 2009, 2, 25);
        lasPersonas[1] = new Alumno("Laura", "Informatica");

        for (Persona p: lasPersonas){
            System.out.println(p.dameNombre()+ ", "+ p.dameDescripcion());
        }
    }
}

abstract class Persona{

    public Persona(String nom){
        nombre = nom;
    }

    public String dameNombre(){
        return nombre;
    }

    public abstract String dameDescripcion();

    private String nombre;

}


class Empleado2 extends Persona{

    public Empleado2(String nombre, double sueld, int year, int mes, int day){


        super(nombre);

        sueldo=sueld;
        GregorianCalendar calendario = new GregorianCalendar(year,mes-1, day);
        altaContrato=calendario.getTime();
        ++IdSiguiente;
        Id=IdSiguiente;

    }

    public String dameDescripcion(){
        return "Este empleado tiene un Id= "+Id+ " con un sueldo= " +
                sueldo;
    }

    //SOBRECARGA DE CONSTRUCTORES, MISMO NOMBRE PERO DISTINTO NUMERO DE PARAMETROS QUE SE LE PASAN
    /*public Empleado2(String nombre){
        this(nombre,30000,2000,01,01);
    }*/

    //GETTER
    /*public String dameNombre(){
        return name + " Id "+ Id;
    }*/

    //GETTER
    public double dameSueldo(){
        return sueldo;
    }

    //GETTER --> Devuelve siempre un valor (Return)
    public Date dameFecha(){
        return altaContrato;
    }

    //SETTER --> modificar valores, no devuelve ningun valor
    public void aumentaSueldo(double porcentaje){
        double aumento= sueldo*porcentaje/100;
        sueldo+=aumento;
    }

    //private String nombre;

    private double sueldo;

    private Date altaContrato;

    private static int IdSiguiente;

    private int Id;

}

class Alumno extends Persona{

    public Alumno(String nom, String car){
        super(nom);

        carrera = car;
    }

    public String dameDescripcion(){
        return "Este alumno esta estudiando "+ carrera;
    }

    private String carrera;
}