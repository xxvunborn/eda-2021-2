import java.util.*;
import java.lang.*;

public class ArraySort {
  private ArrayList<Integer> array;
  private Random generator;

  public ArraySort() {
    generator = new Random();
    array = new ArrayList<Integer>();
  }

  public void generator() {
    for (int i = 0; i < 10; i++) {
      array.add(i, (generator.nextInt() % 20));
    }
  }

  public void print() {
    for (Integer x : array) {
      System.out.print(x + " ");
    }
    System.out.println(" ");
  }

  public void bubbleSort() {
    int temp;
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 9; j++) {
        if (array.get(j) > array.get(j + 1)) {
          temp = array.get(j + 1);
          array.set(j + 1, array.get(j)); // array[j+1] = array[j]
          array.set(j, temp);
        }
      }
    }
  }

}
