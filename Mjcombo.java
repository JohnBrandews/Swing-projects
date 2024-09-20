import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mjcombo extends JFrame implements ActionListener {
    JComboBox comboBox;
    Mjcombo(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        String [] animals = {"dog", "cat", "cow"};
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);
        //allows us to search for an item in the comboBox
        comboBox.setEditable(true);
        this.add(comboBox);
        this.pack();
        this.setVisible(true);
        
    }
    public void  actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox){
            System.out.println(comboBox.getSelectedItem());
        }
    }
}