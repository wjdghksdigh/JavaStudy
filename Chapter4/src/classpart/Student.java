package classpart;

public class Student {

			int studentID;
			String studentName;
			int grade;
			String address;
			
			//public student() {} 가 생성자 (생략가능)
			
			public Student() {}//but new생성자를 만들경우에는 불가능
			
			public Student(int id,String name) {
				studentID = id;
				studentName = name;//생성자를 직접 만들었다
				
			}
			public void showStudentInfor() {
				System.out.println(studentName + "," + studentID);
			
		}
			
			public String getStudentName() {
				return studentName;
			}
			
			public void setStudentname(String name) {
				studentName = name;
			}
			
			public static void main(String[] args) {
				
				Student studentLee = new Student();
				studentLee./*참조변수*/studentName = "이순신";
				studentLee.studentID = 100; 
		
				
				Student studentKim = new Student();
				studentKim./*참조변수*/studentName = "김순신";
				studentKim.studentID = 101;
				
				studentLee.showStudentInfor();
				studentKim.showStudentInfor();
				
				
				
				
			
	}

}
