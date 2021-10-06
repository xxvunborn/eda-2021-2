import java.util.*;
import java.lang.*;

class Main {
  public static void HelloWorld() {
    System.out.println("Hello World!");
  }

  public static void main(String[] args) {
    HelloWorld();

    rArray rand = new rArray();
    int where = 0;

    rand.generate();
    rand.print();

    if (rand.isPresent(9)) {
      System.out.println("9 está presente en el arreglo");
    } else {
      System.out.println("9 no está presente en el arrelo");
    }

    where = rand.find(9);

    if (where != -1) {
      System.out.println("El numero 9 está en la posición: " + where);
    } else {
      System.out.println("El numero 9 no existe en el arreglo ");
    }
  }
}
