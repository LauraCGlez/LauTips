package graficos;

import javax.swing.*;
import java.awt.*;

public class MarcoCentrado {

    public static void main(String[] args) {

        MarcoCentradoClase uno = new MarcoCentradoClase();

        uno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        uno.setVisible(true);


    }
}

class MarcoCentradoClase extends JFrame {

    public MarcoCentradoClase(){

        Toolkit miPantalla = Toolkit.getDefaultToolkit();

        Dimension tamañoPantalla = miPantalla.getScreenSize();

        int altura = tamañoPantalla.height;

        int ancho = tamañoPantalla.width;

        setSize(ancho/2, altura/2);

        setLocation(altura/4, ancho);

        setTitle("Marco Centrado");

        Image miIcono = miPantalla.getImage("/home/laura/Downloads/Branding on Behance.jpeg");

        setIconImage(miIcono);

    }

}