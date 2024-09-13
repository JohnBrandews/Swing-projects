import java.awt.*;
import javax .swing.*;
public class Main{
    public static void main(String[] args) {
        //the first method of creating frames
        // JFrame frame = new JFrame();
        // frame.setTitle("my window");
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setResizable(false); //determines if one can resize the window or not 
        // frame.setSize(420,420);
        // frame.setVisible(true);
        // ImageIcon image = new ImageIcon("image swing.jpg"); //create a new imageicon
        // frame.setIconImage(image.getImage()); //change icon of frame
        // // frame.getContentPane().setBackground(Color.blue); //set background color
        // frame.getContentPane().setBackground(new Color(0,255,255)); //imports color if does not exist
        //the second method is by creating a constructor in child class and calling it in the main
         new Mframe();
    }
}
