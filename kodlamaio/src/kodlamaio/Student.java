package kodlamaio;

public class Student extends User {
	private int progress;
	
	
	public Student() {
	
	}


	public Student(int id, String email, String firstName, String lastName, String password,int progress) {
		super();
		this.setId(id);
		this.setEmail(email);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPassword(password);
		this.progress = progress;
	}


	public int getProgress() {
		return progress;
	}


	public void setProgress(int progress) {
		this.progress = progress;
	}
}

