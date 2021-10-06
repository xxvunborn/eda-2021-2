import java.util.*;
import java.lang.*;
import java.io.*;

public class files {
  public Integer[] read(String filename, int n) {
    Integer[] sequense;
    sequense = new Integer[n];

    try {
      FileReader file = new FileReader(filename);
      BufferedReader reader = new BufferedReader(file);

      int i = 0;
      String sInput = reader.readLine();
      Integer input = Integer.parseInt(sInput);
      sequense[i] = input;
      i++;

      while (input != null && i < sequense.length) {
        String Input = reader.readLine();
        sequense[i] = Integer.parseInt(Input);
        i++;
      }

      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    return sequense;
  }

  public void store(String filename, Integer[] sequense) {
    try {
      FileWriter file = new FileWriter(filename, false);
      BufferedWriter writer = new BufferedWriter(file);

      for (Integer x : sequense) {
        writer.write(x.toString());
        writer.write("\n");
      }
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
