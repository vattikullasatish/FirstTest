
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Apple_Orange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();//houseStartPoint
        int t = in.nextInt();//houseEndPoint
        int a = in.nextInt();//appleTreePosition
        int b = in.nextInt();//orangeTreePosition
        int m = in.nextInt();//totalNoOfApples
        int n = in.nextInt();//totalNoOfOranges
        int[] apple = new int[m];
        int appleFall = 0;
        int appleFallCounter = 0;
        
        int orangeFall = 0;
        int orangeFallCounter = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
          appleFall = a+apple[apple_i];
            if(appleFall >= s && appleFall <= t)
            {
            	appleFallCounter++;
            	
            }
        }
        
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            orangeFall = b + orange[orange_i];
            if(orangeFall <= t && orangeFall >= s)
            {
            	orangeFallCounter++;
            	
            }
        }
        in.close();
        System.out.println(appleFallCounter);
        System.out.println(orangeFallCounter);
        
    }
}
