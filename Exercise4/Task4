package testmyfcstaff;

import java.util.Scanner;
public class TestMyFCStaff_Question4{
    public static void main(String[] args) {
        String name,staffID;
        int hourWorks;
        double sales;
                
        Scanner in = new Scanner (System.in);
        System.out.println("Enter your staff name: ");
        name = in.next();
        System.out.println("Enter your staff ID:");
        staffID = in.next();
        System.out.println("Enter your staff sales:");
        sales = in.nextDouble();
        System.out.println("Enter your hour works:");
        hourWorks = in.nextInt();
        
        //create object
        MyFCStaff fc = new MyFCStaff (name,staffID,hourWorks,sales);
        //invoked method
        System.out.println(fc.toString());
        
    }
}

 class MyFCStaff {
   public class MyFCStaff {
     private String name,staffID;
    private int hourWorks;
    private double sales,commission,totalSales,totalSalary;
   
     //constructer
    public MyFCStaff(String nm,String id,int hWorks,double  sales){
        name = nm;
        staffID = id;
        hourWorks = hWorks;
        this.sales = sales;
    }
       
    public double calculateSalary() {
        totalSalary = (hourWorks * 8 ) + calculateCommission();
        return totalSalary;
    }
        
    public double calculateCommission() {
        if (sales >= 150 && sales <= 300){
            commission =(int) sales * 0.05;}
        else if (sales >= 301 && sales <= 500){
            commission = (int)sales * 0.1;}
        else if (sales > 500){
            commission = (int)sales * 0.15;}
        else {
            commission = 0;}
        
        return commission;
    }
    
    public String toString() { 
        return "Staff Name : " +name + " " +"\nStaffID : " + staffID + " " +"\nHours Work : " + hourWorks + " " +"\nTotal sales : " + "RM" + sales + " " +"\nTotal Salary : " + "RM" + calculateSalary(); 
    }  
 }
