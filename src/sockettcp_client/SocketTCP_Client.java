/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockettcp_client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class SocketTCP_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String msn = JOptionPane.showInputDialog("Ingrese nombre");
        String msn2 = JOptionPane.showInputDialog("Ingrese ID");
        String msn3 = JOptionPane.showInputDialog("Ingrese NRC");
        String msn4 = JOptionPane.showInputDialog("Ingrese materia");
        try {
            // TODO code application logic here
            
            Socket socket = new Socket("127.0.0.1", 9107);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF(msn);
        } catch (IOException ex) {
            Logger.getLogger(SocketTCP_Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
