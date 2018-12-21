// AccountTest

// Test the Account class

import javax.swing.JOptionPane;

public class AccountTest
{
  public static void main(String[] args)
  {
    Account account = new Account(100000);  // $1000.00

    JOptionPane.showMessageDialog(null, "Initial Balance:\n\n" + account.displayBalance());

    String credit = JOptionPane.showInputDialog(null, "Credit Amount (in cents):");
    int creditAmount = Integer.parseInt(credit);
    account.credit(creditAmount);
    JOptionPane.showMessageDialog(null, "Balance after credit:\n\n" + account.displayBalance());

    String debit = JOptionPane.showInputDialog(null, "Debit Amount (in cents):");
    int debitAmount = Integer.parseInt(debit);
    account.debit(debitAmount);
    JOptionPane.showMessageDialog(null, "Balance after debit:\n\n" + account.displayBalance());

    System.exit(0);
  }
}
