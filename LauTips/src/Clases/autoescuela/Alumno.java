package Clases.autoescuela;

// Cada alumno tiene un nombre, un DNI y el tipo de carnet que quiere obtener.
public class Alumno {

    String nombre;
    String dni;
    enum tipoCarnet {A, A2, B1, B2}

    Alumno(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

}
