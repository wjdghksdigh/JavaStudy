package first;

public class explicitconversion {

	public static void main(String[] args) {

		int inum = 1000;
		byte bnum = (byte)inum;
		
		System.out.println(inum);
		System.out.println(bnum);
		
		double dnum =3.14;
		inum = (int)dnum;
		System.out.println(inum);
		float fnum = 0.9F;
		
		int num1 =(int)dnum + (int)fnum;
		//�Ǽ��� ������ 3+0
		int num2 = (int)(dnum + fnum);
		//�Ǽ��� ���� ���� 3.14+0.9=4.4.01
		//int������ ��ȯ�߱⿡ ���� 4

		
		System.out.println(num1);
		System.out.println(num2);
	}

}
