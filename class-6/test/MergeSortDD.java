import java.util.*;
import java.lang.*;

public class MergeSort {
  private ArrayList<Integer> array;
  private int comparisons;

  public MergeSort() {
    comparisons = 0;
    array = new ArrayList<Integer>();
  }

  private void merge(int start, int middle, int end) {
    int n1 = middle - start + 1;
    int n2 = end - middle;

    ArrayList<Integer> leftArray = new ArrayList<Integer>();
    ArrayList<Integer> rightArray = new ArrayList<Integer>();

    for (int i = 0; i < n1; i++) {
      leftArray.add(array.get(start + i));
    }
    for (int j = 0; j < n2; j++) {
      rightArray.add(array.get(middle + 1 + j));
    }
    int i = 0, j = 0;
    int k = start;
    while (i < n1 && j < n2) {
      comparisons++;
      if (leftArray.get(i) < rightArray.get(j)) {
        array.set(k, leftArray.get(i));
        i++;
      } else {
        array.set(k, rightArray.get(j));
        j++;
      }
      k++;
    }
    while (i < n1) {
      array.set(k, leftArray.get(i));
      i++;
      k++;
    }
    while (j < n2) {
      array.set(k, rightArray.get(j));
      j++;
      k++;
    }
  }

  public ArrayList<Integer> Msort(ArrayList<Integer> array) {
    this.array = array;
    Msort1(0, this.array.size() - 1);
    return this.array;
  }

  private void Msort1(int start, int end) {
    if (start < end) {
      int middle = (start + end) / 2;
      Msort1(start, middle);
      Msort1(middle + 1, end);
      merge(start, middle, end);
    }
  }

  public int comp() {
    return comparisons;
  }

  public void c_reset() {
    comparisons = 0;
  }
}
