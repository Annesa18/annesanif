 public class PrintReverse   {    
    public static void main(String[] args) {     
        String string = "Welcome back";//Stores the reverse of given string    
        String reversedStr = ""; //declare reversedstr is string   
            
        //Iterate through the string from last and add each character to variable reversedStr    
        for(int i = string.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + string.charAt(i);    
        }    
            
        System.out.println("string: " + string); //Displays the reverse of given string    
        System.out.println("Reverse: " + reversedStr);// convert to reverse    
    }    
}    
