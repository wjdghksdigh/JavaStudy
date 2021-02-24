package first;

public class implicitConversion {

	public static void main(String[] args) {

		byte bnum = 10;
		int num = bnum;
		
		System.out.println(num);
		
		long lnum = 10;
		float fnum = lnum; // float 더정밀한 수
		
		System.out.println(fnum);
		
		double dnum = fnum + num;
		System.out.println(dnum);
	}

}
