
package pa.peleadesumos.Servidor.Control;

import java.util.concurrent.ThreadLocalRandom;
import pa.peleadesumos.Servidor.Modelo.Luchador;


/**
 *
 * @author Asus
 */
public class ControlDojo {
    
    private SControlPrincipal sControlPrincipal;
    private static boolean luchadorGano;
    private Luchador ganador;

    public ControlDojo(SControlPrincipal sControlPrincipal) {
        this.sControlPrincipal = sControlPrincipal;
    }
    
    public static String obtenerKimariteRandom(String[] kimaritesLuchador) {
        int i = ThreadLocalRandom.current().nextInt(kimaritesLuchador.length);
        return kimaritesLuchador[i];
    }
    
    public static boolean obtenerResultadoRandom() {
        int i = ThreadLocalRandom.current().nextInt(10);
        if(i>8){
            luchadorGano=true;
        }
        else{
            luchadorGano=false;
        }
        return luchadorGano;
    }
    
    public Luchador determinarGanador(){
        return ganador;
    }
    

    //void subirLuchador(Luchador luchador) {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

    //void ejecutarTurno(Luchador luchador) {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
    
}
