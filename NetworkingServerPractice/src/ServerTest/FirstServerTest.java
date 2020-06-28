package ServerTest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FirstServerTest {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(7777)){
            Socket socket = serverSocket.accept() ;
            System.out.println("client has connected ! ");
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
