// Dice.java

// Array and Random number

import java.util.Random;

public class Dice
{
  private static final int FACES = 6;
  private static Random random;

  public static void main(String[] args)
  {
    int result[] = new int[FACES];
    int i;
    int total = 0;
    final int n = 30000;
    random = new Random();

    init(result);

    simulate(result, n);

    System.out.println("  F     Occurrence");
    for (i = 0; i < result.length; i++) {
      System.out.printf("%3d%15d\n", i+1, result[i]);
    }

    for (int item : result) total += item;
    System.out.printf("# of throws: %d\n", total);
  }

  private static void init(int[] result)
  {
    int i;

    for (i = 0; i < result.length; i++) result[i] = 0;
  }

  private static void simulate(int[] result, int n)
  {
    int i;

    for (i = 0; i < n; i++) {
      result[random.nextInt(FACES)]++;
    }
  }
}
