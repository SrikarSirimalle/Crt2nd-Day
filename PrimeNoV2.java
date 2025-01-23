

public class PrimeNoV2 {

	public static void main(String[] args) {
		int n=13,r;
		boolean isprime=true;
		
		for(int i=2;i<n;i++) {
			r=n%i;
			if(r==0)isprime=false;
			
		}
		if(isprime==true)System.out.println("yes");//if(i==n/2)
		else System.out.println("no");
		
	}

}
