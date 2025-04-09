import java.io.*;
import java.net.*;

public class FileReceiver {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(12345);
        byte[] buffer = new byte[1024];
        
        FileOutputStream fos = new FileOutputStream("received.txt");
        
        while (true) {
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            fos.write(packet.getData(), 0, packet.getLength());
        }
        
        // Note: This receiver will run forever (use Ctrl+C to stop)
        // fos.close(); // This line is unreachable in this simple version
    }
}