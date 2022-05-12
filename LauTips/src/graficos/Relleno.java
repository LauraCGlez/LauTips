package graficos;

import javax.swing.*;
import java.awt.*;

public class Relleno {

    public static void main(String[] args) {

        RellenoVentana uno = new RellenoVentana();

        uno.setTitle("Ventana con texto");

        uno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class RellenoVentana extends JFrame{

    public RellenoVentana(){

        setVisible(true);

        setSize(400, 250);

        setLocation(500, 300);

        MisImagenes lamina = new MisImagenes();

        add(lamina);

        Toolkit imagen = Toolkit.getDefaultToolkit();

        Image icono = imagen.getImage("/home/laura/Downloads/Branding on Behance.jpeg");

        setIconImage(icono);

    }

}

class MisImagenes extends JPanel{

    public void paintComponent(Graphics g){

        //LLAMA AL METODO DE LA CLASE PADRE
        super.paintComponent(g);

        //DIBUJA UN TEXTO
        g.drawString("Ejemplo swing", 100, 100);

    }

}