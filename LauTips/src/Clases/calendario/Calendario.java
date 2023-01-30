package Clases.calendario;

import java.util.Objects;

public class Calendario {

    int days;
    int months;
    int years;

    Calendario(int days, int months, int years){
        this.days = days;
        this.months = months;
        this.years = years;
    }

    public void  incrementarDias(){
        days += days;
    }
    public void incrementarMes(){
        months += months;
    }
    public void incrementarAnho(){
        years += years;
    }

    public String mostrar() {
        return "Calendario{" +
                "days=" + days +
                ", months=" + months +
                ", years=" + years +
                '}';
    }

    public boolean iguales(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calendario that)) return false;
        return days == that.days && months == that.months && years == that.years;
    }



}
