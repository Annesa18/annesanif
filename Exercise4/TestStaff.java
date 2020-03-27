package teststaff;
/**
 *
 * @author nurul annesa
 */
import java.util.Scanner;
public class TestStaff {

    public static void main(String[] args) {
        
      String nm,id;
      int wDay;
      Scanner console = new Scanner(System.in);
      Staff s = new Staff ();
      
      System.out.println("Enter your Staff name:");
      nm = console.next();
      System.out.println("Enter your Staff ID:");
      id = console.next();
      System.out.println("Enter your Staff working perDay:");
      wDay = console.nextInt();
      
      //display staff info
        s.setStaff(nm, id, wDay);
        s.calculateSalary();
         System.out.println("---Staff Info---");
         System.out.println("Staff Name: " + s.getName());
         System.out.println("Staff ID: " + s.getStaffID());
         System.out.println("Staff salary of working per day:" + "RM" + s.getSalary());
         System.out.println("-----------------");
   }//end main
}

 class Staff {
    private String name;
    private int  workingDay;
    private String staffID;
    private double calculateSalary;
    private double Salary;
    private double salary;
    
    public void setStaff(String nm,String id,int wDay) {
        name= nm;
        staffID = id;
        workingDay = wDay;
    }
    
    public void setName(String nm){
        name = nm;
    }
    
    public String getName() {
        return name;
    }

    public void setWorkingDay(int wDay){
        workingDay = wDay;
    }
    
    public int getWorkingDay() {
        return workingDay;
    }
    
    public void setStaffID(String id){
        staffID = id;
    }
    
    public String getStaffID() {
        return staffID;
    }

    public double getSalary() {
        return salary;
    }
    
    public double calculateSalary() {
        salary = workingDay * 35.00;
        return salary;
    }

}


      
      
      
