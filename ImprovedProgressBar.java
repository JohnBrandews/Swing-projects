import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImprovedProgressBar extends JFrame {
    private JProgressBar bar;
    private Timer timer;
    private int counter = 0;

    public ImprovedProgressBar() {
        setTitle("Improved Progress Bar");
        setSize(420, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        bar = new JProgressBar(0, 100);
        bar.setValue(0);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setPreferredSize(new Dimension(380, 50));

        add(bar);

        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (counter <= 100) {
                    bar.setValue(counter);
                    counter++;
                } else {
                    ((Timer)e.getSource()).stop();
                    bar.setString("Done!");
                }
            }
        });

        setVisible(true);
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ImprovedProgressBar::new);
    }
}