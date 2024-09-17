import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Mcheckbox extends JFrame implements ActionListener{
    JCheckBox checkBox;
    JButton  button;
    Mcheckbox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button = new JButton("submit");
        button.addActionListener(this);


        checkBox = new JCheckBox();
        checkBox.setText("hello");
        checkBox.setFocusable(false);
        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            //checks if the selected checkbox is selected
            System.out.println(checkBox.isSelected());
        }
    }
}