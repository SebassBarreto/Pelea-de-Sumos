package pa.peleadesumos.Servidor.Modelo;

import pa.peleadesumos.Cliente.Modelo.Luchador;

public class Dojo {
    
    private Luchador[] luchadores;
    //indice del luchador que tiene el turno actual 1 ó 0
    private int turnoActual;
    private boolean combateActivo;
    
    public Dojo(){
        luchadores = new Luchador[2];
        turnoActual = 0;
        combateActivo = false;
    }

    public Luchador[] getLuchadores() {
        return luchadores;
    }

    public void setLuchadores(Luchador[] luchadores) {
        this.luchadores = luchadores;
    }

    public int getTurnoActual() {
        return turnoActual;
    }

    public void setTurnoActual(int turnoActual) {
        this.turnoActual = turnoActual;
    }

    public boolean isCombateActivo() {
        return combateActivo;
    }

    public void setCombateActivo(boolean combateActivo) {
        this.combateActivo = combateActivo;
    }
}