package Clases.Videoclub.l_Alquiler;

public class Reporte {
    Alquiler_pelicula alquiler_pelicula;

    Reporte reporte = new Reporte();

    public void realizarReporte(){
        Reporte reporte = new Reporte();
    }

    public String imprimir() {
        return "Reporte{" +
                "alquiler_pelicula=" + alquiler_pelicula +
                ", reporte=" + reporte +
                '}';
    }
}
