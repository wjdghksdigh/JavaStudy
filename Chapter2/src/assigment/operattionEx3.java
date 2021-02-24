package assigment;

public class operattionEx3 {

	public static void main(String[] args) {

		int num1 = 10;
		int i =2;
		/*앞의 논리연산자가 값이 거짓이므로
		  뒤의 논리연산자는 계산 되지 않는다
		  논리 곱 : 앞의 값이 거짓이면 뒤의항은 평가x
		 */
		/*
		 but 논리 합의 경우 두항이 모두 거짓일 경우에만 거짓
		 앞의 항이 거짓이여도 뒤의 항이 참이면 평가o
		 */
		 
		boolean value = ((num1 = num1 + 10) <10) && ((i = i+2) >10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}

}
