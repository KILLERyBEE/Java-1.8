import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorMenuDemo extends JFrame {
    private JPanel colorPanel;
    
    public ColorMenuDemo() {
        setTitle("Color Menu Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create panel to show color changes
        colorPanel = new JPanel();
        add(colorPanel, BorderLayout.CENTER);
        
        // Create menu bar
        JMenuBar menuBar = new JMenuBar();
        
        // Create Colors menu
        JMenu colorMenu = new JMenu("Colors");
        
        // Create color menu items
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Black"};
        for (String color : colors) {
            JMenuItem menuItem = new JMenuItem(color);
            menuItem.addActionListener(new ColorChangeListener());
            
            // Disable Black menu item
            if (color.equals("Black")) {
                menuItem.setEnabled(false);
            }
            
            colorMenu.add(menuItem);
        }
        
        menuBar.add(colorMenu);
        setJMenuBar(menuBar);
    }
    
    // Action listener for color menu items
    private class ColorChangeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String colorName = ((JMenuItem)e.getSource()).getText();
            Color color;
            
            switch (colorName) {
                case "Red": color = Color.RED; break;
                case "Green": color = Color.GREEN; break;
                case "Blue": color = Color.BLUE; break;
                case "Yellow": color = Color.YELLOW; break;
                default: color = Color.CYAN;
            }
            
            colorPanel.setBackground(color);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorMenuDemo demo = new ColorMenuDemo();
            demo.setVisible(true);
        });
    }
}