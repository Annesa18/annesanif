import java.util.Scanner;
public class StaffIncomeReport{
 public static void main (String []args){
 
   String name,id,incomeType;
   double amount,tax;
   Scanner sc = new Scanner (System.in);
   
   System.out.println("Enter your name:");
   name = sc.next();
   System.out.println("Enter your ID:");
   id = sc.next();
   System.out.println("Enter your Income Type:");
   incomeType = sc.next();
   System.out.println("Enter your income Amount:");
   amount = sc.nextDouble();
   System.out.println("Enter your income Tax percentage:");
   tax = sc.nextDouble();
   
   //called income
   Income income = new Income (incomeType,amount,tax);
   //called staff
   Staff info = new Staff (name,id,income);
   
   //display output info
   info.displayStaffInfo();
   info.displayIncomeInfo();
   }
   
   }//end main
   
   class Staff{
      private String name,id;
      private Income income;
      
      public Staff(String name,String id,Income income){
         this.name= name;
         this.id = id;
         this.income = income;
         }
         
      public String getName(){
         return name;
         }
      
      public String getId(){
         return id;
         }
         
      public double calculateNetIncome(){
         return income.getAmount() - income.getTotalTax();
         }
            
      public void displayStaffInfo(){
         System.out.println("---Staff Info---");
         System.out.println("Name: " + name);
         System.out.println("ID: " + id);
         System.out.println("-----------------");
         }
         
      public void displayIncomeInfo(){
         System.out.println("---Income Info---");
         System.out.println("Income Type: " + income.getIncomeType());
         System.out.println("Income Amount: " + income.getAmount());
         System.out.println("Tax: " + income.getTax() + "%");
         System.out.println("Total Tax Paid: " + "RM" + income.getTotalTax());
         System.out.println("Total Net Income: " + calculateNetIncome());
         System.out.println("-----------------");
         }
      
      }//end class staff
      
   class Income{
      private String incomeType;
      private double amount,tax,totalTax;
      
      public Income (String incomeType,double amount,double tax){
            this.incomeType = incomeType;
            this.amount = amount;
            this.tax = tax;
            }
            
      public String getIncomeType(){
         return incomeType;
         }
         
      public double getAmount(){
         return amount;
         }
         
      public double getTax(){
         return tax;
         }
         
      public double getTotalTax(){
         totalTax =(tax/100) * amount;
         return totalTax;
         }
    }//end class income
      
         
      
     
         
      
      
       
   
 
   