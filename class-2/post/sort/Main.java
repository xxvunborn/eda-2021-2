import java.util.*;
import java.lang.*;

public class Main {
  public static void main(String[] args) {
    ArraySort array = new ArraySort();
    array.generator();
    array.print();
    array.bubbleSort();
    array.print();
  }
}
