package kodlamaio;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " adlý kullanýcý eklendi.");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() + " adlý kullanýcý güncellendi.");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + " adlý kullanýcý silindi.");
	}
	public void login(User user) {
		System.out.println(user.getFirstName() + " adlý kullanýcý giriþ yaptý.");
	}
	public void logout(User user) {
		System.out.println(user.getFirstName() + " adlý kullanýcý çýkýþ yaptý.");
	}
	public void getAll() {
		System.out.println("Kullanýcýlar listelendi.");
	}
}
