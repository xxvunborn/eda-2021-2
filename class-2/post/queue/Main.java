import java.util.*;
import java.lang.*;

public class Main {
  public static void main(String[] args) {
    ArraySort array = new ArraySort();
    array.generator();
    array.bubbleSort();
    array.print();

    Queue queue = new Queue(array);
    for (int i = 0; i < 10; i++) {
      System.out.println(i + ": " + queue.dequeue());
    }
  }
}
