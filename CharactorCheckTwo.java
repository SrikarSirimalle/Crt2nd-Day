
import java.util.Scanner;
public class CharactorCheckTwo {

	public static void main(String[] args) {
		char ch;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the character");
		ch=input.next().charAt(0);
		if((ch>='A' && ch<='Z')||(ch>='a'&&ch<='z')){
			System.out.println("Alphabet");
			
		}
		else if(ch>='0'&&ch<='9') {
			System.out.println("digit");
			
		}
		else {
			System.out.println("spl charactor!!!!");
			
		}
System.out.println("Math.round(1.349765)---->"+Math.round(999.649765));
	}

}