import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Date {

    public static void main(String[] args) {
    	Scanner inputReg = new Scanner(System.in);

        System.out.print("Enter Date of Birth (DD/MM/YYYY): ");

        java.util.Date theDate = null;
        try {
            theDate = new SimpleDateFormat("ddMMyyyy").parse(inputReg.nextLine().replaceAll("/", ""));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(theDate);
        inputReg.close();
    }

}
