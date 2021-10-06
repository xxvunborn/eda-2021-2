import java.util.*;
import java.lang.*;

public class sArray {
  private ArrayList<Integer> array;
  private Random generator;

  public sArray() {
    generator = new Random();
    array = new ArrayList<Integer>();
  }

  public void generate(int n) {
    int i = 0;
    for (i = 0; i < n; i++) {
      array.add(i, (generator.nextInt() % 1000));
    }
  }

  public ArrayList<Integer> getArray() {
    return array;
  }

  public int selectSort() {
    int i = 0, j = 0, min = array.get(0), min_index = 0, temp, count_comp = 0;
    for (i = 0; i < array.size(); i++) {
      min = array.get(i);
      min_index = i;
      for (j = i; j < array.size(); j++) {
        count_comp++;
        if (array.get(j) < min) {
          min = array.get(j);
          min_index = j;
        }
      }
      temp = array.get(i);
      array.set(i, array.get(min_index));
      array.set(min_index, temp);
    }
    return count_comp;
  }

  public int bubbleSort() {
    int i = 0, j = 0, temp, count_comp = 0;
    for (i = 0; i < array.size(); i++) {
      for (j = 0; j < array.size() - 1; j++) {
        count_comp++;
        if (array.get(j) > array.get(j + 1)) {
          temp = array.get(j + 1);
          array.set(j + 1, array.get(j));
          array.set(j, temp);
        }
      }
    }
    return count_comp;
  }
}
