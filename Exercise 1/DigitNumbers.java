public class DigitNumbers{ //to show digit numbers class
public static void main (String []args){ //main method

String strNum = "2018";// declare strNum is string and value is 2018
int sum = 0;//declare sum is int and value is 0
String StringNum;//declare num is string

for (int i=0;i<strNum.length();i++){
     System.out.println(strNum.charAt(i));
     StringNum = String.valueOf(strNum.charAt(i));
     sum = sum + Integer.parseInt(StringNum);
     }
     /*char result = college.charAt(i);
      System.out.println(result);*/
//display total sum digit numbers     
System.out.println("Total digit number is :" + " " + sum);

}//end main method
}//end class
    
