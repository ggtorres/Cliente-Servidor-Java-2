
package server2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server2 {

 
 public static void main(String[] args) {
        try {
            //Serviço de escuta
            ServerSocket server = new ServerSocket(2404);
            System.out.println("Conectado ao cliente");
            
            //Canal de comunicação
            Socket cliente = server.accept();
            System.out.println("Cliente do ip: " + cliente.getInetAddress().getHostAddress());
            
            Scanner in = new Scanner(cliente.getInputStream());
            while(in.hasNextLine()){
                System.out.println(in.nextLine());
            }
            
            in.close();
            server.close();
                    
                    
        } catch (IOException ex) {
            System.out.println("Erro ao criar o servidor");
            Logger.getLogger(Server2.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    
}
