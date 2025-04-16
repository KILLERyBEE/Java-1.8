class parent
{
public static void displayn(String n)
{
System.out.println("Name is : " + n);
}
}

class child1 extends parent
{
public static void displaya(int a)
{
System.out.println("Age is : " + a);
}
}

class child2 extends child1
{
public static void displayS(String s)
{
System.out.println("Surname : " + s);
}
}

public class Q19
{
public static void main(String s[])
{
new child2().displayn("Avdhut");
new child2().displayS("Madhavi");
new child2().displaya(18);
}
}
