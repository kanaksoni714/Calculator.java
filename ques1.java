import java.util.Scanner;
class Square
	{
		static double result=0;
		static double squareNumber(double numberOne) 
		{
		return numberOne*numberOne;
		}
	 	
public static void main(String args[])
	 	{
 		
      		System.out.println("Enter Supplied ");
      		Scanner in = new Scanner(System.in);
		
     		double numberOne = in.nextDouble();
		
		squareNumber(numberOne);
		
 
		System.out.println("Square is" +squareNumber(numberOne));
		
		}
	}