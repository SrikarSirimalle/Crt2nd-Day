
import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {
		char ch;
		ch='A';
		Scanner sc=new Scanner(System.in);
		char cod;
		do {
			System.out.println("please enter a char");
		ch = sc.next().charAt(0);
		if((ch>='A')&&(ch<='Z')) {
			System.out.println("ch is upper case");
			
		}
		else if((ch>='a')&&(ch<='z')) {
			
			System.out.println("lower case");
		}
		
		System.out.println("ch---->"+ch);
		System.out.println("do you want to repeat/if yes press y or n");
		cod=sc.next().charAt(0);
		}while(cod=='y');// while(cod!='n');
		System.out.println("ends");
		
		
	}

}
