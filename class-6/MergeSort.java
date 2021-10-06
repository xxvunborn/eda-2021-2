import java.util.*;
import java.lang.*;

class MergeSort {
    public ArrayList<Integer> sorted;


  void mergeSort(ArrayList<Integer> array, int start, int end) {
    if (start < end) {
      int middle = (start + end) / 2;
      mergeSort(array, start, middle);
      mergeSort(array, middle + 1, end);

      merge(array, start, middle, end);
    }
  }

  void merge(ArrayList<Integer> array, int start, int middle, int end) {
    ArrayList<Integer> leftArray = new ArrayList<Integer>();
    ArrayList<Integer> rightArray = new ArrayList<Integer>();

    int n1 = middle - start +1;
    int n2 = end - middle -1 ;
    for (int i = 0; i < n1; ++i) {
      leftArray.add(array.get(start + i));
    }

    for (int j = 0; j < n2; ++j) {
      System.out.println(array.get(middle + 1 + j));
      rightArray.add(array.get(middle + 1 + j));
    }

    int leftIndex = 0;
    int rightIndex = 0;
    int currentIndex = start;

    while (leftIndex < n1 && rightIndex < n2) {
      if (leftArray.get(leftIndex) < rightArray.get(rightIndex)) {
        array.set(currentIndex, leftArray.get(leftIndex));
        leftIndex++;
      } else {
        array.set(currentIndex, rightArray.get(rightIndex));
      }
      currentIndex++;
    }

    //while (leftIndex < n1) {
      //array.set(currentIndex, leftArray.get(leftIndex));
      //currentIndex++;
      //leftIndex++;
    //}

    //while (rightIndex < n2) {
      //array.set(currentIndex, rightArray.get(rightIndex));
      //currentIndex++;
      //rightIndex++;
    //}
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
    MergeSort ms = new MergeSort();
    ms.mergeSort(array, 0, array.size());

    System.out.println(" ");
    for (Integer x : ms.sorted) {
      System.out.print(x + " ");
    }
  }
}
