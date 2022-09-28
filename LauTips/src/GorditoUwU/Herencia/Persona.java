package GorditoUwU.Herencia;

class Persona {

        String nombre;
        int edad;
        double estatura;

        Persona(String nombre, int edad, double estatura){
                this.nombre = nombre;
                this.edad = edad;
                this.estatura = estatura;
        }

        void mostrarDatos(){

                System.out.println(nombre);

                System.out.println(edad);

                System.out.println(estatura);

        }

}

class Empleado extends Persona{

        double salario;

        void mostrarDatos(){

                super.mostrarDatos();

                System.out.println(salario);

        }

        Empleado(String nombre, int edad, double estatura, double salario){

                super(nombre, edad, estatura); //CONSTRUCTOR DE PERSONA

                this.salario = salario; //ATRIBUTO PROPIO DE EMPLEADO

        }

        public static void main(String[] args) {

                Empleado e = new Empleado("Alvaro", 61, 1.75, 2.300);

                System.out.println(e.nombre);

        }

}


