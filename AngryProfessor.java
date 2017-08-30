
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class AngryProfessor {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();//number of test cases
        int onTimeCount = 0;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();//no of students
            int k = in.nextInt();//max students required
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();//arrival time
                if(a[a_i]<=0)
                {
                	onTimeCount++;
                }
               }
            if(k<=onTimeCount)
            {
            	System.out.println("NO");
            }
            else if(k>=onTimeCount)
            {
            	System.out.println("YES");
            }
            onTimeCount = 0;
            	
        }
        
    }
}
