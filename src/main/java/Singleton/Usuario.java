package Singleton;

public class Usuario {

    private  final Cuenta standard= new Cuenta ("Standard","r-x");
    private  final Cuenta admin= new Cuenta ("Admin","rwx");

    Cuenta cuenta;

    private Usuario (){} //Constructor

    public Cuenta getCuenta() {

        if( cuenta==null) {
            cuenta = standard;
            return cuenta;
        }
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}
