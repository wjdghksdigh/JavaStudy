package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 30;
		
		int sum = addNum(num1, num2);
		System.out.println(sum);
	}
		//함수 선언 반환타입, 함수이름, 매게변수 함수를 정의한다
 	public static int addNum(int n1,int n2) {
 		//매게 변수 이름은 상관이 없다!
		int result = n1 + n2;
		return result;
	}

}
