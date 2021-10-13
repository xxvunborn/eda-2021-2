import java.util.*;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    Integer[] array = { 1, 4, 5, 6, 8, 2, 3, 10 };
    String[] arrayS = { "zz", "aa", "ee", "rr", "jj" };
    System.out.println(Arrays.toString(arrayS));
    Merge m = new Merge();

    Comparable[] aa = m.sort(arrayS);

    System.out.println(Arrays.toString(aa));

  }
}
