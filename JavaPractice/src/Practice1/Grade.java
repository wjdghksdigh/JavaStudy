
package Practice1;

import java.util.Scanner;
public class Grade {
	
	public static void main(String[] args) {
		
		int eng; 
		int math;
		int kor;
		float ave;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("��������, ��������, ���������� �Է��Ͻÿ�");
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt();
		int total = kor+eng+math;
		double avg = total/3.0;
		
		char score = 'A';
		ave = total/3;
		System.out.println("�����" + ave + "�Դϴ�.");
		
		if(ave >= 90) {
			
			score = 'A';
		}
		
		
		
		else if(ave >= 80) {
			
			score = 'B'; 
		}
		
		else if(ave >= 70) {
			
			score = 'C';
		}
		
		else if(ave >= 60) {
			
			score = 'd';
		}
		else {
			
			score = 'F';
		}
			
		System.out.println("������ " + total);
		System.out.println("����� " + avg);
		System.out.println("������ " + score);
		

			
			Student studentLee = new Student();
			StudentLee.eng = "80";
			
		
		
	}
}
