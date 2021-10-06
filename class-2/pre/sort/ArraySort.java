import java.util.*;
import java.lang.*;

public class ArraySort {
  private ArrayList<Integer> array;
  private Random generator;

  public ArraySort() {
    generator = new Random();
    array = new ArrayList<Integer>();
  }

  public ArrayList<Integer> get() {
    return array;
  }

  public void set(ArrayList<Integer> arr) {
    array = arr;
  }

  public void generate() {
    for (int i = 0; i < 10; i++) {
      array.add(i, (generator.nextInt() % 20));
    }
  }

  public void print() {
    for (Integer x : array) {
      System.out.print(x + " ");
    }
    System.out.println("");
  }

  public void selectSort() {
    int i = 0, j = 0, min = array.get(0), min_index = 0, temp;
    for (i = 0; i < 10; i++) {
      min = array.get(i);
      min_index = i;
      for (j = i; j < 10; j++) {
        if (array.get(j) < min) {
          min = array.get(j);
          min_index = j;
        }
      }
      temp = array.get(i);
      array.set(i, array.get(min_index));
      array.set(min_index, temp);
    }
  }

  public void bubleSort() {
    int i = 0, j = 0, temp;
    for (i = 0; i < 10; i++) {
      for (j = 0; j < 9; j++) {
        if (array.get(j) > array.get(j + 1)) {
          temp = array.get(j + 1);
          array.set(j + 1, array.get(j)); // array[j+1] = array[j]
          array.set(j, temp);
        }
      }
    }
  }
}
