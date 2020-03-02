import java.util.Scanner;
public class FormatDate{
public static void main (String []args){
Scanner In = new Scanner (System.in);
String Date =In.next();
String newDateFormat = Date.replaceAll("/","."); 
System.out.println("The final String is : " + newDateFormat);
}
} 
