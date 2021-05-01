package kodlamaio;

public class Instructor extends User {
	private String description;
	
	public Instructor() {
		
	}

	public Instructor(int id, String email, String firstName, String lastName, String password,String description) {
		super();
		this.setId(id);
		this.setEmail(email);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPassword(password);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
