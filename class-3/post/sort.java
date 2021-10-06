public class sort {
  private Integer[] array;

  public sort(Integer[] sequence) {
    array = sequence;
  }

  public void bubbleSort() {
    int temp;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - 1; j++) {
        if (array[j] > array[j + 1]) {
          temp = array[j + 1];
          array[j + 1] = array[j];
          array[j] = temp;
        }
      }
    }
  }

  public void print() {
    for (Integer x : array) {
      System.out.print(x + " ");
    }
    System.out.println(" ");
  }
}
