import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
public class Mmenu extends JFrame  implements ActionListener {
    JMenuBar menuBar;
        JMenu fileMenu;
        JMenu editMenu;
        JMenu helpMenu;
        JMenuItem loadItem;
        JMenuItem saveItem;
        JMenuItem exitItem;
    Mmenu(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);
        menuBar = new JMenuBar();
         fileMenu = new JMenu("file");
        editMenu = new JMenu("edit");
         helpMenu = new JMenu("help");
        loadItem = new JMenuItem("load");
        saveItem = new JMenuItem("save");
        exitItem = new JMenuItem("exit");
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        //this creates keyboard shortcuts i.e when you press letter S on keyboard it saves
        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loadItem){
            System.out.println("you are loading an item");
        }
        else if(e.getSource() == saveItem){
            System.out.println("you are saving an item");
        }
        else if(e.getSource() == exitItem){
            //it exits the program
            System.exit(0);
        }
    }
}