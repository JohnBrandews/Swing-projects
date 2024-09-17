import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax .swing.*;
public class Mtext extends JFrame implements ActionListener{
    JButton button;
    JTextField textField;
Mtext(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());
     textField = new JTextField();
    textField.setPreferredSize(new Dimension(250,40));
    textField.setForeground(new Color(0,255,255));
    // determines if the text field is editable or not
    // textField.setEditable(false);
    button = new JButton("submit");
    button.addActionListener(this);
    this.add(button);
    this.add(textField);
    this.pack();
    this.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
if(e.getSource() == button){
System.out.println( textField.getText());
//this lines  disables the button once the user submits the details
    button.setEnabled(false);
    textField.setEditable(false);


}
}
}