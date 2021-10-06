import java.util.*;
import java.lang.*;

public class Main {
  public static void main(String[] args) {
    ArraySort a = new ArraySort();
    a.generate();
    a.selectSort();
    a.print();

    Queue q = new Queue(a);

    for (int i = 0; i < 10; i++) {
      System.out.println(i + ": " + q.dequeue());
    }
  }
}
