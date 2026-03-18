
package pa.peleadesumos.Servidor.Control;

/**
 *
 * @author Asus
 */
public class SControlPrincipal {
      
    private ControlDojo controlDojo;
    private ControlLuchador controlLuchador;
    private SContolSocket sControlSocket;
    private SControlVista sControlVista;
    private SHiloLuchador sHiloLuchador;

    public SControlPrincipal() {
        controlLuchador = new ControlLuchador(this);
        controlDojo = new ControlDojo(this);
        sControlVista = new SControlVista(this);
        sControlSocket = new SContolSocket(this);
        sHiloLuchador = new SHiloLuchador(this);
        
    }
    
    
    
}
