import java.util.*;
import java.lang.*;
import java.io.*;

public class files {
  public Integer[] read(String filename, int n) {
    Integer[] sequence;
    sequence = new Integer[n];

    try {
      FileReader file = new FileReader(filename);
      BufferedReader reader = new BufferedReader(file);
      int i = 0;

      String sInput = reader.readLine();
      Integer input = Integer.parseInt(sInput);
      sequence[i] = input;
      i++;

      while (input != null && i < sequence.length) {
        sInput = reader.readLine();
        sequence[i] = Integer.parseInt(sInput);
        i++;
      }

      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return sequence;
  }

  public void store(String filename, Integer[] sequence) {
    try {
      FileWriter file = new FileWriter(filename, false);
      BufferedWriter writer = new BufferedWriter(file);

      for (Integer x : sequence) {
        writer.write(x.toString());
        writer.write("\n");
      }
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
