
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();//5
        int a1 = in.nextInt();//6
        int a2 = in.nextInt();//7
        int b0 = in.nextInt();//3
        int b1 = in.nextInt();//6
        int b2 = in.nextInt();//10
        int AliceCount = 0;
        int bobCount = 0;
        if (a0 > b0)
        {
        	AliceCount++;
        }
        if (a1 > b1)
        {
        	AliceCount++;
        }
        if (a2 > b2)
        {
        	AliceCount++;
        }
        if (b0 > a0)
        {
        	bobCount++;
        }
        if (b1 > a1)
        {
        	bobCount++;
        }
        if (b2 > a2)
        {
        	bobCount++;
        }
        
        System.out.println(AliceCount + " " + bobCount);
    }
}