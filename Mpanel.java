import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax .swing.*;

public class Mpanel{
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("image.png");
        JLabel label = new JLabel();
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100,100,75,75);

        label.setText("hello");
        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(255,0,255));
        panel1.setBounds(0, 0, 250, 250);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(0,0,128));
        panel2.setBounds(250, 0, 250, 250);

        JPanel panel3 = new JPanel();
        panel3.setBackground(new Color(0,255,0));
        panel3.setBounds(0, 250, 500, 250);
        JFrame frame = new JFrame();
        frame.setTitle("panels");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        panel3.add(label);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

    }
}