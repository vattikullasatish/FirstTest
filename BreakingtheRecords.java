
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingtheRecords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0,j=0; score_i < n; score_i++,j++){
            score[score_i] = in.nextInt();
             }
    //    System.out.println(Arrays.toString(score));
     //   System.out.println(Arrays.toString(higestScore));
        
        int lowestScoreFlag = 0;
        int highestScoreFlag = 0;
       int compareHighVal = 0;
       int compareLowVal = 0;
        for(int i=0,j=1; i < n-1 ; i++,j++)
        {
        	if(i==0)
        	{
        		compareHighVal = score[i];
        		compareLowVal = score[i];
      //  		System.out.println("compareHighVal:" + compareHighVal);
      //  		System.out.println("compareLowVal:" + compareLowVal);
       // 	highestScoreFlag++;
        	}
        	if(score[j]> compareHighVal && score[j]> 0 )//score[j]> score[i] && 
        	{
        		compareHighVal = score[j];
        //		System.out.println("compareHighVal:" + compareHighVal);
        //		System.out.println("HV" +score[j]);
        		highestScoreFlag++;
             }
        	else if(score[j]>= score[i])
        	{
        		//do nothing
        	}
        	else if(score[j]< compareLowVal && score[j]> 0)
        	{
        		compareLowVal = score[j];
        	//	System.out.println("compareLowVal:" + compareLowVal);
        	//	System.out.println("LV" +score[j]);
        		lowestScoreFlag++;
        	}
        
        }
        System.out.print(highestScoreFlag + " ");
        System.out.print(lowestScoreFlag);
        
    }

}