public class DigitNumbers{
public static void main(String []args){
String stringNumber = "2018";
int sumDigit = 0;
String stringNum="";
for (int i = 0; i<stringNumber.length(); i++){
System.out.println(stringNumber.charAt(i));
stringNum = String.valueOf(stringNumber.charAt(i));
sumDigit += Integer.parseInt(stringNum);
}
System.out.println("Sum of the digits is" +sumDigit);
}
}