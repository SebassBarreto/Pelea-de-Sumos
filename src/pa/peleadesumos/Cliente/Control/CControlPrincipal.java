package pa.peleadesumos.Cliente.Control;

public class CControlPrincipal {
    private CControlLuchador ccl;
    private CControlVista ccv;
    
    public CControlPrincipal(){
        ccl = new CControlLuchador(this);
        ccv = new CControlVista(this);
    }
}
