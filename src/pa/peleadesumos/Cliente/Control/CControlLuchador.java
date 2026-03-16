package pa.peleadesumos.Cliente.Control;

import pa.peleadesumos.Cliente.Modelo.Luchador;

public class CControlLuchador {
    private Luchador luchador;

    public CControlLuchador(CControlPrincipal ccp) {
        ccp = new CControlPrincipal();
    }
    
    public void crearLuchador(String nombre, double peso, int combatesGanados, String[] kimarites){
        luchador = new Luchador(nombre, peso, combatesGanados, kimarites);
    }
    
    public void salio(){
        
    }
}
