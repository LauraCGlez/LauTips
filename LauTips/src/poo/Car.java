package poo;


public class Car {

    private int ruedas;

    private int largo;

    private int ancho;

    private int motor;

    private int pesoPlataforma;

    private String color;

    private int pesoTotal;

    private boolean asientosCuero;

    private boolean climatizador;


    //CONSTRUCTOR
    public Car(){

        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        pesoPlataforma =500;


    }

    //GETTERS
    public int getRuedas(){
        return ruedas;
    }

    public int getLargo(){
        return largo;
    }

    public String DameDatosGenerales(){
        return "La plataforma del vehiculo tiene "+ ruedas + " ruedas" + ". Mide " + largo/1000 + " metros con un ancho de " +
                ancho + " cm y un peso plataforma de " + pesoPlataforma + " kg";
    }


    //SETTER
    public void estableceColor(String colorCoche){
        color = colorCoche;
    }

    //GETTER
    public String dimeColor() {
        return "El color del coche es " + color;
    }

    //SETTER
    public void cofigAsiento(String asientosCuero){

        if (asientosCuero.equalsIgnoreCase("si")){
            this.asientosCuero=true; //this para variable de clase
        }else {
            this.asientosCuero=false;
        }

    }

    //GETTER
    public String dimeAsientos(){
        if (asientosCuero==true){
            return "El coche tiene asientos de cuero";
        }else {
            return "El coche tiene asientos de serie";
        }
    }

    //SETTER
    public void confiClimatizador(String climatizador){
        if (climatizador.equalsIgnoreCase("si")){
            this.climatizador=true;
        }else {
            this.climatizador=false;
        }
    }

    //GETTER
    public String dimeClimatizador(){
        if(climatizador==true){
            return "El coche tiene climatizador";
        } else {
            return "EL coche no tine climatizador";
        }
    }

    //SETTER + GETTER a la vez, porque establece y obtiene datos
    public String dimePesoCoche(){

        int pesoCarroceria=500;

        pesoTotal=pesoPlataforma+pesoCarroceria;

        if (asientosCuero==true){
            pesoTotal=pesoTotal+50;
        }

        if (climatizador==true){
            pesoTotal=pesoTotal+20;
        }

        return "El peso del coche es "+ pesoTotal;

    }

    //GETTER
    public int precioCoche(){

        int precioFinal=10000;

        if (asientosCuero==true){
            precioFinal+=2000;
        }

        if (climatizador==true){
            precioFinal+=1500;
        }
        return precioFinal;

    }

}
