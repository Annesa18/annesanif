//assumes java.util.Scanner is imported
//assumes java.util.concurrent.ThreadLocalRandom is imported
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class Random{ // to show Random class
   public static void main (String []args){ //main method
      Scanner in = new Scanner (System.in); 
      int first,second;  
      int count =0;  
      
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
  }//end main
  }//end class
         
