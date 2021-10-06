import java.util.*;
import java.lang.*;

public class main
{
    public static void main(String[] args) 
    {
        HashMap<ArrayList<Integer>, ArrayList<Integer> > h = new HashMap<ArrayList<Integer>, ArrayList<Integer> >();
        
        for(int i = 1; i < 10; i++)
        {
            sArray s = new sArray();
            int countS = 0, countB = 0;
            ArrayList<Integer> c_counts = new ArrayList<Integer>();
            s.generate(i);
            countS = s.selectSort();
            countB = s.bubbleSort();
            c_counts.add(Integer.valueOf(countS));
            c_counts.add(Integer.valueOf(countB));
            h.put(s.getArray(),c_counts);
        }
        
        h.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }
}

