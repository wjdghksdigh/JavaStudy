package Reference;

public class Student {

	int studentID;
	String studentName;

	Subject korea;
	Subject Math;
	
	public Student() {
		korea = new Subject();
		Math = new Subject();
		}
	
	public Student(int id, String name) {
		
		studentID = id;
		studentName = name;
		
		korea = new Subject();
		Math = new Subject();
		}
	
	public void setkorea(String name, int score) {
		
		korea.setSubjectName(name);
		korea.setScore(score);
	}
		
	public void setMath(String name, int score) {
			
		Math.setSubjectName(name);
		Math.setScore(score);
	}
		public void showStudentInfo() {
			
			int total = korea.getScore() + Math.getScore();
			System.out.println(studentName + "학생의 총점은" + total + "점 입니다.");
		}
		
	}
