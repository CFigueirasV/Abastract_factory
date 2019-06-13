
package abstract_factory;

import javax.swing.JOptionPane;


public class WinDialogo extends Dialogo {

    @Override
    public void mostrar(String mensage) {
        JOptionPane.showMessageDialog(null,mensage);
    }
}