import java.awt.*;
import javax .swing.*;
import javax.swing.AbstractAction;
import java.awt.event. ActionEvent;
public class Mbinding{
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    JFrame frame;
    JLabel label;
    Mbinding(){
 frame = new JFrame();
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(420,420);
 frame.setLayout(null);
 label = new JLabel();
 label.setBackground(Color.RED);
 label.setBounds(100,100,100,100);
 label.setOpaque(true);
 upAction = new UpAction();
 downAction = new DownAction();
 leftAction = new LeftAction();
 rightAction = new RightAction();
 label.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction");
 label.getActionMap().put("upAction",upAction);
 label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downAction");
 label.getActionMap().put("downAction",downAction);
 label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
 label.getActionMap().put("leftAction",leftAction);
 label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
 label.getActionMap().put("rightAction",rightAction);
 frame.add(label);
 frame.setVisible(true);
    }
    
    public class UpAction extends AbstractAction{
            public void actionPerformed(ActionEvent e) {
                label.setLocation(label.getX(), label.getY()-10);
            }
    }
    public class DownAction extends AbstractAction{
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()+10);

        }
}
public class LeftAction extends AbstractAction{
    public void actionPerformed(ActionEvent e) {
        label.setLocation(label.getX()-10, label.getY());

    }
}
public class RightAction extends AbstractAction{
    public void actionPerformed(ActionEvent e) {
        label.setLocation(label.getX()+10, label.getY());

    }
}
}