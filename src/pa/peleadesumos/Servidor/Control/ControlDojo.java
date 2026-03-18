
package pa.peleadesumos.Servidor.Control;

import java.util.concurrent.ThreadLocalRandom;
import pa.peleadesumos.Servidor.Modelo.Luchador;


/**
 *
 * @author Asus
 */
public class ControlDojo {
    
    private SControlPrincipal sControlPrincipal;
    private Luchador[] luchadores = new Luchador[2];
    private int contadorLuchadores = 0;
    private Luchador ganador;
    private boolean combateTerminado = false;

    public ControlDojo(SControlPrincipal sControlPrincipal) {
        this.sControlPrincipal = sControlPrincipal;
    }

    /**
     * Sube un luchador al dohyō. El primero hace wait() hasta que
     * llegue el segundo. Cuando ambos están, notifyAll() inicia el combate.
     * @param luchador el luchador que llega al dohyō
     * @throws InterruptedException si el hilo es interrumpido mientras espera
     */
    public synchronized void subirLuchador(Luchador luchador) throws InterruptedException {
        luchadores[contadorLuchadores] = luchador;
        contadorLuchadores++;

        if (contadorLuchadores < 2) {
            wait();
        } else {
            notifyAll();
        }
    }

    /**
     * Ejecuta el turno del luchador que lo llama. Solo un hilo puede
     * estar aquí a la vez gracias a synchronized. El que termina su
     * movimiento cede la llave con notifyAll() + wait().
     * @param luchador el luchador que ejecuta el turno
     * @throws InterruptedException si el hilo es interrumpido mientras espera
     */
    public synchronized void ejecutarTurno(Luchador luchador) throws InterruptedException {
        if (combateTerminado) return;

        String kimarite = obtenerKimariteRandom(luchador.getKimarites());
        boolean saco = obtenerResultadoRandom();

        if (saco) {
            ganador = luchador;
            combateTerminado = true;
            notifyAll();
            return;
        }

        long espera = ThreadLocalRandom.current().nextLong(500);
        notifyAll();
        wait(espera);
    }

    /**
     * Retorna el luchador ganador del combate.
     * @return el luchador que ganó
     */
    public Luchador determinarGanador() {
        return ganador;
    }

    public boolean isCombateTerminado() {
        return combateTerminado;
    }
    
    public static String obtenerKimariteRandom(String[] kimaritesLuchador) {
        int i = ThreadLocalRandom.current().nextInt(kimaritesLuchador.length);
        return kimaritesLuchador[i];
    }
    
    public boolean obtenerResultadoRandom() {
        int i = ThreadLocalRandom.current().nextInt(10);
        if(i>8){
            return true;
        }
        else{
            return false;
        }
    }
    
    

    //void subirLuchador(Luchador luchador) {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

    //void ejecutarTurno(Luchador luchador) {
    //    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
    
}
