import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax .swing.*;

public class Mbutton extends JFrame  implements ActionListener{
    //we declared the button outside the constructor to give it a global reference
    JButton button;
    Mbutton(){
         button = new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(this);
        //uses a lambda expression but is a short form no need of long syntax action listeners
        // button.addActionListener(e -> System.out.println("welcome"));
        this.setTitle("my window");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("welcome");
        }
    }
}