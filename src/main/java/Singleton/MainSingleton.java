package Singleton;

public class MainSingleton {

    public static void main(String[] args) {


        String texto = Singleton.getInstancia().toString();

        System.out.println(texto);


        Singleton.setInstancia("final");

        System.out.println(Singleton.getInstancia().toString());

    }

}
