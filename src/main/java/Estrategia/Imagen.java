package Estrategia;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;

public class Imagen extends JFrame implements Archivo {


    //TODO presiona Control + F12 ¿qué ves?
    //TODO si te parece eintresante prueba a pulsat Alt + 7

    JButton b1;
    JLabel l1;

    public Imagen() {
        setTitle("Background Color for JFrame");
        setSize(800, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void abrirArchivo() {

        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("src/main/resources/image2.jpg")));
        setLayout(new FlowLayout());
        l1 = new JLabel("Sorpresa");
        add(l1);
        setSize(580, 452);
        setSize(600, 600);
    }

}


