/* Temperature.java */

// Convert Fahrenheit to Celsius by a method (static)

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Temperature {

  public static void main(String args[]) {
    double fahrenheit, celsius;
    String fahrenheitString;
    DecimalFormat twoDigits = new DecimalFormat("0.00");

    // input
    fahrenheitString = JOptionPane.showInputDialog("Fahrenheit Temp:");

    // cast
    fahrenheit = Double.parseDouble(fahrenheitString);

    // convert
    celsius = fahrenheitToCelsius(fahrenheit);

    // output
    JOptionPane.showMessageDialog(
        null,               // parent
        String.format("%s F = %s C", twoDigits.format(fahrenheit), twoDigits.format(celsius)),
        "Fahrenheit To Celsius",
        JOptionPane.INFORMATION_MESSAGE
    );

    System.exit(0);
  }

  public static double fahrenheitToCelsius(double t) {
    return 5./9. * (t - 32.);
  }

}
