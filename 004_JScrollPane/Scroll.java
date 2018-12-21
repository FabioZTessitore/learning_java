/* Scroll.java */

// Use a JScrollPane to encapsulate a JTextArea

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Scroll {

  public static void main(String args[]) {

    JTextArea outputArea = new JTextArea(11, 20);
    JScrollPane scroller = new JScrollPane(outputArea);

    int i;

    for (i = 0; i < 100; i++) {
      outputArea.append("Message #" + i + "\n");
    }

    JOptionPane.showMessageDialog(
        null,                       // parent
        scroller,
        "Scroll",                   // title
        JOptionPane.PLAIN_MESSAGE
    );

    // required when using swing
    System.exit(0);
  }

}
