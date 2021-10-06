import java.util.*;
import java.lang.*;


public class mergeSorto {
  private ArrayList<Integer> array;
  private int comparisons;

  public mergeSorto(ArrayList<Integer> a) {
    comparisons = 0;
    array = a;
  }

  private void merge(int l, int m, int r) {
    int n1 = m - l + 1;
    int n2 = r - m;

    ArrayList<Integer> L = new ArrayList<Integer>();
    ArrayList<Integer> R = new ArrayList<Integer>();

    for (int i = 0; i < n1; i++) {
      L.add(array.get(l + i));
    }
    for (int j = 0; j < n2; j++) {
      R.add(array.get(m + 1 + j));
    }
    int i = 0, j = 0;
    int k = l;
    while (i < n1 && j < n2) {
      comparisons++;
      if (L.get(i) < R.get(j)) {
        array.set(k, L.get(i));
        i++;
      } else {
        array.set(k, R.get(j));
        j++;
      }
      k++;
    }
    while (i < n1) {
      array.set(k, L.get(i));
      i++;
      k++;
    }
    while (j < n2) {
      array.set(k, R.get(j));
      j++;
      k++;
    }
  }

  public ArrayList<Integer> Msort(ArrayList<Integer> array) {
    this.array = array;
    Msort1(0, this.array.size() - 1);
    return this.array;
  }

  private void Msort1(int l, int r) {
    if (l < r) {
      int m = (l + r) / 2;
      Msort1(l, m);
      Msort1(m + 1, r);
      merge(l, m, r);
    }
  }

  public int comp() {
    return comparisons;
  }

  public void c_reset() {
    comparisons = 0;
  }

  public static void main(String[] args) {
    ArrayList<Integer> array = new ArrayList<Integer>();
    Random generator = new Random();

    for (int i = 0; i < 10; i++) {
      array.add(i, (generator.nextInt() % 10));
    }

    for (Integer x : array) {
      System.out.print(x + " ");
    }
    mergeSort ms = new mergeSort(array);
    ms.Msort1(0, array.size());
  }
}
