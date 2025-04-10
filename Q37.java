import java.awt.*;
public class Q37 extends Frame
{
public Q37()
{
setSize(600,600);
setVisible(true);
setLayout(new BorderLayout());
Button b1 = new Button("North");
Button b2 = new Button("South");
Button b3 = new Button("Center");
Button b4 = new Button("East");
Button b5 = new Button("West");

add(b1,BorderLayout.NORTH);
add(b2,BorderLayout.SOUTH);
add(b3,BorderLayout.CENTER);
add(b4,BorderLayout.EAST);
add(b5,BorderLayout.WEST);

}
public static void main(String s[])
{
new Q37();
}
}