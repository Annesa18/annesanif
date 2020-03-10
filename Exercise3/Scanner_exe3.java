import java.util.Scanner;
public class Scanner_exe3{
   public static void main (String []args){
   
      Scanner console =new Scanner (System.in);
      int x,y;
      System.out.println("Enter the value of x:");
      x = console.nextInt();
      
      System.out.println("Enter the value of y:");
      y = console.nextInt();
      
      System.out.println(" ");
      System.out.println((int)Math.pow(x,y));
      
    }
 }