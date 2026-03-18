/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.peleadesumos.Cliente.Control;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import pa.peleadesumos.Cliente.Modelo.CnxSocket;

/**
 * Control encargado de manejar la comunicacion del cliente con el servidor.
 * Envia los datos del luchador y espera el resultado del combate.
 *
 * @author Asus
 */
public class CControlSocket {

    private CnxSocket cnxSocket;
    private CControlPrincipal ccp;

    /**
     * Constructor de CControlSocket
     *
     * @param ccp
     */
    public CControlSocket(CControlPrincipal ccp) {
        this.ccp = ccp;
        this.cnxSocket = new CnxSocket();
    }

    /**
     * Envia los datos del luchador al servidor por el socket
     *
     * @param nombre
     * @param peso
     * @param combatesGanados
     * @param kimarites
     * @throws java.io.IOException
     */
    public void enviarLuchador(String nombre, float peso, int combatesGanados, String[] kimarites) throws IOException {

        Socket socket = cnxSocket.conexion();
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        dos.writeUTF(nombre);
        dos.writeFloat(peso);
        dos.writeInt(combatesGanados);
        dos.writeInt(kimarites.length);

        for (String kimarite : kimarites) {
            dos.writeUTF(kimarite);
        }

        dos.flush();

    }

    /**
     * Espera y retorna el resultado del combate enviado por el servidor
     *
     * @return "GANASTE O PERDISTE" obviamente este mensaje se manda por vista
     * @throws IOException
     */
    public String esperarResultado() throws IOException {
        Socket socket = cnxSocket.conexion();
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        return dis.readUTF();
    }

}
