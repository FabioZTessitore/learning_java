/* Welcome.java */

// Show text by a JOptionPane

import javax.swing.JOptionPane;

public class Welcome {

  public static void main(String args[]) {
    JOptionPane.showMessageDialog(
        null, // parent
        "Hello, World!"
    );

    // required when using swing
    System.exit(0);
  }

}
