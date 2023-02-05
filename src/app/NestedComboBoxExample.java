package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class NestedComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nested ComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] mainOptions = {"Option 1", "Option 2", "Option 3"};
        JComboBox mainComboBox = new JComboBox(mainOptions);
        mainComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                String selectedOption = (String) comboBox.getSelectedItem();
                if (selectedOption.equals("Option 1")) {
                    String[] subOptions = {"Suboption 1.1", "Suboption 1.2", "Suboption 1.3"};
                    mainComboBox.removeAllItems();
                    for (String subOption : subOptions) {
                        mainComboBox.addItem(subOption);
                    }
                } else if (selectedOption.equals("Option 2")) {
                    String[] subOptions = {"Suboption 2.1", "Suboption 2.2", "Suboption 2.3"};
                    mainComboBox.removeAllItems();
                    for (String subOption : subOptions) {
                        mainComboBox.addItem(subOption);
                    }
                } else if (selectedOption.equals("Option 3")) {
                    String[] subOptions = {"Suboption 3.1", "Suboption 3.2", "Suboption 3.3"};
                    mainComboBox.removeAllItems();
                    for (String subOption : subOptions) {
                        mainComboBox.addItem(subOption);
                    }
                }
            }
        });
        frame.add(mainComboBox);
        frame.pack();
        frame.setVisible(true);
    }
}
