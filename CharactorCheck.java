
import java.util.Scanner;
//write a program to input any character and check
//whether it is alphabet,
//digit or special character

public class CharactorCheck {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);		      
		        System.out.print("Enter any character: ");
		        char ch = scanner.next().charAt(0);		        
		        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
		            System.out.println(ch + " is an alphabet.");
		        }
		        else if (ch >= '0' && ch <= '9') {
		            System.out.println(ch + " is a digit.");
		        }		       
		        else {
		            System.out.println(ch + " is a special character.");
		        }
		        scanner.close();
		    }
	}