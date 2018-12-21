// ArraysClass.java

// Arrays Class

import java.util.Random;
import java.util.Arrays;

public class ArraysClass
{
  public static void main(String[] args)
  {
    int items[] = new int[10];
    int i;
    int k = 50;
    Random random = new Random();

    for (i = 0; i < items.length; i++) {
      items[i] = random.nextInt(100);
    }

    System.out.println("Items:");
    for (int item : items) {
      System.out.printf("%3d\n", item);
    }

    Arrays.sort(items);

    System.out.println("Sorted Items:");
    for (int item : items) {
      System.out.printf("%3d\n", item);
    }

    int index = Arrays.binarySearch(items, k);
    if (index > 0) {
      System.out.printf("Item %d found at index %d\n", k, index);
    } else {
      System.out.printf("Item %d not found\n", k);
    }
  }
}
