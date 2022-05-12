package graficos;

import javax.swing.*;
import java.awt.*;

public class PruebaDibujo {

    public static void main(String[] args) {

        MarcoDibujo uno = new MarcoDibujo();

        uno.setVisible(true);

        uno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

class MarcoDibujo extends JFrame{

    public MarcoDibujo(){

        setTitle("Prueba de dibujo");

        setSize(400,400);

        Toolkit imagen = Toolkit.getDefaultToolkit();

        Image icono = imagen.getImage("/home/laura/Downloads/Branding on Behance.jpeg");

        setIconImage(icono);

        Figuras figura = new Figuras();

        add(figura);

    }

}

class Figuras extends JPanel{

    public  void paintComponent(Graphics g){

        super.paintComponent(g);

        g.draw3DRect(50,150,250,200, true);

        g.drawLine(90,100,50,50);

        g.drawArc(50,100,100,200,120,150);

    }

}