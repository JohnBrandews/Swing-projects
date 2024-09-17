import java.awt.*;
import javax .swing.*;
public class PopUp{
    public static void main(String[] args) {
        //brings up a prompt or a dialog box depending on the type of message
        // JOptionPane.showMessageDialog(null,"a plain message","pop up",JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null,"a information message","pop up",JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null,"a seriously?","pop up",JOptionPane.QUESTION_MESSAGE);
        // while(true) {
        // JOptionPane.showMessageDialog(null,"ayou have a virus","pop up",JOptionPane.WARNING_MESSAGE);
            
        // }
        // JOptionPane.showMessageDialog(null,"a you need support now !!","pop up",JOptionPane.ERROR_MESSAGE);
//it brings up a dialog box which acts like a user's response
        // JOptionPane.showConfirmDialog(null,"hello","prompt",JOptionPane.YES_NO_CANCEL_OPTION);
        //it provides a prompt that allows the user a user  to enter details
        String name=  JOptionPane.showInputDialog("what is your name?");
        System.out.println(name);
       
    }
}