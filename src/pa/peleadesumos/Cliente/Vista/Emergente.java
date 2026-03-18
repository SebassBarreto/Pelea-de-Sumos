package pa.peleadesumos.Cliente.Vista;

import javax.swing.JOptionPane;

/**
 * Clase utilitaria encargada de mostrar ventanas emergentes al usuario
 * dentro de la interfaz grafica del cliente.
 * @author Asus
 */
public class Emergente {

    /**
     * Constructor de Emergente.
     */
    public Emergente() {
    }

    /**
     * Muestra un mensaje informativo al usuario.
     * @param mensaje texto que se desea mostrar
     */
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    /**
     * Muestra un mensaje de advertencia al usuario.
     * @param mensaje texto de advertencia que se mostrara
     */
    public void mostrarAdvertencia(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Muestra el resultado del combate al usuario.
     * @param resultado "GANASTE" o "PERDISTE"
     */
    public void mostrarResultado(String resultado) {
        JOptionPane.showMessageDialog(null, resultado, "Resultado del combate", JOptionPane.INFORMATION_MESSAGE);
    }
}