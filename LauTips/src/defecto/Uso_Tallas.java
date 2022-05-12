package defecto;

import java.util.Scanner;

public class Uso_Tallas {

    //TIPO ENUMERADO SIN CONSTRUCTOR
   // enum Talla {Mini, Mediano, Grande, Muy_Grande};//instancia perteneciente a la clase enum

    //TIPO ENUMERADO CON CONSTRUCTOR
    enum Talla{

        MINI("s"), MEDIANA("m"), GRANDE("l"), MUY_GRANDE("xl");

        Talla(String abreviatura){//EL CONSTRUCTOR TRABAJA COMO UN SETTER
            this.abreviatura = abreviatura;
        }

        //GETTER
        public String dameAbreviatura(){
            return abreviatura;
        }


        private String abreviatura;//VARIABLE ENCAPSULADA DE TIPO STRING

    }


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba una talla: MINI, MEDIANO, GRANDE o MUY_GRANDE");

        String entradaDatos = entrada.next().toUpperCase();

        Talla miTalla = Enum.valueOf(Talla.class, entradaDatos);

        System.out.println("Talla= "+ miTalla);

        System.out.println("Abreviatura= "+miTalla.dameAbreviatura());


       /* Talla s = Talla.Mini;

        Talla m = Talla.Mediano;

        Talla l = Talla.Grande;

        Talla xl = Talla.Muy_Grande;*/




    }
}
