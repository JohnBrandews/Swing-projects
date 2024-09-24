import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Mkeylistener extends JFrame implements KeyListener {
    JLabel label;
    Mkeylistener(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.addKeyListener(this);
        label = new JLabel();
        label.setBounds(0, 0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        this.add(label);
        // this.pack();    
        this.setVisible(true);
    }
    public void keyTyped(KeyEvent e){
        //it's invoked when a key is typed . uses keyChar,char Output
        switch (e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-10, label.getY());   
                break;
            case 'w': label.setLocation(label.getX(), label.getY()-10);          
                break;
            case 's': label.setLocation(label.getX(), label.getY()+10);   
            break;
            case 'd': label.setLocation(label.getX()+10, label.getY());   

        }
        

    }
    public void keyPressed(KeyEvent e){
        //it's invoked when a physical key is pressed down.uses KeyCode.int output
        switch (e.getKeyCode()) {
            case 37: label.setLocation(label.getX()-10, label.getY());   
                break;
            case 38: label.setLocation(label.getX(), label.getY()-10);          
                break;
            case 39: label.setLocation(label.getX()+10, label.getY());   
               break;
            case 40: label.setLocation(label.getX(), label.getY()+10);   

        }
    }
    public void keyReleased(KeyEvent e){

    }
}