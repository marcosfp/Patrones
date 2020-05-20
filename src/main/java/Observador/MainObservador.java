package Observador;

public class MainObservador {
    public static void main(String[] args) {
        Subject bradPitt= new Subject();

        ObservadorConcreto fanboy = new ObservadorConcreto(bradPitt);
        ObservadorConcreto fangirl = new ObservadorConcreto(bradPitt);

        bradPitt.agregar(fanboy);
        bradPitt.agregar(fangirl);


        bradPitt.setEstado("Ha empezado un video en directo");
    }


}
