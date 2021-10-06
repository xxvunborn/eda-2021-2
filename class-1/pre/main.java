import java.util.*;
import java.lang.*;

class Main {
  public static void helloWorld() {
    System.out.println("hello World");
  }

  public static void main(String[] args) {
    helloWorld();

    rArray rand = new rArray();
    int where = 0;
    rand.generate();
    rand.print();

    if (rand.isPresent(9)) {
      System.out.println("9 Está presente");
    } else {
      System.out.println("9 no Está presente");
    }

    where = rand.find(9);
    if (where != -1) {
      System.out.println("9 esta en la posición: " + where);
    } else {
      System.out.println("9 no existe en el arreglo: ");
    }
  }
}
