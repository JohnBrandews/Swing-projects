import java.awt.*;
import javax .swing.*;
import java.awt.Graphics;
import java.awt.MouseAdapter;
import java.awt.MouseMotionAdapter;
import java.awt.Point;
public class Mdragpanel extends JPanel{
    ImageIcon image = new ImageIcon("download.jpeg");
    final int WIDTH = image.getIconWidth();
    final int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point prevPt;
    Mdragpanel(){

    }
    public void paintComponent (Graphics g) {

    }
    private class ClickListener extends MouseAdapter{

    }
    private class DragListener extends MouseMotionAdapter{

    }
}