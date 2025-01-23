

public class MathRoundDemo {

	public static void main(String[] args) {
		System.out.println("math.round(1.349765)--->"+Math.round(1.349765));
		float num=999.349765f;
		int m=(int)(num*10);
		int r=m%10;
		m=m/10;
		if(r>5) {
			
			m=m+1;
			
		}
		System.out.println(m);
		

	}

}
