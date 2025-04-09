import java.awt.*;
import java.awt.event.*;
public class Button1 extends Frame
{
public static void main(String s[])
{
Button b = new Button("CLick me");
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
System.out.println("I LOVEEEEEE YOUUUU BABYYYYY");
}
});
add(b);
setSize(400,400);
setVisible(true);
}
}