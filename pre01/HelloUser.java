import java.io.*;
import java.io.*;
import javax.swing.JOptionPane;

public class HelloUser {
  public static void main (String[] args){ 
  
    String numString;
    int num1 = 0;
    int num2 = 0;
    int answer = 0;

    numString = JOptionPane.showInputDialog("enter first number to be multiplied:");

    num1 = Integer.parseInt(numString);

    numString = JOptionPane.showInputDialog("enter second number to be multiplied:");

    num2 = Integer.parseInt(numString);

    answer = num1 * num2;

    JOptionPane.showMessageDialog(null, "" + Integer.toString(answer));
  }

}