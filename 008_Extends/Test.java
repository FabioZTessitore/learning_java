/* Test.java */

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.DecimalFormat;

public class Test {

  public static void main(String args[]) {
    Employee ref;

    JTextArea outputTextArea = new JTextArea(3, 40);
    DecimalFormat twoDigits = new DecimalFormat("0.00");

    Boss boss = new Boss("John", "Smith", 800.0);
    CommissionWorker commWorker = new CommissionWorker("Sue", "Jones", 400.0, 3.0, 150);
    PieceWorker pieceWorker = new PieceWorker("Bob", "Lewis", 2.5, 200);

    ref = boss;
    outputTextArea.append(ref.toString() + " earned $" + twoDigits.format(ref.earnings()) + "\n");

    ref = commWorker;
    outputTextArea.append(ref.toString() + " earned $" + twoDigits.format(ref.earnings()) + "\n");

    ref = pieceWorker;
    outputTextArea.append(ref.toString() + " earned $" + twoDigits.format(ref.earnings()) + "\n");

    JOptionPane.showMessageDialog(null, outputTextArea, "Polymorphism", JOptionPane.INFORMATION_MESSAGE);

    System.exit(0);
  }

}
