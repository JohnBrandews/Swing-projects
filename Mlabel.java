import java . awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax .swing.*;

public class Mlabel{
public static void main(String[] args) {
    ImageIcon image = new ImageIcon("download.jpeg");
   
    JLabel label = new JLabel();
    label.setText("hello lil");//add text to label
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.CENTER);//can be center,right or left
    // label.setVerticalTextPosition(JLabel.TOP);//can be center,top or bottom
    label.setForeground(new Color(0x00FF00));//set font color
    label.setFont(new Font("MV Boli", Font.PLAIN,20)); //set font size and style
    label.setIconTextGap(100);//set the gap between the text and the image
    label.setBackground(Color.white);//set the background color of the label
    label.setOpaque(true);//display the background color
    label.setVerticalAlignment(JLabel.CENTER);//set the vertical alignment of both text and image
    label.setHorizontalAlignment(JLabel.CENTER);//set  the horizontal alignment of both text and image
    // label.setBounds(0,0,250,250);//sets the position  of the label(x,y,width,height)
    JFrame frame = new JFrame();
    frame.setTitle("MLabel frame");
    // frame.setSize(500,500);
    // frame.setLayout(null);
    // frame.setResizable(false);
    // frame.getContentPane().setBackground(new Color(0,255,255));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(label);
    frame.pack();//sets the size of frame to meet the size of the components in it

}
}