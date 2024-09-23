import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
public class Mfilechooser extends JFrame implements ActionListener{
    JButton button;
    Mfilechooser(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(new FlowLayout());
        button = new JButton("select file");
        button.addActionListener(this);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button){
            //gui component that allows a user to select a file
            JFileChooser fileChooser = new JFileChooser();
            //get's the current folder/directory you are working on
            fileChooser.setCurrentDirectory(new File("."));
            // int response = fileChooser.showOpenDialog(null);//select file to open
            int response = fileChooser.showSaveDialog(null);//show file to save

            //approve a value if a user accepts
            if(response==JFileChooser.APPROVE_OPTION){
                //get's the file path of the file selected
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }

        }
    }
}