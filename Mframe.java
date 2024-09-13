import java .awt.*;
import javax.swing.*;
public class Mframe extends JFrame{
Mframe(){
   
    this.setTitle("my window");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false); //determines if one can resize the window or not 
    this.setSize(420,420);
    this.setVisible(true);
    ImageIcon image = new ImageIcon("image swing.jpg"); //create a new imageicon
    this.setIconImage(image.getImage()); //change icon of this
    // this.getContentPane().setBackground(Color.blue); //set background color
    this.getContentPane().setBackground(new Color(0,128,128)); //imports color if does not exist

}
}