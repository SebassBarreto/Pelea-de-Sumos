package pa.peleadesumos.Servidor.Control;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import pa.peleadesumos.Servidor.Modelo.CnxServerSocket;

/**
 * Clase encargada de gestionar el ServerSocket del servidor.
 * Acepta exactamente dos conexiones y lanza un hilo por cada luchador.
 * @author Asus
 */
public class SContolSocket {
    
    private SControlPrincipal sControlPrincipal;
    private CnxServerSocket cnxServerSocket;

    public SContolSocket(SControlPrincipal sControlPrincipal) {
        this.sControlPrincipal = sControlPrincipal;
        this.cnxServerSocket = new CnxServerSocket();
    }
    
    /**
     * Acepta dos conexiones y lanza un SHiloLuchador por cada una
     * @throws IOException
     */
    public void aceptarConexiones() throws IOException{
        for(int i = 0; i<2; i++){
            Socket socket = cnxServerSocket.conexion().accept();
           // SHiloLuchador hilo = new SHiloLuchador(socket, sControlPrincipal);
            //new Thread(hilo).start();
        }
    }
    
    /**
     * Envia el resultado del combate al cliente por el socket 
     * @param socket
     * @param resultado
     * @throws IOException
     */
    public void enviarResultado(Socket socket, String resultado) throws IOException{
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF(resultado);
        dos.flush();
    }
    
}
