/* Square.java */

// Use a JTextArea to display multiline text

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Square {

  public static void main(String args[]) {

    JTextArea outputArea = new JTextArea(11, 20);

    int i;

    outputArea.append("N\tSquare\n");

    for (i = 0; i < 10; i++) {
      outputArea.append(i + "\t" + i*i + "\n");
    }

    JOptionPane.showMessageDialog(
        null,                       // parent
        outputArea,
        "Square",                   // title
        JOptionPane.PLAIN_MESSAGE
    );

    // required when using swing
    System.exit(0);
  }

}
