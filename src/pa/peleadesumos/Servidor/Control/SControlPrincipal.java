
package pa.peleadesumos.Servidor.Control;

/**
 *
 * @author Asus
 */
public class SControlPrincipal {
      
    private SControlDojo sControlDojo;
    private SControlVista sControlVista;
    private ServidorControl servidorControl;
    private SHiloLuchador sHiloLuchador;

    public SControlPrincipal() {
        sControlDojo = new SControlDojo(this);
        sControlVista = new SControlVista(this);
        servidorControl = new ServidorControl(this);
        sHiloLuchador = new SHiloLuchador(this);
        
    }
    
    
    
}
