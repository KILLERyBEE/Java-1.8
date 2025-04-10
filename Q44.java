import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Q44 extends JFrame
{
JLabel l1;
public Q44()
{
setSize(600,600);
setVisible(true);
setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
l1 = new JLabel();
addMouseMotionListener(new MouseAdapter()
{
public void mouseMoved(MouseEvent e)
{
l1.setText("Mouse moved");
}});
addMouseMotionListener(new MouseAdapter()
{
public void mouseDragged(MouseEvent e)
{
l1.setText("Mouse dragged");
}});
add(l1);
}
public static void main(String s[])
{
new Q44();
}
}

