import java.net.*;
import java.io.*;

public class Q50Receiver {
    private static final int BUFFER_SIZE = 1024;
    private static final String EXIT_CMD = "exit";

    public static void main(String[] args) throws Exception {
        int port = 3303;

        try (DatagramSocket ds = new DatagramSocket(port);
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            
            System.out.println("Listening on port " + port + ". Type '" + EXIT_CMD + "' to quit.");
            
            while (true) {
                // Receive packet
                byte[] buffer = new byte[BUFFER_SIZE];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                ds.receive(packet);
                
                String received = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received: " + received);

                // Prompt reply
                System.out.print("Enter Message: ");
                String reply = br.readLine();
                if (EXIT_CMD.equalsIgnoreCase(reply)) {
                    break;
                }

                // Send reply to sender (not self!)
                byte[] replyData = reply.getBytes();
                DatagramPacket replyPacket = new DatagramPacket(
                    replyData, 
                    replyData.length, 
                    packet.getAddress(), 
                    packet.getPort()  // Reply to sender's port
                );
                ds.send(replyPacket);
            }
        } catch (SocketException e) {
            System.err.println("Port " + port + " is already in use!");
        }
    }
}