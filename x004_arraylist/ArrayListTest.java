// ArrayListTest.java

// ArrayList

import java.util.Random;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class ArrayListTest
{
  public static void main(String[] args)
  {
    ArrayList<Integer> items = new ArrayList<Integer>();
    int i;
    int n = 10;
    int k = 50;
    Random random = new Random();

    for (i = 0; i < n; i++) {
      items.add(random.nextInt(100));
    }

    System.out.println("Items:");
    for (i = 0; i < n; i++) {
      System.out.printf("%3d\n", items.get(i));
    }

    Collections.sort(items, new Comparator<Integer>() {
      public int compare(Integer i1, Integer i2) {
        return i1 - i2;
      }
    });
    System.out.println("Sorted Items:");
    for (i = 0; i < n; i++) {
      System.out.printf("%3d\n", items.get(i));
    }

    if (items.contains(k)) {
      int index = items.indexOf(k);
      System.out.printf("Item %d found at index %d\n", k, index);
    } else {
      System.out.printf("Item %d not found\n", k);
    }
  }
}
