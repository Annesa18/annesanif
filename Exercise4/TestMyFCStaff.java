package testmyfcstaff;
/**
 *
 * @author nurul annesa
 */
import java.util.Scanner;
public class TestMyFCStaff {

    private static double salary;
    private static double sales;

    public static void main(String[] args) {
        String name,staffID;
        int hourWorks;
        MyFCStaff fc = new MyFCStaff ();
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter your staff name: ");
        name = in.next();
        System.out.println("Enter your staff ID:");
        staffID = in.next();
        System.out.println("Enter your staff sales:");
        sales = in.nextDouble();
        System.out.println("Enter your hour works:");
        hourWorks = in.nextInt();
     
        fc.setStaff(name,staffID,hourWorks,sales,salary);
        fc.calculateSalary();
        fc.calculateCommission();
        fc.displaySalary();
    }
}

 class MyFCStaff {
    private String name,staffID;
    private int totalHourWorks;
    private double sales,salary,commission,totalSales;
  
    public void setStaff(String nm,String id,int hWorks,double  sales,double salary){
        name = nm;
        staffID = id;
        totalHourWorks = hWorks;
        this.sales = sales;
        this.salary = salary;
    }
    
    public void setName(String nm){
        name = nm;
    }
    
    public void setStaffID(String id){
         staffID = id;
    }
    public void setHourWorks(int hWorks){
        totalHourWorks = hWorks;
    }
   
    public String getName() {
        return name;
    }
    
    public String getStaffID(){
        return staffID;
    }
    
    public int getTotalHourWorks() {
        return totalHourWorks;
    }
    
    public void calculateSalary() {
        salary = (totalHourWorks * 8 ) + commission;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void calculateCommission() {
        if (sales >= 150 && sales <= 300)
            commission =(int) sales * 0.05;
        else if (sales >= 301 && sales <= 500)
            commission = (int)sales * 0.1;
        else if (sales > 500)
            commission = (int)sales * 0.15;
        else commission = 0;
    }
    
    public double getTotalSales(){
        return commission;
    }
    
    public void displaySalary(){
        System.out.println("-----Staff-------");
        System.out.println("Staff Name : " + name);
        System.out.println("StaffID : " + staffID);
        System.out.println("Hours Work : " + totalHourWorks);
        System.out.println("Total sales : " + "RM" + commission);
        System.out.println("Total Salary : " + "RM" +salary);
        System.out.println("------------------");
        
    }
}