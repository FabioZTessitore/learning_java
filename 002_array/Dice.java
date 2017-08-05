// Dice.java

// Array and Random number

import java.util.Random;

public class Dice
{
  public static void main(String[] args)
  {
    final int FACES = 6;
    int result[] = new int[FACES];
    int i;
    final int n = 30000;
    Random random = new Random();

    for (i = 0; i < result.length; i++) result[i] = 0;

    for (i = 0; i < n; i++) {
      result[random.nextInt(FACES)]++;
    }

    System.out.println("  F     Occurrence");
    for (i = 0; i < result.length; i++) {
      System.out.printf("%3d%15d\n", i+1, result[i]);
    }
  }
}
