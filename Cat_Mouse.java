
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Cat_Mouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int positionOfX = 0;
        int positionOfY = 0;
        int positionOfZ = 0;
        int[] distanceFromXtoZ = new int[q];
        int[] distanceFromYtoZ = new int[q];
        
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            distanceFromXtoZ[a0] = Math.abs(z - x);
            distanceFromYtoZ[a0] = Math.abs(z - y);
            
            if(distanceFromXtoZ[a0] < distanceFromYtoZ[a0])
            {
            	System.out.println("Cat A");
            }
            else if(distanceFromXtoZ[a0] > distanceFromYtoZ[a0])
            {
            	System.out.println("Cat B");
            }
            else if(distanceFromXtoZ[a0] == distanceFromYtoZ[a0])
            {
            	System.out.println("Mouse C");
            }
           
        }
        //System.out.print("distanceFromXtoZ: ");
        //System.out.print(Arrays.toString(distanceFromXtoZ));
        System.out.println(" ");
        System.out.print("distanceFromYtoZ: ");
        System.out.print(Arrays.toString(distanceFromYtoZ));
        /* check the position of z
         * distance between x and z
         * distance between y and z
         * 
         * 
         */
    }
}

