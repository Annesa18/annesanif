public class CubesAndSquares{ // class name
public static void main (String []args){ // main method
		int num =0; //declare num is int and variable is 0.
		int square =0; //declare square is int and variable is 0.
		int cube =0; //declare cube is int and variable is 0.
		
		
		System.out.printf("Number\tSquare\tCube\n");  //display number,square, cube
      for(int i=0; i<=10; i++) //using for looping number
		{
			square= num*num;  // calculation for square
			cube= num*square; // calculation for cube
			System.out.printf("%4d%8d%9d\n", num, square, cube); //display number,square,cube
			num++;
		}
	}
   }




/*b)	System.out.printf("%-8d%8s%8.2f", 3432, "Aina", 3.8);

/*int num;
int square;
int cube;

System.out.println("Number\tSquare\tCube");
System.out.printf(""
for (num=1; num<10; num++){

square = num*num;
cube = num*square;
System.out.println(num+"\t"+square+"\t"+cube);*/
