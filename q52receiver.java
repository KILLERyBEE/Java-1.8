import java.io.*;
import java.net.*;
public class q52receiver
{
public static void main(String args[]) throws Exception
{
DatagramSocket ds = new DatagramSocket(9567);
byte[] data = new byte[1024];
DatagramPacket packet = new DatagramPacket(data, data.length);
ds.receive(packet);
String rdata = new String(packet.getData(), 0, packet.getLength());
System.out.println("Received data:" +rdata);
ds.close();
}
}