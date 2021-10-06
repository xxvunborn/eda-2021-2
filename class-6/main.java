import java.util.*;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    Integer[] array = { 1, 4, 5, 6, 8, 2, 3, 10 };
    String[] arrays = { "pepito", "manuel", "ee", "rr" };
    System.out.println(Arrays.toString(arrays));
    Merge m = new Merge();

    Comparable[] aa = m.sort(arrays);

    System.out.println(Arrays.toString(aa));

  }
}
