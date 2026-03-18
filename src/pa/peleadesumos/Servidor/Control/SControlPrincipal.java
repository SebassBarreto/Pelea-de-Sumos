
package pa.peleadesumos.Servidor.Control;

import pa.peleadesumos.Servidor.Modelo.Luchador;

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

    void subirAlDojo(Luchador luchador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void notificarLlegada(Luchador luchador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void notficarKimarite(Luchador luchador, String kimarite) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void notificarGanador(Luchador ganador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
