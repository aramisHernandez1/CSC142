package Day1;
import javax.swing.JOptionPane;

public class CalcAverage {

    public static void main(String[] args) {
        
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter your first number..."));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter Your second number...."));

        double average = (num1 + num2)/2;
        JOptionPane.showMessageDialog(null, average);
    }
    
}
