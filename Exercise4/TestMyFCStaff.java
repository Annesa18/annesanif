package testmyfcstaff;

import java.util.Scanner;
public class TestMyFCStaff {

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
        fc.displaySalary();
    }
}

 class MyFCStaff {
    private String name,staffID;
    private int hourWorks;
    private double sales,salary,commission,totalSales,totalSalary;
   
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
        
    public void displaySalary(){
        System.out.println("-----Staff-------");
        System.out.println("Staff Name : " + name);
        System.out.println("StaffID : " + staffID);
        System.out.println("Hours Work : " + hourWorks);
        System.out.println("Total sales : " + "RM" + sales);
        System.out.println("Total Salary : " + "RM" + calculateSalary());
        System.out.println("------------------");
        
    }
}
