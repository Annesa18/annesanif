import java.text.SimpleDateFormat; 
import java.util.Date;
public class Date{ //to show class Date
public static void main(String[] args){ //main method
Date date = new Date();  //to create object
String SimpleDateFormat; // declaring SimpleDateFormat is String
SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy"); 
String strDate = formatter.format(date);   
System.out.println(strDate); 
System.out.println(" ");
SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");
System.out.println(f.format(new Date())); // display new date 
}  
} 
    
