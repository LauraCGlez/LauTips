package Clases.bombilla;
public class Bombilla {
    private boolean status;
    public static boolean interruptor;

    public Bombilla(){
        interruptor = false;
    }

    public void apagada(){
        status = false;
    }

    public void encendida(){
        status = true;
    }

    public boolean estado(){
        return status && interruptor;
    }

    public String getEstado(){
        String resultado;
        if (estado()){
            resultado = "encendida";
        } else {
            resultado = "apagada";
        }
        return resultado;
    }




}
