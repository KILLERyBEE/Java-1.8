class Thread1 extends Thread
{
public void run()
{
for(int i = 1 ; i <= 100 ; i++)
{
System.out.println(i);
}
}
}

class Thread2 extends Thread
{
public void run()
{
for(int i = 101 ; i <= 200; i++)
{
System.out.println(i);
}
}
}


class Thread3 extends Thread
{
public void run()
{
for(int i = 101 ; i <= 200; i++)
{
System.out.println(i);
}
}
}

public class Q27
{
public static void main(String s[])
{
Thread1 ob = new Thread1();
Thread2 ob1 = new Thread2();
Thread3 ob2 = new Thread3();
ob.setPriority(3);
ob1.setPriority(8);
ob2.setPriority(7);
ob.start();
ob1.start();
ob2.start();
}
}


