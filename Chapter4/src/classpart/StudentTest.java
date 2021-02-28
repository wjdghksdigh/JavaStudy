package classpart;

public class StudentTest {


	public static void main(String[] args) {
		
	Student studentLee = new Student();
	studentLee./*참조변수*/studentName = "이순신";
	studentLee.studentID = 100; 

		
	Student studentKim = new Student();
	studentKim./*참조변수*/studentName = "김순신";
	studentKim.studentID = 101;
		
	studentLee.showStudentInfor();
	studentKim.showStudentInfor();
	
	
	System.out.println(studentLee);
	System.out.println(studentKim);
	}
}
