package Practice1;

import java.util.*;
public class Practice1 {

	public static void main(String[] args) {
		//�迭�̿��Ͽ� �������ϱ�
		
		final int student = 5;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		int[] scores = new int[student];
		
		for(int i = 0;i < scores.length;i++) {
			System.out.println("������ �Է��Ͻÿ� : ");
			scores[i] = scan.nextInt();
		}
		for(int i = 0;i < scores.length;i++) {
			total += scores[i];
		}
				
			System.out.println("��ռ�����" + total / student + "�Դϴ�");
			
		}	
	}