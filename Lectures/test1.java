package Lectures;
import javax.swing.*;;

public class test1 {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "CSC142");
        String name = JOptionPane.showInputDialog("Please enter your name...");
        JOptionPane.showMessageDialog(null, name);
        
        System.exit(0); //If you use JoptitionPane always end with system exit 0.
    }
}
