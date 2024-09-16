import java.awt.*;
import javax .swing.*;
public class Mlayered{
    public static void main(String[] args) {
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.lightGray);
        label1.setBounds(50,50,200,200);
        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.red);
        label2.setBounds(100,100,200,200);
        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.green);
        label3.setBounds(150,150,200,200);
        //Jlayeredpanes  allows us to arrange panels/components in different dimensions
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);
        layeredPane.add(label1);
        layeredPane.add(label2);
        layeredPane.add(label3);

        JFrame frame = new JFrame();
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    
    }
}