import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
public class Q41
{
public static void main(String s[])
{
String data[][] = { 
{"AA","91.6%","A"},
{"AB","91.6%","B"},
{"AV","91.6%","C"},
{"AC","91.6%","G"},
{"AD","91.6%","E"}};

String column[] = {"Name " ,"Percentage","Grade"};

JTable table = new JTable(new DefaultTableModel(data,column));
JScrollPane sc = new JScrollPane(table);
JFrame f = new JFrame();
f.setSize(300,300);
f.setVisible(true);
f.setLayout(new FlowLayout());
f.add(sc);
}
}
