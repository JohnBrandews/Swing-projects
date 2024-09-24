import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Mmouselistener extends JFrame implements MouseListener{
    JLabel label;
Mmouselistener(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    label = new JLabel();
    label.setBounds(0, 0,100,100);
    label.setBackground(Color.red);
    label.setOpaque(true);
    label.addMouseListener(this);
    this.add(label);
    this.setSize(500,500);
    this.setVisible(true);
}
public void  mouseClicked(MouseEvent e){
//invoked when a mouse button has been clicked on a component(pressed/released)
}
public void mousePressed(MouseEvent e){
//invoked when a mouse button has been pressed on a component
label.setBackground(Color.YELLOW);
}
public void mouseReleased(MouseEvent e){
//invoked when a mouse button has been released on a component
label.setBackground(Color.GREEN);

}
public void mouseEntered(MouseEvent e){
//invoked when a mouse button enters a component
// System.out.println("you entered the component");
label.setBackground(Color.BLUE);

}
public void mouseExited(MouseEvent e){
//invoked when a mouse button exits a component
label.setBackground(Color.RED);

}
}