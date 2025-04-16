import java.net.*;
import java.io.*;

public class Q49Sender
{
public static void main(String s1[])
{
try
{
Socket s = new Socket("localhost",3000);
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
BufferedReader bin = new BufferedReader(new InputStreamReader(s.getInputStream()));
PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
while(true)
{
System.out.println("Enter Msg : ");
String msg = br.readLine();
if(msg.equals("exit"))
break;
pw.println(msg);
System.out.println("Received msg: " + bin.readLine());
}
s.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}