package testtriangle;
/**
 *
 * @author nurul annesa
 */
import java.util.Scanner;
public class TestTriangle {

        public static void main(String[] args) {
        
        double height,base;
        Scanner in = new Scanner (System.in);
      
        System.out.println("Enter the height:");
        height = in.nextDouble();
        System.out.println("Enter the base:"); 
        base = in.nextDouble();
      
        Triangle t = new Triangle ();
        t.set(height,base);
        t.calculateArea();
        t.displayTotalArea();
      }
  }
  
  
  class Triangle {
    
         private double height;
         private double base;
         private double totalArea;

         // The setHeight method accepts an argument which is    
         //stored in the height field.

      public void setHeight(double len){
          height = len;
      }

      // The setBase method accepts an argument which is 
      //stored in the base field. 
    
      public void setBase(double b){
          base = b;
      }

      //The set method accepts two arguments which are 
      //stored in the height and base fields.
  
      public void set(double len, double b){
          height = len;
          base = b;
      }

      // The getHeight method returns the value stored in the 
      //  height field.

      public double getHeight(){
          return height;
      }

      // The getBase method returns the value stored in the   
      //base field

      public double getBase(){
          return base;
      }

      // The getArea method returns the value of area
      // with formula : 0.5 * height * base

      public void calculateArea(){
          totalArea = 0.5 * height * base;
      }

       public double getArea(){
          return totalArea;
      }
      
      public void displayTotalArea(){
         System.out.println("Area of triangle:" + totalArea);
      } 
}

    
   
       
   
