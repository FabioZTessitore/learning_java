/* Addition.java */

// Input text by a JOptionPane

import javax.swing.JOptionPane;

public class Addition {

  public static void main(String args[]) {

    int num1, num2;
    int sum = 0;

    String num1String, num2String;

    // input
    num1String = JOptionPane.showInputDialog("First Num:");
    num2String = JOptionPane.showInputDialog("Second Num:");

    // cast
    num1 = Integer.parseInt(num1String);
    num2 = Integer.parseInt(num2String);

    sum = num1 + num2;

    // output
    JOptionPane.showMessageDialog(
        null,                       // parent
        "The sum is " + sum,
        "Result",                   // title
        JOptionPane.PLAIN_MESSAGE
    );

    // required when using swing
    System.exit(0);
  }

}
