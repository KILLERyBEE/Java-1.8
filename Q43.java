import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Q43 extends JFrame
{
JLabel l;
public Q43()
{
setSize(600,600);
setVisible(true);
setLayout(new FlowLayout());
l = new JLabel("");
add(l);	
addKeyListener(new KeyAdapter(){
public void keyPressed(KeyEvent e)
{
l.setText(e.getKeyChar() + " Pressed");
}});
}
public static void main(String s[])
{
new Q43();
}
}