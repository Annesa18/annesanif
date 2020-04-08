public class CubesAndSquares{ 
	public static void main (String []args){ // main method
		int num =0; 
		int square =0;
		int cube =0; 
		
		
		System.out.printf("Number\tSquare\tCube\n");  
      		for(int i=0; i<=10; i++) {
			square= num*num;  // calculation for square
			cube= num*square; // calculation for cube
			System.out.printf("%4d%8d%9d\n", num, square, cube); 
			num++;
		}
	}
   }
