package Factoria;

import javax.swing.*;
import java.awt.*;

public class Imagen extends JFrame implements Archivo {



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
    public void abrirArchivo(String path) {

        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon(path)));
        setLayout(new FlowLayout());
        l1 = new JLabel("Sorpresa");
        add(l1);
        setSize(580, 452);
        setSize(600, 600);
    }

}


