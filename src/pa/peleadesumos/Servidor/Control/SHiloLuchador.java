/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.peleadesumos.Servidor.Control;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


/**
 * Hilo encargado de atender a un luchador conectado via socket.
 * Recibe los datos del luchador, lo sube al dojo y ejecuta su turno en el combate.
 * @author sebastian
 */
public class SHiloLuchador implements Runnable{

    private Socket socket;
    private SControlPrincipal controlPrincipal;

    public SHiloLuchador(SControlPrincipal controlPrincipal) {
        this.controlPrincipal = controlPrincipal;
        this.socket = socket;

    }
    
 /**
  * 
  */   
    @Override
    public void run() {
        try{
      
        } catch(Exception e){
            e.printStackTrace();
        }finally {
            try{
                socket.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    
    
    
}
