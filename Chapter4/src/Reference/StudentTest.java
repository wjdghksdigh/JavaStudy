package Reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentJames = new Student(100,"james");
		studentJames.setkorea("����",100);
		studentJames.setMath("����",100);
		
		Student studentTomas = new Student(101,"Tomas");
		studentTomas.setkorea("����",80);
		studentTomas.setMath("����",60);
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();
		
	}

}
