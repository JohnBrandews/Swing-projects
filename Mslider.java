import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.event.ChangeListener;
public class Mslider extends JFrame implements ChangeListener {
    JPanel panel;
    JSlider slider;
    JLabel label;
    Mslider(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(420,420);
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);//sets the min,max values and starting point
        slider.setPreferredSize(new Dimension(400,200));
        //sets the small painticks and the spaces between them
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        //sets the large painticks and the spaces between them
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25); 
        //makes  the tracks to be visible
        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.PLAIN, 15));
        label.setFont(new Font("MV Boli",Font.PLAIN, 15));

        //makes the slider in a vertical position
        slider.setOrientation(SwingConstants.VERTICAL);
        label.setText("°C =" + slider.getValue());
        slider.addChangeListener(this);
        panel.add(slider);
        panel.add(label);
        this.add(panel);
        this.pack();
        this.setVisible(true);

    }
    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C =" + slider.getValue());

    }
}