import java.net.*;
import java.io.*;
public class Q46
{
public static void main(String s[]) 
{
try
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Host Name : ");
String name = br.readLine();
InetAddress i = InetAddress.getByName(name);
System.out.println("Address = " + i);
}
catch(Exception e)
{
System.out.println("Error");
}
}
}
