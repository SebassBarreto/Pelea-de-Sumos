package pa.peleadesumos.Cliente.Vista;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import pa.peleadesumos.Cliente.Control.CControlVista;

/**
 * Ventana principal del cliente.
 * Contiene el panel de fondo, el formulario y el panel de tecnicas.
 * @author Asus
 */
public class CVentana extends JFrame {

    /** Panel de fondo */
    private PanelFondo panelFondo;

    /** Panel del formulario */
    private PanelFormulario panelFormulario;

    /** Panel de tecnicas */
    private PanelTecnicas panelTecnicas;

    /** Layout para alternar entre formulario y tecnicas */
    private CardLayout cardLayout;

    /** Panel contenedor con CardLayout */
    private JPanel panelContenedor;

    /** Constantes para el CardLayout */
    private static final String FORMULARIO = "FORMULARIO";
    private static final String TECNICAS = "TECNICAS";

    /**
     * Constructor de CVentana.
     * @param controlVista control de vista del cliente
     * @param panelFormulario panel del formulario creado en CControlVista
     * @param panelTecnicas panel de tecnicas creado en CControlVista
     */
    public CVentana(CControlVista controlVista, PanelFormulario panelFormulario, PanelTecnicas panelTecnicas) {
        this.panelFormulario = panelFormulario;
        this.panelTecnicas = panelTecnicas;
        initComponentes();
    }

    /**
     * Inicializa y organiza los componentes de la ventana.
     */
    private void initComponentes() {
        setTitle("PeleaDeSumos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(null);

        panelFondo = new PanelFondo();
        panelFondo.setBounds(0, 0, 800, 600);

        cardLayout = new CardLayout();
        panelContenedor = new JPanel(cardLayout);
        panelContenedor.setOpaque(false);
        panelContenedor.setBounds(250, 50, 500, 500);

        panelContenedor.add(panelFormulario, FORMULARIO);
        panelContenedor.add(panelTecnicas, TECNICAS);

        panelFondo.add(panelContenedor);
        add(panelFondo);

        cardLayout.show(panelContenedor, FORMULARIO);
    }

    /**
     * Muestra el panel de tecnicas.
     */
    public void mostrarPanelTecnicas() {
        cardLayout.show(panelContenedor, TECNICAS);
    }

    /**
     * Muestra el panel de formulario.
     */
    public void ocultarPanelTecnicas() {
        cardLayout.show(panelContenedor, FORMULARIO);
    }

    /**
     * Carga las tecnicas en el panel de tecnicas y lo muestra.
     * @param tecnicas arreglo de tecnicas del properties
     */
    public void cargarTecnicas(String[] tecnicas) {
        panelTecnicas.cargarTecnicas(tecnicas);
        mostrarPanelTecnicas();
    }
}