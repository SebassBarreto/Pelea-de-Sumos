package pa.peleadesumos.Cliente.Control;

public class CControlPrincipal {
    private CControl ccl;
    private CControlVista ccv;
    
    public CControlPrincipal(){
        ccl = new CControl(this);
        ccv = new CControlVista(this);
    }
}
