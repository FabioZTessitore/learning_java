/* Die.java */

// Roll a die

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Die {

  public static void main(String args[]) {
    JTextArea outputTextArea = new JTextArea(7, 20);
    int frequency[] = { -1, 0, 0, 0, 0, 0, 0 };   // index 0 unused
    int i;

    outputTextArea.append("Face\tFrequency\n");

    for (i = 0; i < 10000; i++) {
      frequency[ 1 + (int) (Math.random() * 6) ]++;
    }

    for (i = 1; i <= 6; i++) {
      outputTextArea.append("   " + i + "\t" + frequency[i] + "\n");
    }

    JOptionPane.showMessageDialog(
        null,             // parent
        outputTextArea,
        "Die Frequency",
        JOptionPane.PLAIN_MESSAGE
    );

    System.exit(0);
  }

}
