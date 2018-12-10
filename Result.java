import java.util.Scanner;
public class Result {
	public static void main(String args[]){
		System.out.println("Enter Marks of All Three Subject:");
		Scanner in = new Scanner(System.in);
	     
 		double subjectOne = in.nextDouble();
 		double subjectTwo = in.nextDouble();
 		double subjectThree = in.nextDouble();
 		if (subjectOne+subjectTwo+subjectThree< 60)
 		{
 	         System.out.println("Student Fails");
 	      	}
 	      else {
 	         System.out.println("Student is Promoted");
 	      }
	}

}
