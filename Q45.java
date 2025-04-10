import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Q45 extends JFrame implements ActionListener
{
JLabel l1,l2,l3;
JTextField t1,t2;
JButton b1;
public Q45()
{
setSize(400,400);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new GridLayout(3,3));
l1 = new JLabel("Enter Num 1");
l2 = new JLabel("Enter Num 2");
l3 = new JLabel("Addition will Appear here ! ");

t1 = new JTextField();
t2 = new JTextField();

b1 = new JButton("Add");

add(l1);   add(t1);
add(l2);   add(t2);
add(b1);   add(l3);

b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
try
{
int num1 = Integer.parseInt(t1.getText());
int num2 = Integer.parseInt(t2.getText());
int total = num1 + num2;
l3.setText(" Addition = " + total);
}
catch(Exception e)
{
System.out.println("Error");
}
}
public static void main(String s[])
{
new Q45();
}
}





