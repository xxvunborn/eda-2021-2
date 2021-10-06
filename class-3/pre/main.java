// TODO:
// 1 - Fibonnaci recursivo 
// 2 - guardar de manera desordenada el resultado de fibonnaci 
// 3 - Guardar en un archivo
// 4 - Leer desde un archivo
// 5 - Ordenar los numeros guardados en el archivo 

import java.util.*;
import java.lang.*;
import java.io.*;

public class main {
  public static void main(String[] args) {
    fibonnaci fib = new fibonnaci(15);
    fib.generate(14);
    fib.unsort();

    files f = new files();

    f.store("fibonnaci.txt", fib.unsortedSequence);

    Integer[] sequense = f.read("fibonnaci.txt", 15);

    sort s = new sort(sequense);
    s.bubbleSort();

    s.print();
  }
}
