interface RecFormula
{
public void areaRectangle(int l, int b);
}

interface CirFormula
{
public void areaCircle(int r);
}

class Rectangle implements RecFormula
{
public void areaRectangle(int l, int b)
{
System.out.println("Area of rectangle is : " + (l*b));
}
}

class Circle extends Rectangle implements CirFormula 
{
public void areaCircle(int r)
{
System.out.println("Area of Circle is : " + (3.14 * r * r));
}
}

public class Q21
{
public static void main(String s[])
{
new Circle().areaRectangle(3,5);
new Circle().areaCircle(5);
}
}

