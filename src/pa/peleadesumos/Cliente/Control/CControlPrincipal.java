package pa.peleadesumos.Cliente.Control;

public class CControlPrincipal { 
    
    private CControlSocket cControlSocket;
    private CControlVista cControlVista;
    
    public CControlPrincipal(){
        cControlVista = new CControlVista(this);
        cControlSocket = new CControlSocket(this);
    }

    void cargarTecnicas(String ruta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void confirmarTecnicas(String[] tecnicas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void conectarYPelear(String nombre, String peso, String combates) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
