package employeepayrolldemo;

import java.util.Scanner;
public class EmployeePayrollDemo {
    public static void main(String[] args) {
        
        String idNum;
        double grossPay,fedTax,stateTax;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the employee's ID Number:");
        idNum = input.nextLine();
        System.out.print("Enter the employee's gross pay:" + "RM");
        grossPay = input.nextDouble();
        System.out.print("Enter the Federal Tax:");
        fedTax = input.nextDouble();
        System.out.print("Enter the State Tax:");
        stateTax = input.nextDouble();
        //create object
        Employee e = new Employee();
        //display output
        e.Employee(idNum,fedTax,stateTax,grossPay);
        e.calculateNetPay();
        e.printOutput();
    }
    
}

class Employee {
    
    private String idNum;
    private double grossPay,fedTax,stateTax;
    private double tFedTax,tStateTax,totalNetPay;
        
    public void Employee (String idNum ,double fedTax,double stateTax,double gPay){
        this.idNum =idNum;
        this.fedTax = fedTax;
        this.stateTax = stateTax;
        grossPay = gPay;
        
    }
    public String getIdNum (){
        return idNum;
    }
    
    public double getGrossPay(){
        return grossPay;
    }
    
    public double getfederalTax(){
        return fedTax;
    }
    
    public double stateTax(){
        return stateTax;
    }
    
    public void calculateNetPay(){
        tFedTax = grossPay * fedTax;
        tStateTax = grossPay * stateTax;
        totalNetPay = grossPay - (tFedTax+ tStateTax);
    }
    
    public double getTotalNetPay(){
        return totalNetPay;
    }
    
    public void printOutput(){
        System.out.println(" ");
        System.out.println("*******EMPLOYEE INFO*********");
        System.out.println("Employee ID Number:" + idNum);
        System.out.println("Gross pay:"+ "RM" + grossPay);
        System.out.println("Federal tax:" + "RM" + tFedTax);
        System.out.println("State tax:" + "RM" + tStateTax);
        System.out.println("Net pay:" +"RM"+ totalNetPay);
        System.out.println("****************************");
        
    }
}

 class EmployeePayroll {

    private String idNum;
    private double grossPay,fedTax,stateTax;
    private double tFedTax,tStateTax,totalNetPay;
    
    public void calculateNetPay(){
        
        totalNetPay = grossPay - (tFedTax+ tStateTax);
    }
    
    public double getTotalNetPay(){
        return totalNetPay;
    }
    
    public void printOutput(){
        System.out.println(" ");
        System.out.println("*******EMPLOYEE INFO*********");
        System.out.println("Employee ID Number:" + idNum);
        System.out.println("Gross pay:" + "RM" + grossPay);
        System.out.println("Federal tax:" + "RM"  + tFedTax);
        System.out.println("State tax:" + "RM" + tStateTax);
        System.out.println("Net pay:" + "RM" + totalNetPay);
        System.out.println("****************************");
    }
}


