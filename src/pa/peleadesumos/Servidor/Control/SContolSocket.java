/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.peleadesumos.Servidor.Control;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Clase encargada de gestionar el ServerSocket del servidor.
 * Acepta exactamente dos conexiones y lanza un hilo por cada luchador.
 * @author sebastian
 */
public class SContolSocket {
    
    private SControlPrincipal sControlPrincipal;
    //Socket del servidor
    private ServerSocket serverSocket;
    private int puerto;

    public SContolSocket(SControlPrincipal sControlPrincipal) {
        this.sControlPrincipal = sControlPrincipal;

    }
    
    /**
     * Abre el ServerSocket en el puerto indicado.
     * @throws IOException si no se puede abrir el puerto
     */
    public void iniciarServidor() throws IOException{
        serverSocket = new ServerSocket(puerto);
    }
    
    /**
     * Acepta dos conexiones y lanza un SHiloLuchador por cada una
     * @throws IOException
     */
    public void aceptarConexiones() throws IOException{
        int contadorClientes = 0;
        while(contadorClientes < 2){
            Socket socket = serverSocket.accept();
         //   SHiloLuchador hilo = new SHiloLuchador(socket);
       //     new Thread(hilo).start();
            contadorClientes++;
        }
    }
}
