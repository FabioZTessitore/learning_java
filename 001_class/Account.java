// Account.java

// A simple Bank Account in cents

class Account
{
  private int balance;

  public Account(int cents)
  {
    balance = cents;
  }

  public void credit(int cents)
  {
    balance += cents;
  }

  public void debit(int cents)
  {
    if (balance < cents) {
      System.out.println("Debit > Balance");
      return;
    }

    balance -= cents;
  }

  public int getBalance()
  {
    return balance;
  }

  public String displayBalance()
  {
    String message;

    message = String.format("Balance: $%d.%02d", balance / 100, balance % 100);

    return message;
  }
}
