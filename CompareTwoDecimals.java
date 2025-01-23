

public class CompareTwoDecimals {

	public static void main(String[] args) {
		float n=12.4589f;
		n=(int)(n*100);//1245.89
		int m=(int)(n%100);
		int r=m%100;
		System.out.println(r);
		

	}

}
