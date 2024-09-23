import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Mcolorchooser extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    Mcolorchooser(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button = new JButton("pick a color");
        button.addActionListener(this);
        label = new JLabel("my color");
        label.setBackground(Color.WHITE);
        label.setFont(new Font("Mv Boli", Font.PLAIN,100));
        label.setOpaque(true);//makes the label visible
        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button){
            //gui component that let's the user select a color to use
            JColorChooser colorChooser = new JColorChooser();
            //here we just set black as the default when we open the dialog
            Color color = JColorChooser.showDialog(null,"pick a color",Color.black);
            label.setForeground(color);
        }
    }
}
