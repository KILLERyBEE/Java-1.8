import java.io.*;
import java.net.*;

public class FileSender {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");
        
        File file = new File("test.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] buffer = new byte[1024];
        
        while (fis.read(buffer) != -1) {
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 12345);
            socket.send(packet);
        }
        
        fis.close();
        socket.close();
        System.out.println("File sent");
    }
}