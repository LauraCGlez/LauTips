package graficos;

import javax.swing.*;
import java.awt.*;

public class MyFrame {

    public static void main(String[] args) {

        Marco uno = new Marco();

        uno.setVisible(true);

        uno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class Marco extends JFrame{

    //CONSTRUCTOR
    public Marco(){

        //ESTABLECER TAMAÑO, MIRAR CLASE TOOLKIT
        //setSize(500, 300);

        //ESTABLECER LOCALIZACION
        //setLocation(500, 300);

        //ESTABLECE ANCHO,LARGO Y COORDENADAS EN X E Y, COMBINA setSize y setLocation
        setBounds(500, 300, 550, 400);

        //NO SE VA A PODER REDIMENCIONAR SI ES FALSE
        //setResizable(false);

        //MARCO SE ABRE A PANTALLA COMPLETA, CAMPO DE CLASE ESTATICO, HAY QUE UTILIZAR EL NOMBRE DE LA CLASE(FRAME)
        //setExtendedState(Frame.MAXIMIZED_BOTH);

        //ESTABLECE TITULO DE LA VENTANA
        setTitle("Mi primera ventana");

        //ESTABLECER IMAGEN DEL ICONO
        //setIconImage();




    }

}
