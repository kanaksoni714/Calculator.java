import java.util.Scanner;
public class CUI {

public static void main(String[] args) 
{
	int i=1;  
    while(i<=3)
    {
    Scanner input = new Scanner(System.in);

    String username;
    String password;

    System.out.println("Log in Your CUI Deatils");
    System.out.println("username: ");
    username = input.next();

    System.out.println("password: ");
    password = input.next();

    //users check = new users(username, password);//

    if(username.equals("alpha") && password.equals("alpha123")) {
        System.out.println("You are logged in");
    }
    
    else{
    	i--;
    System.out.println("Try Again");
    }

    }
    System.out.println("ContactAdmin");

}

}