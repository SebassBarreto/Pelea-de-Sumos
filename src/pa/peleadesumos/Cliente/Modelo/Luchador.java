package pa.peleadesumos.Cliente.Modelo;

public class Luchador {
    private String nombre;
    private double peso;
    private int combatesGanados;
    private String[] kimarites;
    private boolean dentroDelDojo;

    public Luchador(String nombre, double peso, int combatesGanados, String[] kimarites) {
        this.nombre = nombre;
        this.peso = peso;
        this.combatesGanados = combatesGanados;
        this.kimarites = kimarites;
        this.dentroDelDojo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCombatesGanados() {
        return combatesGanados;
    }

    public void setCombatesGanados(int combatesGanados) {
        this.combatesGanados = combatesGanados;
    }

    public String[] getKimarites() {
        return kimarites;
    }

    public void setKimarites(String[] kimarites) {
        this.kimarites = kimarites;
    }

    public boolean isDentroDelDojo() {
        return dentroDelDojo;
    }

    public void setDentroDelDojo(boolean dentroDelDojo) {
        this.dentroDelDojo = dentroDelDojo;
    }
}
