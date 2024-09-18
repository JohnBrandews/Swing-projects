import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax .swing.*;
public class Mradio extends JFrame  implements ActionListener{
    JRadioButton radio1;
    JRadioButton radio2;
    JRadioButton radio3;
    Mradio(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        radio1 = new JRadioButton("pizza");
         radio2 = new JRadioButton("candy");
         radio3 = new JRadioButton("ice scream");
         radio1.addActionListener(this);
         radio2.addActionListener(this);
         radio3.addActionListener(this);

         ButtonGroup group = new ButtonGroup();
         group.add(radio1);
         group.add(radio2);
         group.add(radio3);
        this.add(radio1);
        this.add(radio2);
        this.add(radio3);
        this.pack();
        this.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
if(e.getSource() == radio1) {
    System.out.println("pizza is selected");
}
else if(e.getSource() == radio2) {
    System.out.println("candy is selected");
}
else if(e.getSource() == radio3) {
    System.out.println("ice scream is selected");

}
else{
    System.out.println("make a selection please!!");
}
}
}