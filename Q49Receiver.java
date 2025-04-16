import java.net.*;
import java.io.*;

public class Q49Receiver
{
public static void main(String s1[])
{
try
{
ServerSocket ss = new ServerSocket(3000);
Socket s = ss.accept();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
BufferedReader bin = new BufferedReader(new InputStreamReader(s.getInputStream()));
PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
while(true)
{
System.out.println("Recieved Msg: " + bin.readLine());
System.out.println("Enter msg :");
String msg = br.readLine();
if(msg.equals("exit"))
break;
pw.println(msg);
}
s.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}