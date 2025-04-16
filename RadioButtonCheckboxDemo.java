import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonCheckboxDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio and Checkbox Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JCheckBox music = new JCheckBox("Music");
        JCheckBox sports = new JCheckBox("Sports");
        JCheckBox travel = new JCheckBox("Travel");

        JButton show = new JButton("Show Selection");
        JTextArea output = new JTextArea(5, 30);
        output.setEditable(false);

        show.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String result = "Gender: ";
                if (male.isSelected()) result += "Male";
                else if (female.isSelected()) result += "Female";
                else result += "None";

                result += "\nHobbies: ";
                if (music.isSelected()) result += "Music ";
                if (sports.isSelected()) result += "Sports ";
                if (travel.isSelected()) result += "Travel ";
                output.setText(result);
            }
        });

        frame.add(male);
        frame.add(female);
        frame.add(music);
        frame.add(sports);
        frame.add(travel);
        frame.add(show);
        frame.add(output);

        frame.setVisible(true);
    }
}
