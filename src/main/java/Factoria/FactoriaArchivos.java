package Factoria;

public class FactoriaArchivos {

    public static Archivo getReproductor(String path) {

        Archivo a;

        if (path.endsWith(".au")) {
            return new Cancion();
        } else if (path.endsWith(".jpg")) {
            return new Imagen();
        }

        return null;
    }

}



