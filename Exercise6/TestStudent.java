package teststudent;

import java.util.*;
import java.lang.*;
public class TestStudent {  
public static void main (String [] args) {
    
	     Scanner input = new Scanner(System.in);
        //String matricNo;
	     //double test1,test2;
        
	     Student [] studDegree = new Student[3];
        String [] matricNo = new String [3];
        double [] test1 = new double [3];
        double [] test2 = new double [3];
        double [] averageMark = new double [3];
        
        //create object
        Student st = new Student ();
        
        for (int i=0; i<3; i++){
        System.out.print("\n\tEnter the matric no. :");
        matricNo [i] = input.next();
        System.out.print("\n\tEnter the test 1:");
        test1 [i] = input.nextDouble();
        System.out.print("\n\tEnter the test 2:");
        test2 [i]= input.nextDouble();
        averageMark [i]= (test1[i] + test2[i])/2;
        }
        
        System.out.println(" ");
        System.out.println("\t*******STUDENT INFORMATION*********");
        System.out.printf("\t%-10s%20s%n", "MATRIC NO.", "AVERAGE MARK");
        for(int i=0; i<3; i++){
        System.out.printf("\t%-10s%15.2f%n",matricNo[i],averageMark[i]);
                    
        st.getStudentInfo();
        st.calculateAverage();
        }
        
  }//end of main method
}//end of class TestStudent

 
 class Student{
	   //list of data members
      private String matricNo;
	   private double test1, test2, averageMark;
	
	   //constructor
	   public void Student(String matric, double ts1, double ts2 ){
		   matricNo = matric;
		   test1 = ts1;
		   test2 = ts2;	 
	   }
 
	   //method that returns some of students’ info
	   public String getStudentInfo(){
		   return "\t"+matricNo+"\t\t"+averageMark;
	   }
      
	   //method that calculates the average of 2 tests
        public void calculateAverage(){
		   averageMark = (test1 + test2)/2;
	   } 
        
 }//end of class Student

