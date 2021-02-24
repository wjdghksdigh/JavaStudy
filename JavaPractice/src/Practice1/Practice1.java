package Practice1;

import java.util.*;
public class Practice1 {

	public static void main(String[] args) {
		//배열이용하여 성적구하기
		
		final int student = 5;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		int[] scores = new int[student];
		
		for(int i = 0;i < scores.length;i++) {
			System.out.println("성적을 입력하시오 : ");
			scores[i] = scan.nextInt();
		}
		for(int i = 0;i < scores.length;i++) {
			total += scores[i];
		}
				
			System.out.println("평균성적은" + total / student + "입니다");
			
		}	
	}