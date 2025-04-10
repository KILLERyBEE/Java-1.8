import java.net.*;
public class url
{
public static void main(String s[])
{
try
{
URL u = new URL("http://www.msbte.ac.in");
System.out.println("Protocol: " + u.getProtocol());
System.out.println("Host: " + u.getHost());
System.out.println("Port: " + u.getPort());
System.out.println("File name: "+ u.getFile());
}
catch(Exception e)
{
System.out.println("Error");
}
}
}
