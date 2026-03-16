package pa.peleadesumos.Cliente.Control;

import pa.peleadesumos.Cliente.Modelo.Luchador;
/**
 * Clase de control encargada de las operaciones de datos del Luchador.
 * @author Sergio Vanegas
 */
public class CControlLuchador {
    private Luchador luchador;
    private CControlPrincipal ccp;

    public CControlLuchador(CControlPrincipal ccp) {
        this.ccp = ccp;
    }
    
    public void crearLuchador(String nombre, double peso, int combatesGanados, String[] kimarites){
        luchador = new Luchador(nombre, peso, combatesGanados, kimarites);
    }
    
    public void salioLuchador(Luchador perdedor){
        perdedor.setDentroDelDojo(false);
    }
    
    
}
