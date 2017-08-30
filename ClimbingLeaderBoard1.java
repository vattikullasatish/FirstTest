
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ClimbingLeaderBoard1 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TreeSet<Integer> myTreeSet = new TreeSet<>();
        for(int scores_i=0; scores_i < n; scores_i++){
           	myTreeSet.add(in.nextInt());
        }
        String flag = "";
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m&&(flag == "" || flag == "true"); alice_i++){
            alice[alice_i] = in.nextInt();
       // }
     
      //  in.close();
     //   }
        
   
     //   Collections.sort(list1);
        //System.out.println("alice ranks in ascending order"+list1);
      
       // for(int alice_i=0; alice_i < m; alice_i++){
        myTreeSet.add(alice[alice_i]);
            int z = myTreeSet.size();
	        ArrayList<Integer> list1 = new ArrayList<>(myTreeSet);
	        int a1[] = new int[z];
        for(int a = 0; a<z&&(flag == "" || flag == "true") ;a++)
        {
        	//System.out.println("a value"+a);
        a1[a] = list1.get(a);	
        if(a1[a] == alice[alice_i])
        {
        	//System.out.println("a value equals"+a);
        	System.out.println(z-a);
        	flag = "true";
            break;
        }
//        else
//        {
//        	System.out.println("a value removed"+a);
//        	list1.remove(a);
//        }
        }
        
        
      //  System.out.println(Arrays.toString(a1));
        }
        
        // your code goes here
        /*7---n
		  100 100 50 40 40 20 10scores[scores_i]
		  4---m
			5 25 50 120----alice[alice_i]
          */
        long endTime = System.nanoTime();
        System.out.println("Took "+(endTime - startTime) + " ns");
      
    }
}