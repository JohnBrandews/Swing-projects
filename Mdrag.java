import java.awt.*;
import javax .swing.*;
public class Mdrag extends JFrame{
    Mdragpanel dragpanel = new Mdragpanel();
    Mdrag(){ 
        this.add(dragpanel);
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}