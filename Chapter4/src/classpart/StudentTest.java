package classpart;

public class StudentTest {


	public static void main(String[] args) {
		
	Student studentLee = new Student();
	studentLee./*��������*/studentName = "�̼���";
	studentLee.studentID = 100; 

		
	Student studentKim = new Student();
	studentKim./*��������*/studentName = "�����";
	studentKim.studentID = 101;
		
	studentLee.showStudentInfor();
	studentKim.showStudentInfor();
	
	
	System.out.println(studentLee);
	System.out.println(studentKim);
	}
}
