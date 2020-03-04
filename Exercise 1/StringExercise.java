// **************************************************
// StringExercise.java
//
// Play with String objects
// **************************************************
public class StringExercise//to show class is string Exercise
{
public static void main (String[] args)//main method
{
String college = new String ("College of Arts and Sciences");//create new reference variable by object 1
String town = "UUM Sintok"; // part (a) create other variable by object 2
int stringLength;//declaring stringLength
String change1, change2, change3;//declaring chang1,2,3
stringLength = college.length(); // part (b) stringLength method
System.out.println (college + " contains " + stringLength + "characters.");
change1 = college.toUpperCase(); // part (c) string toUpperCase method
System.out.println ("The string is all in upper case: " + change1);
change2 = change1.replace("O","*"); // part (d) string replace method
System.out.println ("All capital O's are replaced with the asterisk character: " + change2);
change3 =college.concat(town); // part (e) string concat method
System.out.println ("The final string is " + change3);
}
}