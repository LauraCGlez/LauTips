package Clases.autoescuela;

// Una Ficha de Autoescuela tiene un profesor, un alumno y un coche de prácticas.
// Cada profesor tiene un nombre, un DNI y un sueldo.
// Cada alumno tiene un nombre, un DNI y el tipo de carnet que quiere obtener.
// Cada coche tiene una matrícula, una marca y un modelo.
//Crea la clase Ficha, Profesor, Alumno y Coche.
//
//Crea en un Test una Ficha y prueba a mostrar el DNI del alumno y la matrícula del coche.

public class Ficha {
    
    Profesor p;

    Alumno a;

    Coche c;
    
    Ficha (Profesor p, Alumno a, Coche c){
        this.p = p;
        this.a = a;
        this.c = c;
    }
    
    

}
