package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

    public static void main(String[] args) {

        Jefatura jefeRRHH=new Jefatura("Alvaro Camp",50000,1959,11,10);//INSTANCIA DE LA CLASE JEFATURA

        jefeRRHH.estableceIncentivo(300.00);

        /*Empleado empleado1 = new Empleado("Laura Gonzalez", 30000, 2000, 01,03);
        Empleado empleado2 = new Empleado("Luis Bar", 30000, 2003, 03,05);
        Empleado empleado3 = new Empleado("Mony Brito", 40000, 1987, 04, 9);

        empleado1.aumentaSueldo(5);
        empleado2.aumentaSueldo(6);
        empleado3.aumentaSueldo(10);

        System.out.println("Empleado 1: " + empleado1.dameNombre() + " " + empleado1.dameSueldo() + " " + empleado1.dameFecha());*/


        //CODIGO ALTERNATIVO USANDO ARRAYS

        Empleado2[] empleados = new Empleado2[6];

        empleados[0] = new Empleado2("Laura Gonzalez", 30000, 2000, 01,03);

        empleados[1] = new Empleado2("Luis Bar", 30000, 2003, 03,05);

        empleados[2] = new Empleado2("Mony Brito", 40000, 1987, 04, 9);

        empleados[3] = new Empleado2("Bubi Campuzano",43000,1986,9,1);

        empleados[4] = jefeRRHH; //POLIMORFISMO, PRINCIPIO DE SUSTITUCION

        empleados[5] = new Jefatura("Eli Glez",56000,1964,1,28); //SE PUEDE USAR UN OBJETO DE UNA SUBCLASE CUANDO SE ESPERE UN OBJETO DE LA SUPERCLASE

        //CASTING O REFUNDICION
        Jefatura jefeFinanzas=(Jefatura) empleados[5];

        jefeFinanzas.estableceIncentivo(400);

        Empleado2 directorComercial = new Jefatura("Maria", 85500, 2012, 4, 3);

        Comparable ejemplo = new Empleado("Juan", 45000, 2000, 12, 3 );

        if (directorComercial instanceof Empleado2){
            System.out.println("Es de tipo Jefatura");
        }

        if (ejemplo instanceof Comparable){
            System.out.println("Implementa la interfaz comparable");
        }

        //System.out.println(empleados[1].dameNombre());

        //USO DEL FOR NORMAL
        /*for (int i=0; i<3; i++){
            empleados[i].aumentaSueldo(5);
        }*/

        //USO DEL FOR-EACH
        for (Empleado2 e: empleados){
            e.aumentaSueldo(5);
        }

            Arrays.sort(empleados);



        //USO DEL FOR NORMAL
       /* for (int i=0; i<3;i++){
            System.out.println("Nombre: "+ empleados[i].dameNombre() + " "
                    + empleados[i].dameSueldo() + " "
                    + empleados[i].dameFecha());
        }*/

        //USO DEL FOR-EACH
        for (Empleado2 l: empleados){
            System.out.println("Nombre: " + l.dameNombre() + " "
            + l.dameSueldo() + " " + l.dameFecha());
        }


    }
}

class Empleado implements Comparable {

    public Empleado(String nombre, double sueld, int year, int mes, int day){

        name=nombre;
        sueldo=sueld;
        GregorianCalendar calendario = new GregorianCalendar(year,mes-1, day);
        altaContrato=calendario.getTime();
        ++IdSiguiente;
        Id=IdSiguiente;

    }

    //SOBRECARGA DE CONSTRUCTORES, MISMO NOMBRE PERO DISTINTO NUMERO DE PARAMETROS QUE SE LE PASAN
    public Empleado(String nombre){
        this(nombre,30000,2000,01,01);
    }

    //GETTER
    public String dameNombre(){
        return name + " Id: "+ Id;
    }

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

    @Override
    public int compareTo(Object o) {

        Empleado otroEmpleado = (Empleado) o;

        if (this.Id<otroEmpleado.Id){
            return -1;
        }

        if (this.Id > otroEmpleado.Id){
            return 1;
        }
        return 0;
    }

    private String name;

    private double sueldo;

    private Date altaContrato;

    private static int IdSiguiente;

    private int Id;


}

class Jefatura extends Empleado2 {

    public Jefatura(String nombre, double sueld, int year, int mes, int day) {
        super(nombre, sueld, year, mes, day);
    }

    //SETTER
    public void estableceIncentivo(double b){

        incentivo=b;
    }

    //GETTER
    public double dameSueldo(){//SOBREESCRIBE AL METODO DE LA CLASE PADRE

        double sueldoJefe=super.dameSueldo();
        return sueldoJefe + incentivo;
    }

    private double incentivo; //VARIABLE ENCAPSULADA

}

class Director extends Jefatura{


    public Director(String nombre, double sueld, int year, int mes, int day) {
        super(nombre, sueld, year, mes, day);
    }
}


