import java.net.*;
import java.io.*;

public class Q50Sender {
    private static final String EXIT_CMD = "exit";
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int port = 3303;                }

        try (DatagramSocket ds = new DatagramSocket();
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("UDP Sender. Type '" + EXIT_CMD + "' to quit.");

            while (true) {
                System.out.print("Enter Message: ");
                String msg = br.readLine();
                if (EXIT_CMD.equalsIgnoreCase(msg)) {
                    break;
                }

                // Send message
                byte[] buffer = msg.getBytes();
                DatagramPacket packet = new DatagramPacket(
                    buffer, buffer.length, 
                    InetAddress.getByName(host), port
                );
                ds.send(packet);

                // Wait for reply
                byte[] replyBuffer = new byte[BUFFER_SIZE];
                DatagramPacket replyPacket = new DatagramPacket(replyBuffer, replyBuffer.length);
                ds.receive(replyPacket);

                String reply = new String(
                    replyPacket.getData(), 0, replyPacket.getLength()
                );
                System.out.println("Reply: " + reply);  // Fixed: Uses replyPacket
            }
        } catch (SocketException e) {
            System.err.println("Socket error: " + e.getMessage());
        }
    }
}