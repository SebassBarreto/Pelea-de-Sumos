package pa.peleadesumos.Cliente.Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pa.peleadesumos.Cliente.Vista.CVentana;
import pa.peleadesumos.Cliente.Vista.Emergente;
import pa.peleadesumos.Cliente.Vista.PanelFormulario;
import pa.peleadesumos.Cliente.Vista.PanelTecnicas;
import pa.peleadesumos.Cliente.Vista.SeleccionarArchivo;

/**
 * Controlador de vista del cliente. Gestiona los eventos de la interfaz grafica
 * y delega las operaciones al control principal.
 *
 * @author Asus
 */
public class CControlVista implements ActionListener {

    /**
     * Control principal del cliente
     */
    private CControlPrincipal controlPrincipal;

    /**
     * Ventana principal del cliente
     */
    private CVentana ventana;

    /**
     * Panel del formulario
     */
    private PanelFormulario panelFormulario;

    /**
     * Panel de tecnicas
     */
    private PanelTecnicas panelTecnicas;

    /**
     * Selector de archivos
     */
    private SeleccionarArchivo seleccionarArchivo;

    /**
     * Ventanas emergentes
     */
    private Emergente emergente;

    /**
     * Constructor de CControlVista.
     *
     * @param controlPrincipal control principal del cliente
     */
    public CControlVista(CControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
        this.seleccionarArchivo = new SeleccionarArchivo();
        this.emergente = new Emergente();
        this.panelFormulario = new PanelFormulario(this);
        this.panelTecnicas = new PanelTecnicas(this);
        this.ventana = new CVentana(this, panelFormulario, panelTecnicas);
    }

    /**
     * Gestiona los eventos generados por los componentes de la interfaz
     * grafica.
     *
     * @param e evento generado por un componente de la interfaz
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("CargarTecnicas")) {
            String ruta = seleccionarArchivo.seleccionarProperties(
                    "Seleccione el archivo de tecnicas kimarite");
            if (ruta != null) {
                controlPrincipal.cargarTecnicas(ruta);
            }

        } else if (e.getActionCommand().equalsIgnoreCase("ConfirmarTecnicas")) {
            String[] tecnicas = panelTecnicas.getTecnicasSeleccionadas();
            if (tecnicas.length == 0) {
                emergente.mostrarAdvertencia("Debe seleccionar al menos una tecnica.");
            } else {
                controlPrincipal.confirmarTecnicas(tecnicas);
                ventana.ocultarPanelTecnicas();
            }

        } else if (e.getActionCommand().equalsIgnoreCase("Pelear")) {
            controlPrincipal.conectarYPelear(panelFormulario.getNombre(), panelFormulario.getPeso(), panelFormulario.getCombates());
        }
    }

    /**
     * Muestra las tecnicas cargadas en el panel de tecnicas.
     *
     * @param tecnicas arreglo de tecnicas del properties
     */
    public void mostrarTecnicas(String[] tecnicas) {
        ventana.cargarTecnicas(tecnicas);
    }

    /**
     * Muestra el resultado del combate al usuario.
     *
     * @param resultado "GANASTE" o "PERDISTE"
     */
    public void mostrarResultado(String resultado) {
        emergente.mostrarResultado(resultado);
    }

    /**
     * Hace visible la ventana principal del cliente.
     */
    public void mostrarVentana() {
        ventana.setVisible(true);
    }
}
