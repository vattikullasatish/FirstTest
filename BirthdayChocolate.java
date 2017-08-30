import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayChocolate {

//    static int getWays(int[] squares, int d, int m){
//        // Complete this function
//    	return 3;
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = 1;//in.nextInt();
        System.out.println("months" + m);
        int[] result = new int[n-1];
        int counter = 0;
        for(int i=0,j=1,month = 1; i < n ; i++,j++,month++)
        {
        	System.out.println(s[i]);
        	if(m == 1)
        	{
        		result[i] = s[i];
        		System.out.println("sfsdfsff");
        	}
        	else if(m ==2)
        	{
        		result[i] = s[i]+s[j];	
        	}
        	else if(m ==3)
        	{
        		result[i] = s[i]+s[month];	
        	}
        	else if(m ==1)
        	{
        		result[i] = s[i]+s[j];	
        	}
        		
        	
        	
        	if(result[i] == d)
        	{
        		counter++;
        	}
            
        }
        
        System.out.println(Arrays.toString(result));
        System.out.println(counter);
       // int result = getWays(s, d, m);
       /* if it contains m consecutive squares whose integers sum to d .
        * m--month
        * d-date
        * n--piece of chocolate
        * s---numbers on chocolate
        * 5
		  1 2 1 3 2 
		  3 2
        * 
        * add only 2(m) values and this sum should be 3 date(d) value
        * 1+2 = 3
        * 2+1 = 3
        * 1+3 = 4
        * 3+2 = 5
        * 
        * 
        * test case 2
        * 6
		  1 1 1 1 1 1
		  3 2
		  add consecutive elements
		  1+1 =2
		  1+1 =2
		  1+1 =2
		  1+1 =2
		  test case 3:
		  1
		  4
		  4 1
	    * only one element
	    * 4 =4 so 1 
        * 
        *  for(int i=0,j=1; i < n && j<n-1; i++,j++)
        {
        	for(int months = 0 ; months < m ;months++ )
        	{
        		result[i] = s[i]+s[months];	
        	}
        	
        	
        	if(result[i] == d)
        	{
        		counter++;
        	}
            
        }
        * 
        */
        System.out.println("result");
    }
}
