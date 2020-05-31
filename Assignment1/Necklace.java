package Jewellery;

public class Necklace extends Jewellery {

    private int price;
    
    //constructor
    public void Necklace(int p){
        p = price;
    }
       
    //using getter method
   public int getPrice(int amount){
      if (amount <= 3999){
         System.out.println("Expensive");
      }
      
      else if(amount >= 4000 && amount <= 9000){
         System.out.println("More Expensive");
      }
      
         else {
         System.out.println("Most Expensive");
      }
      amount = price;
      return price;
   }
   
   @Override 
   public void display(){
       System.out.println("wearing on neck");
   }
   
   
}
