package pa.peleadesumos.Cliente.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import pa.peleadesumos.Cliente.Control.CControlVista;

/**
 * Panel que muestra las 82 tecnicas kimarite con checkboxes
 * para que el luchador seleccione en cuales es experto.
 * @author Asus
 */
public class PanelTecnicas extends JPanel {

    /** Panel interno con los checkboxes */
    private JPanel panelCheckboxes;

    /** Scroll para los checkboxes */
    private JScrollPane scroll;

    /** Arreglo de checkboxes */
    private JCheckBox[] checkboxes;

    /** Boton confirmar seleccion */
    private JButton btnConfirmar;

    /**
     * Constructor de PanelTecnicas.
     * @param controlVista control de vista del cliente
     */
    public PanelTecnicas(CControlVista controlVista) {
        setOpaque(false);
        setLayout(new BorderLayout());
        initComponentes(controlVista);
    }

    /**
     * Inicializa y organiza los componentes graficos del panel.
     * @param controlVista control de vista para registrar los listeners
     */
    private void initComponentes(CControlVista controlVista) {
        panelCheckboxes = new JPanel();
        panelCheckboxes.setOpaque(false);

        scroll = new JScrollPane(panelCheckboxes);
        scroll.setOpaque(false);
        scroll.getViewport().setOpaque(false);
        add(scroll, BorderLayout.CENTER);

        btnConfirmar = new JButton("Confirmar selección");
        btnConfirmar.setBackground(new Color(255, 220, 100));
        btnConfirmar.setFont(new Font("Arial", Font.BOLD, 14));
        btnConfirmar.addActionListener(controlVista);
        btnConfirmar.setActionCommand("ConfirmarTecnicas");
        add(btnConfirmar, BorderLayout.SOUTH);
    }

    /**
     * Carga los checkboxes con las tecnicas recibidas.
     * @param tecnicas arreglo de tecnicas del properties
     */
    public void cargarTecnicas(String[] tecnicas) {
        panelCheckboxes.removeAll();
        panelCheckboxes.setLayout(new GridLayout(tecnicas.length, 1));
        checkboxes = new JCheckBox[tecnicas.length];
        for (int i = 0; i < tecnicas.length; i++) {
            checkboxes[i] = new JCheckBox(tecnicas[i]);
            checkboxes[i].setOpaque(false);
            checkboxes[i].setForeground(Color.WHITE);
            checkboxes[i].setFont(new Font("Arial", Font.PLAIN, 13));
            panelCheckboxes.add(checkboxes[i]);
        }
        panelCheckboxes.revalidate();
        panelCheckboxes.repaint();
    }

    /**
     * Retorna las tecnicas seleccionadas por el luchador.
     * @return arreglo con las tecnicas marcadas
     */
    public String[] getTecnicasSeleccionadas() {
        ArrayList<String> seleccionadas = new ArrayList<>();
        if (checkboxes != null) {
            for (JCheckBox cb : checkboxes) {
                if (cb.isSelected()) {
                    seleccionadas.add(cb.getText());
                }
            }
        }
        return seleccionadas.toArray(new String[0]);
    }
}