package Observador;

public class ObservadorConcreto extends Observador{

    Subject sujeto;


    public ObservadorConcreto(Subject sujeto) {
        this.sujeto = sujeto;
    }

    @Override
    public void actualizar() {
        System.out.println(sujeto.getClass().getName()+"  "+ sujeto.getEstado());
    }
}
