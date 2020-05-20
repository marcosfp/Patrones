package Factoria;

public class MainFactoria {

    public static void main(String[] args) {

        String path = "src/main/resources/cancion.au";

        Archivo archivo = FactoriaArchivos.getReproductor(path);

        archivo.abrirArchivo(path);
    }

}
