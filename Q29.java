import java.io.*;
class NotMatchException extends Exception
{
NotMatchException(String t)
{
super(t);
}
}


public class Q29
{
public static void main(String s1[])
{
try
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter A Country Name :");
String s = br.readLine();
if(s.equals("India"))
System.out.println("You guessed it right");
else
throw new NotMatchException("You entered Wrong Country");
}
catch(NotMatchException e)
{
System.out.println(e.getMessage());
}
catch(IOException e)
{
System.out.println("Error");
}
}
}