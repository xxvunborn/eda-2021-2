import java.util.ArrayList;

public class mergeSort {
  private int comparisons;
  private ArrayList<Integer> array;

  public mergeSort() {
    // comparisons = 0;
    array = new ArrayList<Integer>();
  }

  private void merge(int left, int middle, int right) {
    int n1 = middle - left + 1;
    int n2 = right - middle;

    ArrayList<Integer> L = new ArrayList<Integer>();
    ArrayList<Integer> R = new ArrayList<Integer>();

    for (int i = 0; i < n1; i++) {
      L.add(array.get(left + 1));
    }

    for (int j = 0; j < n2; j++) {
      R.add(array.get(middle + 1 + j));
    }

    int i = 0, j = 0;
    int k = left;

    while (i < n1 && j < n2) {
      // comparisons++;
      if (L.get(i) < R.get(j)) {
        array.set(k, L.get(i));
        i++;
      } else {
        array.set(k, R.get(j));
      }
      k++;
    }

    while (i < n1) {
      array.set(k, L.get(i));
      i++;
      k++;
    }

    while (k < n2) {
      array.set(k, R.get(j));
      j++;
      k++;
    }
  }

  public ArrayList<Integer> sort(ArrayList<Integer> array) {
    this.array = array;
    mergesort(0, this.array.size() - 1);
    return this.array;
  }

  private void mergesort(int left, int right) {
    if (left < right) {
      int middle = (left + right) / 2;
      mergesort(left, middle);
      mergesort(middle, right);
      merge(left, middle, right);
    }
  }
}
