package Estrategia;

public class MainEstrategia {

    public static void main(String[] args) {

        Archivo archivo = null;
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        double n = Math.random() * 10;
        int randomInteger = (int) (Math.random() * n) + 1;
        double m = randomInteger % 2;

        if (m == 0) {
            archivo = new Imagen();
        } else {
            archivo = new Cancion();
        }
        archivo.abrirArchivo();
    }

}
