package Estrategia;

import com.sun.media.sound.WaveFileReader;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.sound.sampled.*;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.swing.*;
import java.io.*;
import java.net.URI;

public class Cancion implements Archivo {

    /**
     *  Esto es un comentario con Javadoc
     */


    private String rutaCancion = "src/main/resources/cancion.au";

    @Override
    public void abrirArchivo() {

        try{

            File musicPath = new File(rutaCancion);

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


















