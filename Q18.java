class parent
{
public static void displayn(String n)
{
System.out.println("Name is : " + n);
}
}

class child extends parent
{
public static void displaya(int a)
{
System.out.println("Age is : " + a);
}
}

public class Q18
{
public static void main(String s[])
{
new child().displayn("Avdhut");
new child().displaya(18);
}
}
