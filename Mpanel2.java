
import java.awt.*;
import javax .swing.*;
public class Mpanel2{
public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setLayout(new BorderLayout(10,10));//you can pass in margin for the width and height
    frame.setVisible(true);
    //Main panels
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    panel1.setBackground(new Color(255, 0, 255));
    panel2.setBackground(new Color(255, 0, 128));
    panel3.setBackground(new Color(128, 0, 128));
    panel4.setBackground(new Color(0, 0, 255));
    panel5.setBackground(new Color(0, 0, 128));
    panel1.setPreferredSize(new Dimension(100,100));
    panel2.setPreferredSize(new Dimension(100,100));
    panel3.setPreferredSize(new Dimension(100,100));
    panel4.setPreferredSize(new Dimension(100,100));
    panel5.setPreferredSize(new Dimension(100,100));
    //sub panels.....
    JPanel panel6 = new JPanel();
    JPanel panel7 = new JPanel();
    JPanel panel8 = new JPanel();
    JPanel panel9 = new JPanel();
    JPanel panel10 = new JPanel();
    panel6.setBackground(new Color(255, 0, 0));
    panel7.setBackground(new Color(250, 0, 128));
    panel8.setBackground(new Color(150, 0, 128));
    panel9.setBackground(new Color(140, 0, 255));
    panel10.setBackground(new Color(0, 0, 128));
//since panel5 is the center panel we make it ac t like a container for the subpanels
    panel5.setLayout(new BorderLayout());

    panel6.setPreferredSize(new Dimension(50,50));
    panel7.setPreferredSize(new Dimension(50,50));
    panel8.setPreferredSize(new Dimension(50,50));
    panel9.setPreferredSize(new Dimension(50,50));
    panel10.setPreferredSize(new Dimension(50,50));
    panel5.add(panel6, BorderLayout.NORTH);
    panel5.add(panel7, BorderLayout.SOUTH);
    panel5.add(panel8, BorderLayout.WEST);
    panel5.add(panel9, BorderLayout.EAST);
    panel5.add(panel10, BorderLayout.CENTER);

    //main panels
    frame.add(panel1,BorderLayout.NORTH);
    frame.add(panel2,BorderLayout.WEST);
    frame.add(panel3,BorderLayout.EAST);
    frame.add(panel4,BorderLayout.SOUTH);
    frame.add(panel5,BorderLayout.CENTER);


}
}