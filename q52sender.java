import java.io.*;
import java.net.*;
public class q52sender
{
public static void main (String args[]) throws Exception
{
DatagramSocket ds = new DatagramSocket();
InetAddress receiveradd = InetAddress.getByName("localhost");
int port = 9567;
byte[] data = "HELLO".getBytes();
DatagramPacket packet = new DatagramPacket(data, data.length, receiveradd, port);
ds.send(packet);
ds.close();
System.out.println("Data sent successfully.");
}
}