package classpart;

public class Student {

			int studentID;
			String studentName;
			int grade;
			String address;
			
			//public student() {} �� ������ (��������)
			
			public Student() {}//but new�����ڸ� �����쿡�� �Ұ���
			
			public Student(int id,String name) {
				studentID = id;
				studentName = name;//�����ڸ� ���� �������
				
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
				studentLee./*��������*/studentName = "�̼���";
				studentLee.studentID = 100; 
		
				
				Student studentKim = new Student();
				studentKim./*��������*/studentName = "�����";
				studentKim.studentID = 101;
				
				studentLee.showStudentInfor();
				studentKim.showStudentInfor();
				
				
				
				
			
	}

}
