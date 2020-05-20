package Singleton;

public class Singleton {

    private static String instancia;

    private Singleton(){}

    public static String getInstancia() {
        if (instancia ==null){
            instancia="inicial";
            return instancia;
        }
        return instancia;
    }

    public static void setInstancia(String text) {
        instancia = text;
    }
}
