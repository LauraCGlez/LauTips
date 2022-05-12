package poo;

public class PruebasStatic {

    public static void main(String[] args) {

        EmpleadosId t1 = new EmpleadosId("Juan");
        EmpleadosId t2 = new EmpleadosId("Pedro");
        EmpleadosId t3 = new EmpleadosId("Maria");
        EmpleadosId t4 = new EmpleadosId("Ana");

        t1.cambiaSeccion("RRHH");//METODO NO ESTATICO, ACCESO DIRECTO

        System.out.println(t1.devuelveDatos());
        System.out.println(t2.devuelveDatos());
        System.out.println(t3.devuelveDatos());
        System.out.println(t4.devuelveDatos());
        System.out.println(EmpleadosId.dameIdS());
    }
}


class EmpleadosId {
        public EmpleadosId(String nom) {
            nombre = nom;
            seccion = "Administracion";
            Id = IdSiguiente;
            IdSiguiente++;
        }

        //SETTER
        public void cambiaSeccion(String seccion) {
            this.seccion = seccion;
        }

        //GETTER
        public String devuelveDatos() {
            return "El nombre es: " + nombre + " la seccion es " + seccion + " y el Id=" + Id;
        }


        //METODO STATICO ACCESO DESDE LA CLASE, NUNCA ACTUA SOBRE CAMPOS DE CLASE A MENOS QUE SEA TAMBIEN ESTATICA
        public static String dameIdS(){
            return "El id siguiente es: " + IdSiguiente;
        }


        private final String nombre;
        private String seccion;
        private int Id;
        private static int IdSiguiente=1;

}



