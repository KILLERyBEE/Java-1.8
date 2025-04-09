import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Q40 extends JFrame implements ActionListener
{
JComboBox jb;
JLabel l;
public Q40()
{
setSize(600,600);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
String s[] = {"Solapur","Pune","Bengaluru","Mumbai"};
jb = new JComboBox(s);
add(jb);
l = new JLabel();
add(l);
jb.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
l.setText("You are In "+(String)jb.getSelectedItem());
}
public static void main(String s[])
{
new Q40();
}
}