
package Practice1;

import java.util.Scanner;
public class Grade {
	
	public static void main(String[] args) {
		
		int eng; 
		int math;
		int kor;
		float ave;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수, 영어점수, 수학점수를 입력하시오");
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt();
		int total = kor+eng+math;
		double avg = total/3.0;
		
		char score = 'A';
		ave = total/3;
		System.out.println("평균은" + ave + "입니다.");
		
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
			
		System.out.println("총점은 " + total);
		System.out.println("평균은 " + avg);
		System.out.println("학점은 " + score);
		

			
			Student studentLee = new Student();
			StudentLee.eng = "80";
			
		
		
	}
}
