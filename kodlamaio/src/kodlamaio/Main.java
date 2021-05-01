package kodlamaio;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1,"buyukasik.anil@gmail.com","An�l","B�y�ka��k","123456",54);
		Instructor instructor = new Instructor(1,"engindemirog@gmail.com","Engin","Demiro�","111222","Java & React, C# & Angular");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.doHomework();
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor);
		instructorManager.createHomework();

	}

}
