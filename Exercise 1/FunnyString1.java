import java.util.Scanner;
public class FunnyString1{ //to show class is Funny String
static Scanner scan = new Scanner(System.in); //using scanner 
public static void main(String []args){ //main method
String colour,food,animal,nameFriends; //declaring colour,food,animal,name friends are string

System.out.print("Enter your colour:" );
colour=scan.nextLine(); //to input data
System.out.println("colour:"+ colour); //to display input 
System.out.print("Enter your food:");
food=scan.nextLine(); //to input data
System.out.println("food:"+ food); //to display input 
System.out.print("Enter your animal:");
animal=scan.nextLine();//to input data
System.out.println("animal:"+ animal); //to display input 
System.out.print("Enter your first name of friends:");
nameFriends=scan.nextLine(); //to input data
System.out.println("nameFriends:"+ nameFriends); //to display input 
scan.close();

System.out.print( "I had a dream that" +" "+ nameFriends +" " + "ate a" + " " + colour +" " + animal 
                 +" " + "and said it tasted liked" + " " + food + "!");
}
}




