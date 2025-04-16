import javax.swing.*;
import java.awt.*;
class Q30 extends JFrame
{
public Q30()
{
setVisible(true);
setSize(400,400);
setLayout(new FlowLayout());

JRadioButton b1 = new JRadioButton("Yes");
JRadioButton b2 = new JRadioButton("No");

ButtonGroup bg1 = new ButtonGroup();
bg1.add(b1);
bg1.add(b2);

add(b1);
add(b2);

JCheckBox cb1 = new JCheckBox("Apple");
JCheckBox cb2 = new JCheckBox("Mango");

add(cb1);
add(cb2);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String s[])
{
new Q30();
}
}



