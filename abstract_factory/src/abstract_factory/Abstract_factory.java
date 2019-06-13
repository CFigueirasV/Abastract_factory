package abstract_factory;


public class Abstract_factory {


    public static void main(String[] args) {
        Dialogo miDialogo;
        miDialogo = Dialogo.crearDialogo(Dialogo.Tipo.CONSOLA);
        miDialogo.mostrar("CONSOLA");
        Dialogo otroDialogo = Dialogo.crearDialogo(Dialogo.Tipo.VENTANA);
        otroDialogo.mostrar("VENTANA");
    }
    
}