//assumes java.util.Scanner is imported
//assumes java.util.concurrent.ThreadLocalRandom is imported
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class Random{ // to show Random class
   public static void main (String []args){ //main method
      Scanner in = new Scanner (System.in); //using scanner 
      int first,second;  //declare first and second are integer
      int count =0;  //declare count is integer and value is 0
      
      //input first and second number
      System.out.println("Enter the first number:");
      first=in.nextInt();
      System.out.println("Enter the second number:");
      second=in.nextInt();
      
      //display zero if first number greater than second
      if (first>second)
      {
         count =0; 
         }
       else {
         count = ThreadLocalRandom.current().nextInt(first-1,second+1);
         }
         
      //display random integer between first and second number   
      System.out.println("The random integer is:" + count);
  }
  }
         
      
   
      


/*import java.util.*;
public class Random{
public static void main (String []args){

   Scanner in = new Scanner (System.in);
   int []first = new int [data];
   int []second = new int [data];
   System.out.println("Enter the first number:");
   first =in.nextInt();
   System.out.println("Enter the second number:");
   second =in.nextInt();
   new RandomInRange(first,second);
   
  }//end main

public int randomInRange (int[] first, int[] second){
   int result = 0;
   random [] generator = new Random();
      if (first > second)
   {
      int range = first - (second + 1);
      result = generator.nextInt(range) + first;
   }
   return result;
 
  }
}//end class*/
