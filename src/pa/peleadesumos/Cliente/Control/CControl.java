package pa.peleadesumos.Cliente.Control;
/**
 * 
 * @author Sergio Vanegas
 */
public class CControl {
    private CControlPrincipal ccp;
    private String[] datosLuchador;
    

    public CControl(CControlPrincipal ccp) {
        this.ccp = ccp;
    }
    
    public void recibirDatosLuchador(String[] datos){
        this.datosLuchador = datos;
        //Aquí faltaría un método de la clase conexión socket del cliente que reciba como parámetro el arreglo
    }
}
