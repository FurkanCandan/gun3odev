package gün3ödev;

public class UserManager {
	
	
	public void add (User user) {
		System.out.println("Kullanýcý Eklendi: " + user.getFirstName() + " " + user.getLastName());
	}
	
	public void delete (User user) {
		System.out.println("Kullanýcý Silindi: " + user.getFirstName() + " " + user.getLastName());
	}

}
