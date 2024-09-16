import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax .swing.*;

public class Mbutton extends JFrame  implements ActionListener{
    //we declared the button and label outside the constructor to give it a global reference
    JButton button;
    JLabel label;
    Mbutton(){
        ImageIcon icon = new ImageIcon("download.jpeg");
        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150,250,250,250);
        label.setVisible(false);//prevents the label from appearing befor it's clicked
         button = new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(this);
        button.setText("click me");
        button.setFocusable(false);//removes the box that sorrounds the text inside the button
        // button.setEnabled(false);//disables the button when  set to false
        //uses a lambda expression but is a short form no need of long syntax action listeners
        // button.addActionListener(e -> System.out.println("welcome"));
        this.setTitle("my window");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            // System.out.println("welcome");
            label.setVisible(true);
        }
    }
}