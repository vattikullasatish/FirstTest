
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	 Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int itemAnnaNotConsumed = in.nextInt();
         int[] itemList = new int[n];
         int itemsEaten = 0;
         //System.out.println(itemAnnaNotConsumed);
         int itemAnnaNotConsumedVal = 0;
         for(int item_i=0; item_i < n; item_i++){
        	 itemList[item_i] = in.nextInt();
        	 
        	 itemsEaten +=itemList[item_i];
        	  
        	
         }
         itemAnnaNotConsumedVal = itemList[itemAnnaNotConsumed];
         System.out.println("itemsEaten"+itemsEaten); 
         int totalitemsEaten = itemsEaten - itemAnnaNotConsumedVal;
         System.out.println("totalitemsEaten"+totalitemsEaten); 
         int sharedAmount = 0;
         sharedAmount = in.nextInt();
         in.close();
        int differenceInAmount = 0;
        int divededAmount = totalitemsEaten/2;
        differenceInAmount = itemsEaten- sharedAmount ;
       
        System.out.println("sharedAmount"+sharedAmount);
        System.out.println("differenceInAmount"+differenceInAmount);
        System.out.println("divededAmount"+divededAmount);
        if(sharedAmount == divededAmount)
        {
        	System.out.println("Bon Appetit");
        }
        else
        {
        System.out.println(differenceInAmount-divededAmount);	
        }
         
         
    }
}