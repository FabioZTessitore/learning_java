/* CommissionWorker.java */

// Classe derivata da Employee

public final class CommissionWorker extends Employee {

  // quota fissa
  private double salary;

  // paga per ogni pezzo venduto
  private double commission;

  private int quantity;

  CommissionWorker(String firstname, String lastname, double salary, double commission, int quantity) {
    super(firstname, lastname);

    setSalary(salary);
    setCommission(commission);
    setQuantity(quantity);
  }

  public void setSalary(double s) {
    salary = s > 0 ? s : 0;
  }

  public void setCommission(double c) {
    commission = c > 0 ? c : 0;
  }

  public void setQuantity(int q) {
    quantity = q > 0 ? q : 0;
  }

  public double earnings() {
    return salary + commission * quantity;
  }

  public String toString() {
    return "Commission Worker: " + super.toString();
  }

}
