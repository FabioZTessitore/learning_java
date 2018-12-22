/* Boss.java */

// Classe derivata da Employee

public final class Boss extends Employee {

  // stipendio settimanale fisso
  private double weeklySalary;

  Boss(String firstname, String lastname, double salary) {
    super(firstname, lastname);

    setWeeklySalary(salary);
  }

  public void setWeeklySalary(double salary) {
    weeklySalary = salary > 0 ? salary : 0;
  }

  public double earnings() {
    return weeklySalary;
  }

  public String toString() {
    return "Boss: " + super.toString();
  }

}
