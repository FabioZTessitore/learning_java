/* PieceWorker.java */

// Classe derivata da Employee

public final class PieceWorker extends Employee {

  // paga per ogni pezzo prodotto
  private double wagePerPiece;

  private int quantity;

  PieceWorker(String firstname, String lastname, double wage, int quantity) {
    super(firstname, lastname);

    setWage(wage);
    setQuantity(quantity);
  }

  public void setWage(double wage) {
    wagePerPiece = wage > 0 ? wage : 0;
  }

  public void setQuantity(int q) {
    quantity = q > 0 ? q : 0;
  }

  public double earnings() {
    return wagePerPiece * quantity;
  }

  public String toString() {
    return "Piece Worker: " + super.toString();
  }

}

