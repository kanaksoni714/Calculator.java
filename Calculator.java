import java.util.Scanner;
class Calculator {

	static double addNumbers(double numberOne, double numberTwo) {
		return numberOne+numberTwo;
	}
	static double subtractNumber(double numberOne, double numberTwo) {
		return numberOne-numberTwo;
	}
	static double multiplyNumber(double numberOne, double numberTwo) {
		return numberOne*numberTwo;
	}
	static double divideNumber(double numberOne, double numberTwo) {
		return numberOne/numberTwo;
	}
	public static void main(String args[]) {
		int Ans;
 
      		System.out.println("Enter two integers to calculate their sum");
      		Scanner in = new Scanner(System.in);
     
     		double numberOne = in.nextDouble();
      		double numberTwo = in.nextDouble();
		addNumbers(numberOne,numberTwo);
		subtractNumber(numberOne,numberTwo);
		multiplyNumber(numberOne,numberTwo);
		divideNumber(numberOne,numberTwo);
		System.out.println("add Answer is = " + addNumbers(numberOne,numberTwo));
		System.out.println("subtract Answer  is = " + subtractNumber(numberOne,numberTwo));
		System.out.println("multiply Answer is = " + multiplyNumber(numberOne,numberTwo));
		System.out.println("divide Answer is = " + divideNumber(numberOne,numberTwo));
		
	}
}