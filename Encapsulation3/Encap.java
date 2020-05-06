package Encapsulation3;

import java.util.*;

public class Encap {
   
   public static void main(String []args){
   
   Scanner input = new Scanner(System.in);
   
   Student s = new Student(); 
   s.setName("nurul");
   s.setAge(18);
   
   String [] subj = new String[5];
   double [] cgpa = new double[5];
   for (int i=0; i<5; i++){
      System.out.print("Subject" + (i+1) +":");
      subj[i] = input.next();
      System.out.print("Cgpa:");
      cgpa[i] = input.nextDouble();

   }
   
   
   System.out.println("\n"+s.getName());
   System.out.println(s.getAge());
   for (int i=0; i<5; i++){
      System.out.println("Subject" + (i+1) +":"+ subj[i]);
      System.out.println("Cgpa:"+ cgpa[i]);
   }

      
   }
}