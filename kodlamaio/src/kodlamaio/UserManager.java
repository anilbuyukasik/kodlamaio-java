package kodlamaio;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " adl� kullan�c� eklendi.");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() + " adl� kullan�c� g�ncellendi.");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + " adl� kullan�c� silindi.");
	}
	public void login(User user) {
		System.out.println(user.getFirstName() + " adl� kullan�c� giri� yapt�.");
	}
	public void logout(User user) {
		System.out.println(user.getFirstName() + " adl� kullan�c� ��k�� yapt�.");
	}
	public void getAll() {
		System.out.println("Kullan�c�lar listelendi.");
	}
}
