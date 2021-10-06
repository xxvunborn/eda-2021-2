// TODO:
// 1 - Fibonnaci recursivo  x 
// 2 - Fibonnaci desordenado x
// 3 - guardar de manera desordenada el resultado de fibonnaci en un archivo x
// 4 - Leer desde un archivo x
// 5 - Ordenar los numeros guardados en el archivo  x

import java.util.*;
import java.lang.*;
import java.io.*;

public class main {
  public static void main(String[] args) {
    fibonnaci fib = new fibonnaci(15);
    fib.generate(14);
    fib.print();
    fib.unsort();
    fib.printUnsort();

    files f = new files();

    f.store("fibonnaci.txt", fib.unsortedSequence);

    Integer[] sequence = f.read("fibonnaci.txt", 15);

    sort s = new sort(sequence);
    s.bubbleSort();
    s.print();
  }
}
