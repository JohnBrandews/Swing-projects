import java.awt.*;
import javax.swing.*;
public class Mprogressbar{
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();
    Mprogressbar(){
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        //set's a percentage on the bar such that it will increase when the bar is filled
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD,25));
        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
        fill();
    }
    public void fill() {
        int counter = 0;
        while(counter <= 100) {
            bar.setValue(counter);
            try{
                //thread pauses the execution every 100 milliseconds
                Thread.sleep(100);
                //wrapped in a try catch block since thread can throw  an error/ exception
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            counter +=1;
            }
            bar.setString("Done!:");
        }
    }
