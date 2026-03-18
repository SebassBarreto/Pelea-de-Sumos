package pa.peleadesumos.Servidor.Control;

import pa.peleadesumos.Servidor.Modelo.Luchador;

/**
 *
 * @author Asus
 */
public class ControlLuchador {
    
    private SControlPrincipal sControlPrincipal;
    
    public ControlLuchador(SControlPrincipal sControlPrincipal) {
        this.sControlPrincipal=sControlPrincipal;
    }
    
    public void crearLuchador(String nombre, float peso, int combatesGanados, String[] kimarites){
        Luchador luchador = new Luchador(nombre, peso, combatesGanados, kimarites);
        sControlPrincipal.subirAlDojo(luchador);
    }
    
}
