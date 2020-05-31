package Jewellery;

public class Bracelet extends Jewellery{
        
    String shape;
    
    //using setter method
    public void setShape(){
      System.out.println("diamond");
   }
   
   @Override 
   public void display(){
       System.out.println("wearing on pergelangan tangan");
   }
   //overloading
   public void disp(char c){
       System.out.println("name shape");
   }
   //overloading
   public void disp(char c, int a){
       System.out.println("as a gift");
   }
}
