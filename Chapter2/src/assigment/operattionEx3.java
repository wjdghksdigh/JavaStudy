package assigment;

public class operattionEx3 {

	public static void main(String[] args) {

		int num1 = 10;
		int i =2;
		/*���� �������ڰ� ���� �����̹Ƿ�
		  ���� �������ڴ� ��� ���� �ʴ´�
		  �� �� : ���� ���� �����̸� �������� ��x
		 */
		/*
		 but �� ���� ��� ������ ��� ������ ��쿡�� ����
		 ���� ���� �����̿��� ���� ���� ���̸� ��o
		 */
		 
		boolean value = ((num1 = num1 + 10) <10) && ((i = i+2) >10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
