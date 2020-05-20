package Factoria;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;

public class Cancion implements Archivo {



    @Override
    public void abrirArchivo(String path) {

        try{

            File musicPath = new File(path);

            if(musicPath.exists()){

                AudioInputStream audioInpit= AudioSystem.getAudioInputStream(musicPath);
                Clip clip= AudioSystem.getClip();
                clip.open(audioInpit);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);

                JOptionPane.showMessageDialog(null,"Enciende los altavoce");
                long cliptimePosition = clip.getMicrosecondPosition();

                JOptionPane.showMessageDialog(null,"Pulsa ok para reactivar");
                clip.setMicrosecondPosition(cliptimePosition);
                clip.start();

                JOptionPane.showMessageDialog(null,"Pulsa ok para para el archivo");

            }else{
                System.out.println("El archivo no existe");
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}


















