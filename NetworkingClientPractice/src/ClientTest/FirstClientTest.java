package ClientTest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class FirstClientTest {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost" , 7777)){
            System.out.println("connected .");
        }catch(IOException e){
            e.printStackTrace() ;
        }
    }
}
