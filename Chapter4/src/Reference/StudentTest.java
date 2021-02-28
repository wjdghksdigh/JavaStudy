package Reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentJames = new Student(100,"james");
		studentJames.setkorea("국어",100);
		studentJames.setMath("수학",100);
		
		Student studentTomas = new Student(101,"Tomas");
		studentTomas.setkorea("국어",80);
		studentTomas.setMath("수학",60);
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();
		
	}

}
