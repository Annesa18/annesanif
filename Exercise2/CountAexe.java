import java.util.Scanner;
public class CountAexe{
    public static void main (String []args){

    Scanner in = new Scanner (System.in);
    String str;
    int count =0;

    System.out.println("Enter the string:");
    str= in.nextLine();

    for (int i=0; i<str.length();i++){
        if (str.charAt(i)=='A'){
        count++;
        }
    }
    System.out.println("Count of A is found:" + count);
    }
}    
