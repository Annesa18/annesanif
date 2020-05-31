package Jewellery;

public class Ring extends Jewellery {
    
    String type;
    
    //using getter method
    public String getType(int category) {
        switch (category) {
            case 1:
                System.out.println("Engaged ring");
                break;
            case 2:
                System.out.println("Couple ring");
                break;
            default:
                System.out.println("Wedding ring");
                break;
        }
          return type;
    }
    
    @Override 
   public void display(){
       System.out.println("wearing on finger.");
   }
   // overloading
   public void user(char c){
       System.out.println("mostly use by female.");
   }
   //overloading
   public void user(int y, int z){
       System.out.println("use by female and male.");
   }
   
}
