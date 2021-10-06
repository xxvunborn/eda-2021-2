import java.util.*;
import java.lang.*;
import java.io.*;

public class fibonnaci {
  private Integer[] sequence;
  public Integer[] unsortedSequence;

  public fibonnaci(int n) {
    sequence = new Integer[n];
    unsortedSequence = new Integer[n];
  }

  public void generate(int n) {
    if (n == 0 || n == 1) {
      sequence[n] = 1;
    } else {
      generate(n - 2);
      generate(n - 1);
      sequence[n] = sequence[n - 2] + sequence[n - 1];
    }
  }

  public void unsort() {
    int i = 0, j = 0;
    boolean[] checked = new boolean[sequence.length];
    Random rGenerator = new Random();
    for (i = 0; i < checked.length; i++) {
      checked[i] = false;
    }
    i = 0;
    while (i < unsortedSequence.length) {
      do {
        j = rGenerator.nextInt(sequence.length);
      } while ((j == i) || checked[j]);
      unsortedSequence[i] = sequence[j];
      checked[j] = true;
      i++;
    }
  }

  public void print() {
    for (Integer x : sequence) {
      System.out.print(x + " ");
    }
    System.out.println(" ");
  }
}
