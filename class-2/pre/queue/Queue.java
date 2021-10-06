import java.util.*;
import java.lang.*;

public class Queue {
  private ArraySort array;

  public Queue(ArraySort a) {
    array = a;
  }

  public int dequeue() {
    int value;
    value = array.get().get(0);
    array.get().remove(0);

    return value;
  }
}
