
package abstract_factory;

public abstract class Dialogo implements metodos_comunes{
   
    enum Tipo{CONSOLA,VENTANA}
    
     public static Dialogo crearDialogo(Tipo tipo){
        Dialogo dialogoCreado;
        switch (tipo){
            case CONSOLA:
                dialogoCreado=new ConsDialogo();
                return dialogoCreado;
            case VENTANA:
                dialogoCreado= new WinDialogo();
                return dialogoCreado;
            default:
                dialogoCreado=null;
                
        }
        return dialogoCreado;
    }
}