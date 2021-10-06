import java.util.*;
import java.lang.*;

public class rArray {
  private ArrayList<Integer> array;
  private Random generator;

  public rArray() {
    generator = new Random();
    array = new ArrayList<Integer>();
  }

  public void generate() {
    int i = 0;
    for (i = 0; i < 10; i++) {
      array.add(i, Math.abs(generator.nextInt() % 20));
    }
  }

  public void print() {
    for (Integer x : array) {
      System.out.println(x);
    }
  }

  public boolean isPresent(int n) {
    for (Integer x : array) {
      if (x == n) {
        return true;
      }
    }
    return false;
  }

  public int find(int n) {
    int i = 0;
    for (Integer x : array) {
      if (x == n) {
        return i;
      }
      i++;
    }

    return -1;
  }
}
