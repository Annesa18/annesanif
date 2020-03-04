import java.text.SimpleDateFormat;
import java.util.Date;
public class Question3{  
public static void main(String[] args){
Date date = new Date();  
String SimpleDateFormat;
SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy");
String strDate = formatter.format(date);   
System.out.println(strDate); 
System.out.println(" ");
SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");
System.out.println(f.format(new Date()));
}  
} 
    
