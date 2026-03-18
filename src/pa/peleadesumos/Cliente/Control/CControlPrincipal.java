package pa.peleadesumos.Cliente.Control;

public class CControlPrincipal { 
    
    private CControlSocket cControlSocket;
    private CControlVista cControlVista;
    
    public CControlPrincipal(){
        cControlVista = new CControlVista(this);
        cControlSocket = new CControlSocket(this);
    }
    public void recibirDatosLuchador(String[] datos){
       // this.datosLuchador = datos;
        //Aquí faltaría un método de la clase conexión socket del cliente que reciba como parámetro el arreglo
    }
}
