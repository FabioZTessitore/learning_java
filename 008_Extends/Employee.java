/* Employee.java */

// Classe Astratta per la gestione degli impiegati

public abstract class Employee {

  private String firstname;
  private String lastname;

  public Employee(String first, String last) {
    firstname = first;
    lastname = last;
  }

  public String getFirstName() {
    return firstname;
  }

  public String getLastName() {
    return lastname;
  }

  public String toString() {
    return firstname + " " + lastname;
  }

  public abstract double earnings();

}
