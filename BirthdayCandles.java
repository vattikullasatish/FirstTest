
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for(int height_i=0; height_i < n; height_i++)
        {
          //  height[height_i] = 
            list.add(in.nextInt());
        }
        Collections.sort(list);
       
        int occurrences = Collections.frequency(list,list.get(n-1));
        System.out.println(occurrences);
    }
}
